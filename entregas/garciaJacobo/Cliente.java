package entregas.garciaJacobo;

public class Cliente {

    private Console console;
    private Gimnasio gimnasio;
    private Reservas reservas;
    private Menu menu;

    public Cliente() {

        this.console = new Console();

        this.gimnasio = new Gimnasio("FitLife Center");
        this.menu = new Menu();
        this.reservas = new Reservas();

    }

    public static void main(String[] args) {
        new Cliente().ejecutar(); // "refactor: se limpia el main para que el cliente sea un escenario vivo y los
                                  // objetos se comuniquen entre ellos
    }

    private void ejecutar() {
        boolean salir = false;
        do {
            menu.mostrarMenu(); // se crea clase mostrarMenu por que es una tarea del menu no del cliente y asi
                                // mismo que el menus devuelva la opcion pedida
            switch (menu.pedirOpcion()) {
                case 1 -> gimnasio.mostrarActividades(); // se añade metodo para que el gimnasio tenga sus propias
                                                         // actividades y las muestre
                case 2 -> this.inscribirSocio();// cliente pide datos al usuario para darlo de alta
                case 3 -> reservas.realizar();
                case 4 -> {
                    Actividades actividad = gimnasio.escogerActividad();
                    actividad.mostrarAforo();
                } // se añade metdo en la clase gimnasio para que muestre el aforo de una unica
                  // actividad
                case 5 -> reservas.cancelar();
                case 6 -> salir = true;

            }

        } while (!salir);
    }

    private void inscribirSocio() { // se crea metodo incribir socios por que el cliente es el encargado de
                                    // preguntar el nombre del socio su denia y fecha de incripcion
        String nombre = this.console.readString("Nombre:");

        String dni = this.console.readString("DNI:");

        String fechaAlta = this.console.readString("Fecha de alta:");

        Socios socio = new Socios(
                nombre,
                dni,
                fechaAlta,
                "ALTA");

        socio.mostrarDatos();

    }

}