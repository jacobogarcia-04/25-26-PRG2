package entregas.garciaJacobo;

public class Buscaminas {
    public static void main(String[] args) {

        int[][] superficie = {
                { -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1 }

        };
        final int NUMERO_MINAS=3;
        
        mostrarMapa(superficie);
    }

    private static String mapearSuperficie(int nºmatriz) {
        final String TILES[] = { " - ", ".", "*" };
        return nºmatriz < 0 ? TILES[0] : TILES[nºmatriz];
    }

    private static void mostrarMapa(int[][] superficie) {
        System.out.println("  ===================");
        System.out.println(" 1  2  3  4  5  6  7");

        for (int i = 0; i < superficie.length; i++) {
            System.out.print(i + "");
            for (int j = 0; j < superficie[i].length; j++) {
                int tile = superficie[i][j];
                System.out.print(mapearSuperficie(tile));
            }
            System.out.println();
        }
        System.out.println("  ===================");
    }



    private static void colocarMinas(int[][] superficie, int NUMERO_MINAS) {
        int minasColocadas = 0;
        do {
            int x = (int) (Math.random() * superficie[0].length);
            int y = (int) (Math.random() * superficie.length);
            if (superficie[y][x] != -2) {
                superficie[y][x] = -2;
                minasColocadas++;
            }

        } while (minasColocadas < NUMERO_MINAS);
}
}
