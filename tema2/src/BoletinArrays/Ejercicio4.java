package BoletinArrays;

import java.util.Scanner;

public class Ejercicio4 {
    public static void nose(int unArray[]) {

    }

    static void main(String[] args) {

        int NUMEROS_TOTALES = 6000;
        int media = 0;
        int ultimoDigito;

        int[] miArray = new int[NUMEROS_TOTALES];

        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = (int)(Math.random() * 100);
            media += miArray[i];
        }

        media = media/NUMEROS_TOTALES;

        System.out.println("La media de los numeros es " + media);
    }
}
