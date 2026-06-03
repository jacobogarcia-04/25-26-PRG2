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

    public String toString() { // se crea este metodo para que se muestre el horario en la forma correcta
        return "Horario: " +
                this.dia +
                " de " + this.horaInicio +
                " a " + this.horaFin;
    }

    public String obtenerDia() { // cambio nombre
        return this.dia;
    }

}
