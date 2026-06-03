package entregas.garciaJacobo;

public class Gimnasio {
    private String nombreGimnasio;

    public Gimnasio(String nombreGimnasio) {
        this.nombreGimnasio = nombreGimnasio;
    }

    public String nombrarGimnasio() {
        return this.nombreGimnasio;
    }

    public void mostrarNombreGimnasio() {
        Console console = new Console();
        console.writeln("Gimnasio: " + this.nombreGimnasio);
    }
}
