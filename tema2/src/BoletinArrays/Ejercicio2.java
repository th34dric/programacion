package BoletinArrays;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int miArray[] = new int[6];
        int numNegativo = 0;

        for (int i = 0; i < miArray.length; i++) {
            System.out.printf("Introduce el elemento %d: ", i);
            miArray[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] < 0) {
                numNegativo++;
            }
        }

        System.out.printf("En el array hay %d numeros negativos", numNegativo);
    }
}
