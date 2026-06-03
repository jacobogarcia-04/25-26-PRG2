package entregas.garciaJacobo;

public class Cliente {

    public static void main(String[] args) {

        Console console = new Console();

        Gimnasio gimnasio = new Gimnasio("FitLife Center");
        Actividades yoga = new Actividades("Yoga", "Elena Ruiz", 1);
        Horario horYoga = new Horario("Lun/Vie", 10.0, 12.0);
        Socios socio1 = new Socios("Juan García", "12345678A", "01/04/2025", "ALTA");
        Socios socio2 = new Socios("Pablo Martinez ", "12345678A", "05/04/2025", "ALTA");

        gimnasio.mostrarNombre();
        console.writeln("");

        console.writeln("Actividades:");
        console.writeln("  \"" + yoga.obtenerNombre() + "\" - Monitor/a: " + yoga.obtenerMonitor() + " - "
                + horYoga.obtenerDia() + " " + horYoga.obtenerHoraInicio() + horYoga.obtenerHoraFin());
        console.writeln("");

        console.writeln("Socios:");
        console.write("  \"" + socio1.obtenerNombre() + "\" - DNI: " + socio1.obtenerDNI());
        console.writeln("  " + socio1.preguntarEstadoInscripcion());
        console.writeln("");

        console.write("  \"" + socio2.obtenerNombre() + "\" - DNI: " + socio2.obtenerDNI());
        console.writeln("  " + socio2.preguntarEstadoInscripcion());
        console.writeln("");

        console.writeln("Reservas:");
        Reservas res1 = new Reservas(socio1.obtenerNombre(), yoga.obtenerNombre(), "01/02/2026");
        yoga.inscribirSocio();
        console.write("  ->Socio: " + socio1.obtenerNombre());
        yoga.mostrar();
        yoga.mostrarAforo();
        console.writeln("Fecha de la reserva: " + "1/02/2026");

        console.writeln("");
        console.writeln("----------------------------------------------------");
        console.writeln("");

        Reservas res2 = new Reservas(socio2.obtenerNombre(), yoga.obtenerNombre(), "01/02/2026");

        console.write(" ->Socio " + socio2.obtenerNombre() + " ");
        yoga.inscribirSocio();
        yoga.mostrarAforo();

    }
}
