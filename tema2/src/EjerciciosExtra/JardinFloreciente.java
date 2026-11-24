package EjerciciosExtra;

import java.util.IllegalFormatCodePointException;

public class JardinFloreciente {
    static final int FLOR = 1;
    static final int AGUA = 2;
    static final int ABEJA = 5;
    static final int HIERBA = 3;
    static final int GUSANO = 4;

    static void main(String[] args) {
        boolean florece = false;

        int[][] jardin = {
                {1, 0, 0, 0, 1, 0, 0, 0, 2, 1, 1, 0, 0, 5, 0},
                {0, 2, 0, 5, 0, 0, 3, 0, 1, 0, 0, 0, 1, 0, 0},
                {3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 4},
                {0, 0, 2, 0, 0, 0, 0, 0, 2, 1, 3, 0, 0, 0, 1},
                {0, 0, 1, 0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 3},
                {4, 3, 0, 0, 0, 2, 1, 0, 0, 0, 0, 5, 0, 0, 0},
                {1, 2, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                {3, 0, 0, 0, 0, 0, 2, 1, 4, 0, 0, 0, 1, 0, 0},
                {2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0},
                {0, 0, 5, 1, 0, 0, 0, 5, 0, 3, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 2, 4, 0},
                {0, 0, 1, 3, 0, 0, 1, 0, 0, 1, 0, 0, 1, 3, 0},
                {0, 1, 2, 1, 0, 0, 0, 0, 0, 2, 3, 1, 0, 0, 1},
                {1, 3, 4, 0, 0, 5, 0, 0, 1, 0, 0, 0, 0, 4, 2}
        };

        for (int i = 0; i < jardin.length; i++) {
            for (int j = 0; j < jardin[i].length; j++) {
                if (jardin[i][j] != FLOR) {
                    continue;
                }

                if (hayAbeja(jardin, i, j) && hayAgua(jardin, i, j) && (!hayMalaHierba(jardin, i, j) || hayGusano(jardin, i, j))) {
                    florece = true;
                }

                if (florece) {
                    System.out.printf("La flor de la posicion %d,%d florecera%n", i, j);
                }

                florece = false;
            }
        }


    }

    public static boolean hayAgua(int[][] jardin, int i, int j) {
        boolean hayAgua = false;

        for (int k = i - 1; k < i + 2; k++) {
            for (int l = j - 1; l < j + 2; l++) {
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[0].length) {
                    if (jardin[k][l] == AGUA) {
                        hayAgua = true;
                    }
                }
            }
        }

        return hayAgua;
    }

    public static boolean hayAbeja(int[][] jardin, int i, int j) {
        boolean hayAbeja = false;

        for (int k = i - 3; k < i + 4; k++) {
            for (int l = j - 3; l < j + 4; l++) {
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[0].length) {
                    if (jardin[k][l] == ABEJA) {
                        hayAbeja = true;
                    }
                }
            }
        }

        return hayAbeja;
    }

    public static boolean hayGusano(int[][] jardin, int i, int j) {
        boolean hayGusano = false;

        for (int k = i - 1; k < i + 2; k++) {
            for (int l = j - 1; l < j + 2; l++) {
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[0].length) {
                    if (jardin[k][l] == GUSANO) {
                        hayGusano = true;
                    }
                }
            }
        }

        return hayGusano;
    }

    public static boolean hayMalaHierba(int[][] jardin, int i, int j) {
        boolean hayMalaHierba = false;

        for (int k = i - 1; k < i + 2; k++) {
            for (int l = j - 1; l < j + 2; l++) {
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[0].length) {
                    if (jardin[k][l] == HIERBA) {
                        hayMalaHierba = true;
                    }
                }
            }
        }

        return hayMalaHierba;
    }
}
