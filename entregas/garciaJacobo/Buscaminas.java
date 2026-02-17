package entregas.garciaJacobo;

public class Buscaminas {
    public static void main(String[] args) {

        int[][] superficie = {
                { -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1 },
                { -1, -1, -1, -1, -1, -1, -1 }

        };
     
        mostrarMapa(superficie);
    }

    private static String mapearSuperficie(int nºmatriz) {
        final String TILES[] = { " - ", ".", "*" };
        return nºmatriz < 0 ? TILES[0] : TILES[nºmatriz];
    }

    private static void mostrarMapa(int[][] superficie) {
        for (int i = 0; i < superficie.length; i++) {
            for (int j = 0; j < superficie[i].length; j++) {
                int tile = superficie[i][j];
                System.out.print(mapearSuperficie(tile));
            }
            System.out.println();
        }
    }
}
