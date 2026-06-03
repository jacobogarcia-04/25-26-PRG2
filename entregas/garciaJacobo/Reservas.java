package entregas.garciaJacobo;

public class Reservas {

    private String[] socios;
    private String[] actividades;
    private String[] fechas;

    private int totalReservas;
    private Console console;

    public Reservas() {
        this.socios = new String[100];
        this.actividades = new String[100];
        this.fechas = new String[100];

        this.totalReservas = 0;
        console = new Console();
    }

    public void realizar(String socio, String actividad, String fecha) { // se agrega logica para guardar las reservas
                                                                         // de cada socio con su correspodiente activida
                                                                         // y fecha en sus matrices

        this.socios[this.totalReservas] = socio;
        this.actividades[this.totalReservas] = actividad;
        this.fechas[this.totalReservas] = fecha;

        this.totalReservas++;

        console.writeln("Reserva realizada correctamente.");
    }

    public void mostrar() { // se agrega logica para mostrar las reservas

        for (int i = 0; i < this.totalReservas; i++) {

            console.writeln("Reserva " + (i + 1));
            console.writeln("Socio: " + this.socios[i]);
            console.writeln("Actividad: " + this.actividades[i]);
            console.writeln("Fecha: " + this.fechas[i]);
            console.writeln("");
        }
    }
}
