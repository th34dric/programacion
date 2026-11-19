package BoletinMatrices;

import MiEntradaSalida.MiEntradaSalida;

public class Ejercicio12 {
    static void main(String[] args) {
        int FILAS, COLUMNAS;

        do {
            FILAS = MiEntradaSalida.leerEntero("Indica las filas de la matriz");
            COLUMNAS = MiEntradaSalida.leerEntero("Indica las columnas de la matriz");
            if (FILAS != COLUMNAS) {
                System.out.println("La matriz no es cuadrada");
            }
        } while (FILAS != COLUMNAS);

        int[][] matriz = introducirMatriz(FILAS, COLUMNAS);

        int[][] matrizCambiada = matrizDiagonal(matriz);
        imprimirMatriz(matrizCambiada);
    }

    public static int[][] introducirMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = MiEntradaSalida.leerEntero("Introduce el espacio " + i + j + " de la matriz: ");
            }
            System.out.println();
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

    public static int[][] matrizDiagonal(int[][] matriz) {
        int[][] matrizCambiada = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizCambiada[j][i] = matriz[i][j];
            }
        }

        return matrizCambiada;
    }
}
