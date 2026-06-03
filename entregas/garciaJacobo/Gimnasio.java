package entregas.garciaJacobo;

public class Gimnasio {
    private Console console;
    private String nombre; // cambio en el nombre del atributo
    private Actividades[] actividades; // se crea un array de objetos de tipo actividad

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        console = new Console();
        this.actividades = new Actividades[3]; // se reserva espacio para tres actividades y se incializan dichas
                                               // actividades
        this.actividades[0] = new Actividades("Yoga", "Elena Ruiz", 5);

        this.actividades[1] = new Actividades("Pilates", "Ana López", 8);

        this.actividades[2] = new Actividades("Spinning", "Carlos Pérez", 10);
    }

    public String obtenerNombre() { // cambio en el nombre del metodo
        return this.nombre;
    }

    public void mostrarNombre() { // cambio en el nombre
        console.writeln("Gimnasio: " + this.nombre);
    }

    public void mostrarActividades() { // feat se agrega logica para mostrar las actividades del gimansio
        for (int i = 0; i < this.actividades.length; i++) {
            console.writeln(
                    (i + 1) + ". "
                            + this.actividades[i].obtenerNombre());
        }
    }

    public Actividades escogerActividad() {  // se implementa la logica de escogerActividad 

        int opcion = this.console.readInt("Seleccione actividad:");

        return this.actividades[opcion - 1];
    }
}
