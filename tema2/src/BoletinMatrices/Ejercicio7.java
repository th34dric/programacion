package BoletinMatrices;

public class Ejercicio7 {
    static void main(String[] args) {
        int[][] matriz1 = {{1,2,3},{4,5,6}};
        int[][] matriz2 = {{1,2,3},{4,7,6}};
        System.out.println(matricesIguales(matriz1, matriz2));
    }

    public static boolean matricesIguales(int[][] matriz1, int[][] matriz2) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}
