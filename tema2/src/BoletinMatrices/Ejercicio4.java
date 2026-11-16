package BoletinMatrices;

public class Ejercicio4 {
    public static void matrizALineaReves(int[][] matriz) {
        for (int i = matriz.length-1; i >= 0; i--) {
            for (int j = matriz[i].length-1; j >= 0; j--) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6}};
        matrizALineaReves(matriz);
    }
}
