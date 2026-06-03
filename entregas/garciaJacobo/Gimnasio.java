package entregas.garciaJacobo;

public class Gimnasio {
    private Console console;
    private String nombre; // cambio en el nombre del atributo
    private Actividades[] actividades; // se crea un array de objetos de tipo actividad
    private Socios[] socios;// se crea un array de objetos de tipo socios para ir dando altas
    private int totalSocios;
    private final int MAXIMOS_SOCIOS = 100;

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        console = new Console();
        this.actividades = new Actividades[3]; // se reserva espacio para tres actividades y se incializan dichas
                                               // actividades
        this.actividades[0] = new Actividades("Yoga", "Elena Ruiz", 5);

        this.actividades[1] = new Actividades("Pilates", "Ana López", 8);

        this.actividades[2] = new Actividades("Spinning", "Carlos Pérez", 10);

        this.socios = new Socios[MAXIMOS_SOCIOS];
        this.totalSocios = 0;
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

    public void agregarSocio(Socios socio) { // se agrega metodo y su logica para poder guardar lo socios del gimnasio
        this.socios[this.totalSocios] = socio;

        this.totalSocios++;

    }

    public Actividades escogerActividad() { // se implementa la logica de escogerActividad

        int opcion = this.console.readInt("Seleccione actividad:");

        return this.actividades[opcion - 1];
    }

    public void mostrarSocios() {
        for (int i = 0; i < this.totalSocios; i++) { // SE AGREGA METODO MOSTRAR SOCIOS
            this.socios[i].mostrarDatos();
        }
    }
}
