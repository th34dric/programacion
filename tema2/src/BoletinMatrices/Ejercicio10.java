package BoletinMatrices;

public class Ejercicio10 {
    static void main(String[] args) {
        int[][] matriz = {{1,4,1},{2,5,2},{3,6,3}};
        System.out.println(matrizSimetricaY(matriz));
    }

    public static boolean matrizSimetricaY(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length/2; j++) {
                if (matriz[i][j] == matriz[i][matriz[i].length-1-j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
