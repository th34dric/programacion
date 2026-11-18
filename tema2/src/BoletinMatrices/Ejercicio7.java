package BoletinMatrices;

public class Ejercicio7 {
    static void main(String[] args) {
        int[][] matriz1 = {{1,2,3},{4,5,6}};
        int[][] matriz2 = {{1,2,3},{4,5,6}};
        System.out.println(matricesIguales(matriz1, matriz2));
    }

    public static boolean matricesIguales(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length) {
            return false;
        }

        for (int i = 0; i < matriz1.length; i++) {
            if (matriz1[i].length != matriz2[i].length) {
                return false;
            }
        }

        for (int k = 0; k < matriz1.length; k++) {
            for (int l = 0; l < matriz1[k].length; l++) {
                if (matriz1[k][l] != matriz2[k][l]) {
                    return false;
                }
            }
        }

        return true;
    }
}
