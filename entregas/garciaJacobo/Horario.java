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

    public void mostrarHorario() {
        Console console = new Console();
        console.writeln("Horario configurado: " + this.dia + " de " + this.horaInicio + " a " + this.horaFin);
    }

    public String preguntarDia() {
        return this.dia;
    }

    public String preguntarHoraInicio() {
        return "La actividad comienza a las: " + this.horaInicio;
    }

    public String preguntarHoraFinal() {
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
        double duracionReal = this.horaFin - this.horaInicio;

        double duracionEsperada = 2.0;

        boolean duracionValida = (duracionReal == duracionEsperada);

        return duracionValida;
    }
}
