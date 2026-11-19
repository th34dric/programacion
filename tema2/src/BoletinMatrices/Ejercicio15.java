package BoletinMatrices;

import MiEntradaSalida.MiEntradaSalida;

import java.util.Scanner;

public class Ejercicio15 {
    static void main(String[] args) {
        int[][] matriz = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
        int i = 0, j = 0;

        do {
            i = MiEntradaSalida.leerEntero("Dime la coordenada x de la matriz");
            j = MiEntradaSalida.leerEntero("Dime la coordenada y de la matriz");
            if (i > matriz.length || j > matriz[0].length) {
                System.out.println("Las coordenadas estan fuera del rango de la matriz");
            }
        } while (i > matriz.length || j > matriz[0].length);


        System.out.println("El numero en esa coordenada es el " + darValorCoords(matriz, i, j));
    }

    public static int darValorCoords(int[][] matriz, int i, int j) {
        return matriz[i][j];
    }
}
