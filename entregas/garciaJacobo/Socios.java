package entregas.garciaJacobo;

public class Socios {

    private String nombreSocios;
    private String dni;
    private String fecha;
    private String estadoInscripcion;

    public Socios(String nombreSocios, String dni, String fecha, String estadoInscripcion) {
        this.nombreSocios = nombreSocios;
        this.dni = dni;
        this.fecha = fecha;
        this.estadoInscripcion = estadoInscripcion;
    }

    private boolean estadoActivo() {
        return this.estadoInscripcion.equalsIgnoreCase("ALTA");
    }

    public String preguntarNombreSocios() {
        return this.nombreSocios;
    }

    public String preguntarDNI() {
        return this.dni;
    }

    public String preguntarFechaInscripcion() {
        return this.fecha;
    }

    public String preguntarEstadoInscripcion() {
        if (this.estadoActivo()) {
            return "Estado: El socio " + this.nombreSocios + " está de ALTA.";
        } else {
            return "Estado: El socio " + this.nombreSocios + " está de BAJA.";
        }
    }
}
