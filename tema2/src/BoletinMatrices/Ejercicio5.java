package BoletinMatrices;

public class Ejercicio5 {
    public static void matrizPorColumnas(int[][] matriz) {
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
    }

    static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,5,6}};
        matrizPorColumnas(matriz);
    }
}
