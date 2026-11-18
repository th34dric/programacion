package BoletinMatrices;

public class Ejercicio11 {
    static void main(String[] args) {
        int[][] matriz1 = {{1,2,3},{4,5,6}};
        int[][] matriz2 = {{6,5,4},{3,2,1}};

        if (!matricesIguales(matriz1, matriz2)) {

        }
    }

    public static void matrizInversa(int[][] matriz1, int[][] matriz2) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {

            }
        }
    }

    public static boolean matricesIguales(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length == matriz2.length) {
            return false;
        }

        for (int i = 0; i < matriz1.length; i++) {
            if (matriz1[i].length == matriz2[i].length) {
                return false;
            }
        }

        return true;
    }
}
