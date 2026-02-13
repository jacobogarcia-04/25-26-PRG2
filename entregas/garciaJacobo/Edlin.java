package entregas.garciaJacobo;

import java.util.Scanner;

public class Edlin {
    public static void main(String[] args) {
        String[] fichero = {
                "Bienvenidos al editor EDLIN",
                "Utilice el menu inferior para editar el texto",
                "------",
                "[L] permite definir la linea activa",
                "[E] permite editar la linea activa",
                "[I] permite intercambiar dos lineas",
                "[B] borra el contenido de la linea activa",
                "[D] deshace la última acción realizada",
                "[S] sale del programa",
                ""
        };

        int[] lineaActiva = new int[1];

        mostrarMenu(fichero, lineaActiva);
        preguntarLineaActiva(lineaActiva);
        mostrarMenu(fichero, lineaActiva);

    }

    private static void preguntarLineaActiva(int[] lineaActiva) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Que linea activa eliges?");
        lineaActiva[0] = scanner.nextInt();

    }

    private static void editar(int[] lineaActiva, String[] fichero) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Que linea activa eliges?");
        fichero[lineaActiva[0]] = scanner.nextLine();
    }

    private static void mostrarMenu(String[] fichero, int[] lineaActiva) {
        imprimirBordeHorizontal();
        for (int i = 0; i < fichero.length; i++) {

            String separador = i + ((lineaActiva[0] == i) ? "*" : " ") + "|";
            if (fichero[i] != null) {

                System.out.println(separador + fichero[i]);
            } else {
                System.out.println(separador);
            }

        }
        imprimirBordeHorizontal();
        imprimirComandos();
    }

    private static void imprimirComandos() {
        System.out.println("Comandos: [L]inea activa | [E]ditar | [I]ntercambiar | [B]orrar | [D]eshacer | [S]alir");
    }

    private static void imprimirBordeHorizontal() {
        System.out.println("---------------------------------------------------");
    }

}
