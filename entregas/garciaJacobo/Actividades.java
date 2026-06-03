package entregas.garciaJacobo;

public class Actividades {

    private String nombre; // cambio del nombre atributo
    private String monitor;
    private int aforo;
    private int inscritos;
    private Horario horario; // se añade atributo de horario

    public Actividades(String actividad, String monitor, int aforo, Horario horario) { // se añade horario al
                                                                                       // constructor
        this.nombre = actividad;
        this.monitor = monitor;
        this.aforo = aforo;
        this.inscritos = 0;
        this.horario = horario;
    }

    public boolean reservarPlaza() {// se añade este metodo para que al reservar una plaza el aforo baje
        if (this.estaLlena()) {
            return false;
        }

        this.inscritos++;
        return true;
    }

    public Horario obtenerHorario() { // se añade geter horario
        return this.horario;
    }

    private boolean estaLlena() {
        return this.inscritos >= this.aforo;
    }

    private int calcularPlazasLibres() {
        return this.aforo - this.inscritos;
    }

    public String obtenerNombre() { // cambio nombre
        return this.nombre
                + (this.estaLlena() ? " (AFORO COMPLETO)" : " (Libres: " + this.calcularPlazasLibres() + ")");
    }

    public void mostrarAforo() {
        Console console = new Console();
        console.writeln(" [Aforo: " + this.aforo + " | Libres: " + this.calcularPlazasLibres() + "]");
    }

}
