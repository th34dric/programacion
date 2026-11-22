package BoletinMatrices;

public class Ejercicio16 {
    static void main(String[] args) {
        int[][] matriz = {{1,2,3,4,5},{6,7,8,9,0},{3,2,1,4,5},{9,5,8,6,7},{0,9,8,5,4}};

        int[][] matrizContador = sacarColindantesPares(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("________________");

        for (int i = 0; i < matrizContador.length; i++) {
            for (int j = 0; j < matrizContador[i].length; j++) {
                System.out.print(matrizContador[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int[][] sacarColindantesPares(int[][] matriz) {
        int contador = 0;
        int[][] matrizContador = new int[matriz.length][matriz[0].length];
        boolean primeraLinea;
        boolean primeraColumna;
        boolean ultimaLinea;
        boolean ultimaColumna;

        for (int i = 0; i < matriz.length; i++) {
            if (i == 0) {
                primeraLinea = true;
            } else {
                primeraLinea = false;
            }

            if (i == matriz.length-1) {
                ultimaLinea = true;
            } else {
                ultimaLinea = false;
            }

            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0) {
                    primeraColumna = true;
                } else {
                    primeraColumna = false;
                }

                if (j == matriz[i].length-1) {
                    ultimaColumna = true;
                } else {
                    ultimaColumna = false;
                }

                for (int k = i-1; k < i+2; k++) {
                    for (int l = j-1; l < j+2; l++) {
                        if (primeraColumna) {
                            k = i;
                        }
                        if (primeraLinea) {
                            l = j;
                        }
                        if (ultimaColumna) {
                            break;
                        }
                        if (ultimaLinea) {
                            break;
                        }

                        if (matriz[k][l] % 2 == 0) {
                            contador++;
                        }
                    }
                }

                matrizContador[i][j] = contador;
                contador = 0;
            }
        }

        return matrizContador;
    }
}
