package BoletinMatrices;

public class Ejercicio1 {
    public static boolean hayNegativo(int[][] matriz) {
        boolean hay = false;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 0) {
                    hay = true;
                }
            }
        }
        
        return hay;
    }

    static void main(String[] args) {
        int[][] matriz = {{1,2,3},{4,-5,6}};

        if (hayNegativo(matriz)) {
            System.out.println("Hay negativo en la matriz");
        } else {
            System.out.println("No hay negativo");
        }

    }
}
