package vistas.Intervalo;

class Intervalo {
    private double superior;
    private double inferior;

    public Intervalo(double inferior, double superior) {
        assert inferior <= superior : "hey! el inferior debe ser menor que el superior";
        this.inferior = inferior;
        this.superior = superior;
    }

    public Intervalo(double superior) {
        this(0, superior);
    }

    public Intervalo() {
        this(0, 0);
    }

    public Intervalo(Intervalo intervalo) {
        this(intervalo.inferior, intervalo.superior);
    }

    public Intervalo clone() {
        return new Intervalo(this);

    }

    public double longitud() {
        return superior - inferior;
    }

    public void desplazar(double desplazamiento) {
        inferior = inferior + desplazamiento;
        superior = superior + desplazamiento;
    }

    public Intervalo desplazado(double desplazamiento) {

        Intervalo intervalo = this.clone();
        intervalo.desplazar(desplazamiento);
        return intervalo;
    }

    public boolean incluye(double punto) {
        return this.inferior <= punto && punto <= this.superior;
    }

    public boolean incluye(Intervalo intervalo) {
        assert intervalo != null;

        return this.incluye(intervalo.inferior) && this.incluye(intervalo.superior);
    }

    public boolean equals(Intervalo intervalo) {

        return this.inferior == intervalo.inferior && this.superior == intervalo.superior;
    }

    public Intervalo interseccion(Intervalo intervalo) {
        if (this.incluye(intervalo)) {
            return intervalo.clone();
        } else if (intervalo.incluye(this)) {
            return this.clone();
        } else if (this.incluye(intervalo.inferior)) {
            return new Intervalo(intervalo.inferior, superior);
        } else {
            return new Intervalo(inferior, intervalo.superior);
        }

    }

    public boolean intersecta(Intervalo intervalo) {
        return this.incluye(intervalo.inferior) || this.incluye(intervalo.superior);
    }

    public void oponer() {
        double superiorTemporal=superior;

        superior=-inferior;
        inferior=-superiorTemporal;
    }

    public void doblar() {
     double longitudInicial=this.longitud();
     inferior=inferior-longitudInicial/2;
     superior=superior+longitudInicial/2;
    }

    public void mostrar() {
        console.writeln(inferior+","+superior);
    }

    public void recoger() {

    }

    public Intervalo[] trocear(int numeroTrozos) {

    }

    public Intervalo union(Intervalo intervalo) {

    }

    public double puntoMedio() {

    };

}