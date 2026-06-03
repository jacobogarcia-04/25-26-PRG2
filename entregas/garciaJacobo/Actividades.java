package entregas.garciaJacobo;

public class Actividades {

    private String actividad;
    private String monitor;
    private int aforo;
    private int inscritos;

    public Actividades(String actividad, String monitor, int aforo) {
        this.actividad = actividad;
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

    public String nombrarActividad() {
        return this.actividad
                + (this.estaLlena() ? " (AFORO COMPLETO)" : " (Libres: " + this.calcularPlazasLibres() + ")");
    }

    public String nombrarMonitor() {
        return this.monitor;
    }

    public void mostrarAforo() {
        Console console = new Console();
        console.writeln("  [Aforo: " + this.aforo + " | Libres: " + this.calcularPlazasLibres() + "]");
    }

    public void mostrar() {
        Console console = new Console();
        console.write(!this.estaLlena()
                ? this.actividad + " impartida por " + this.monitor
                : "");
    }

    public void agregarActividad() {
        Console console = new Console();
        if (!this.estaLlena()) {
          this.inscritos++;
        console.writeln("  >> ¡Éxito! Socio inscrito en " + this.actividad);
        console.writeln("  >> Estado actual -> Inscritos: " + this.inscritos + " | Aforo máximo: " + this.aforo);
    } else {
        console.writeln(""); 
        console.writeln("   No se pudo agregar. La actividad " + this.actividad + " está llena.");
        console.writeln("  [!] Capacidad máxima: " + this.aforo);
        }
    }
}
