package entregas.garciaJacobo;
public class Horario {
    private String dia;
    private double horaInicio;
    private double horaFin;

    public Horario(String dia, double horaInicio, double horaFin) {
        this.dia = dia;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    public void mostrarHorario() { // cambio nombre
        Console console = new Console();
        console.writeln("Horario configurado: " + this.dia + " de " + this.horaInicio + " a " + this.horaFin);
    }

    public String obtenerDia() { // cambio nombre
        return this.dia;
    }

    public String obtenerHoraInicio() { // cambio nombre
        return "La actividad comienza a las: " + this.horaInicio;
    }

    public String obtenerHoraFin() { // cambio nombre
        return " y termina a las: " + this.horaFin;
    }

    public void agregarHorario() {
        Console console = new Console();
        if (this.comprobarDuracion()) {
            console.writeln("¡Éxito! El horario cumple con la normativa de 2 horas.");
        } else {
            console.writeln("AVISO: La duración de la actividad supera las 2 horas. Revisar planificación.");
        }
    }

    private boolean comprobarDuracion() {
        
        double duracionEsperada = 2.0;

        return (this.horaFin-this.horaInicio)==duracionEsperada; // reduccion del codigo para que haga lo mismo.

        
    }
}
