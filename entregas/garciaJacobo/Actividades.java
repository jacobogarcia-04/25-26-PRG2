package entregas.garciaJacobo;

public class Actividades {

    private String nombre; // cambio del nombre atributo
    private String monitor;
    private int aforo;
    private int inscritos;

    public Actividades(String actividad, String monitor, int aforo) {
        this.nombre = actividad;
        this.monitor = monitor;
        this.aforo = aforo;
        this.inscritos = 0;
    }

    private boolean estaLlena() {
        return this.inscritos >= this.aforo;
    }

    private int calcularPlazasLibres() {
        return this.aforo - this.inscritos;
    }

    public String obtenerNombre() { // cambio nombre
        return this.nombre
                + (this.estaLlena() ? " (AFORO COMPLETO)" : " (Libres: " + this.calcularPlazasLibres() + ")");
    }

    public String obtenerMonitor() {
        return this.monitor;
    }

    public void mostrarAforo() {
        Console console = new Console();
        console.writeln("  [Aforo: " + this.aforo + " | Libres: " + this.calcularPlazasLibres() + "]");
    }

    public void mostrar() {
        Console console = new Console();
        console.write(!this.estaLlena()
                ? this.nombre + " impartida por " + this.monitor
                : "");
    }

    public void inscribirSocio() { // cambio nombre de metodo Se renombró
                                   // el método agregarActividad() a inscribirSocio() ya que su funcionalidad real
                                   // consiste en gestionar la inscripción de socios y el control del aforo,
                                   // mejorando así la claridad y la modularidad del código.
        Console console = new Console();
        if (!this.estaLlena()) {
            this.inscritos++;
            console.writeln("  >> ¡Éxito! Socio inscrito en " + this.nombre);
            console.writeln("  >> Estado actual -> Inscritos: " + this.inscritos + " | Aforo máximo: " + this.aforo);
        } else {
            console.writeln("");
            console.writeln("   No se pudo agregar. La actividad " + this.nombre + " está llena.");
            console.writeln("  [!] Capacidad máxima: " + this.aforo);
        }
    }
}
