package BoletinMatrices;

import BoletinArrays.MiEntradaSalida;

public class Ejercicio8 {
    static void main(String[] args) {
        int FILAS1 = MiEntradaSalida.leerEntero("Indica las filas de la primera matriz");
        int COLUMNAS1 = MiEntradaSalida.leerEntero("Indica las columnas de la primera matriz");
        int FILAS2 = MiEntradaSalida.leerEntero("Indica las filas de la segunda matriz");
        int COLUMNAS2 = MiEntradaSalida.leerEntero("Indica las columnas de la segunda matriz");

        while (FILAS1 != FILAS2 || COLUMNAS1 != COLUMNAS2) {
            System.out.println("Las matrices no son iguales");
            FILAS1 = MiEntradaSalida.leerEntero("Indica las filas de la primera matriz");
            COLUMNAS1 = MiEntradaSalida.leerEntero("Indica las columnas de la primera matriz");
            FILAS2 = MiEntradaSalida.leerEntero("Indica las filas de la segunda matriz");
            COLUMNAS2 = MiEntradaSalida.leerEntero("Indica las columnas de la segunda matriz");
        }

        int[][] matriz1 = introducirMatriz(FILAS1, COLUMNAS1);;
        int[][] matriz2 = introducirMatriz(FILAS2, COLUMNAS2);;

        int[][] matrizSuma = sumaMatrices(matriz1, matriz2);
        imprimirMatriz(matrizSuma);

    }

    public static int[][] introducirMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = MiEntradaSalida.leerEntero("Introduce el espacio " + i + j + " de la matriz: ");
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] matrizSuma = new int[matriz1.length][matriz1[0].length];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return matrizSuma;
    }
}
