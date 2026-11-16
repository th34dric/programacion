package BoletinMatrices;

public class Ejercicio6 {
    public static void matrizPorColumnasReves(int[][] matriz) {
        for (int j = matriz[0].length-1; j >= 0; j--) {
            for (int i = matriz.length-1; i >= 0; i--) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6}};
        matrizPorColumnasReves(matriz);
    }
}
