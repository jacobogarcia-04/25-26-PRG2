package entregas.garciaJacobo;

public class Socios {

    private String nombre; // cambio nombres de la variables a nombre fecha Alta lo mismo en el constructor
    private String dni;
    private String fechaAlta;
    private String estadoInscripcion;
    private Console console;

    public Socios(String nombre, String dni, String fechaAlta, String estadoInscripcion) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlta = fechaAlta;
        this.estadoInscripcion = estadoInscripcion;
        console = new Console();
    }

    private boolean estaActivo() { // cambio nombre
        return this.estadoInscripcion.equalsIgnoreCase("ALTA");
    }

    public String obtenerNombre() { // cambio nombre
        return this.nombre;
    }

    public String obtenerDNI() { // cambio nombre
        return this.dni;
    }

    public String obtenerFechaAlta() { // cambio nombre
        return this.fechaAlta;
    }

    public String preguntarEstadoInscripcion() {
        if (this.estaActivo()) {
            return "Estado: El socio " + this.nombre + " está de ALTA."; // nombre
        } else {
            return "Estado: El socio " + this.nombre + " está de BAJA."; // nombre
        }
    }

    public void mostrarDatos() {
        console.writeln("Nombre: " + this.nombre);
        console.writeln("DNI: " + this.dni);
        console.writeln("Fecha de alta: " + this.fechaAlta);
        console.writeln(this.preguntarEstadoInscripcion());
    }
}
