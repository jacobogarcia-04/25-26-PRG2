package entregas.garciaJacobo;

public class Menu {
    private Console console;

    public Menu() {
        console = new Console();
    }

    public int pedirOpcion() {// se agrega el metodo pedir opcion y su logica
        return console.readInt("");
    }

    public void mostrarMenu() {// se agrega metodo y su logica para mostrar el menu 
        console.writeln("");
        console.writeln("===== GIMNASIO =====");
        console.writeln("1. Mostrar actividades");
        console.writeln("2. Inscribir socio");
        console.writeln("3. Mostrar socios");
        console.writeln("4. Consultar aforo");
        console.writeln("5. Realizar reserva");
        console.writeln("6. Cancelar reserva");
        console.writeln("7. Salir");
    }

}
