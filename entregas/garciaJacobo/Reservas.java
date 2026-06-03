package entregas.garciaJacobo;

public class Reservas {

    private String nombreSocio; // nombre -> nombreSocio actividad -> nombreActividad fecha -> fechaReserva
    private String nombreActividad;
    private String fechaReserva;

    public Reservas(String nombreSocio, String nombreActividad, String fechaReserva) {

        this.nombreSocio = nombreSocio;
        this.nombreActividad = nombreActividad;
        this.fechaReserva = fechaReserva;
    }

    public void mostrarReserva() { // se añade metodo para mostrar reserva de un usario 

        Console console = new Console();

        console.writeln("Socio: " + this.nombreSocio);
        console.writeln("Actividad: " + this.nombreActividad);
        console.writeln("Fecha: " + this.fechaReserva);
    }

    public Object realizar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'realizar'");
    }

    public Object cancelar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelar'");
    }
}
