package BoletinMatrices;

public class Ejercicio14 {
    static void main(String[] args) {
        int[][] matriz = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};

        int[][] matrizCambiada = filasAColumnas(matriz);

        for (int i = 0; i < matrizCambiada.length; i++) {
            for (int j = 0; j < matrizCambiada[i].length; j++) {
                System.out.print(matrizCambiada[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] filasAColumnas(int[][] matriz) {
        int[][] matrizCambiada = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizCambiada[j][i] = matriz[i][j];
            }
        }

        return matrizCambiada;
    }
}
