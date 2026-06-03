package entregas.garciaJacobo;

public class Gimnasio {
    private String nombre; // cambio en el nombre del atributo 

    public Gimnasio(String nombreGimnasio) {
        this.nombre = nombre;
    }

    public String obtenerNombre() { // cambio en el nombre del metodo 
        return this.nombre;
    }

    public void mostrarNombre() { // cambio en el nombre 
        Console console = new Console();
        console.writeln("Gimnasio: " + this.nombre);
    }
}
