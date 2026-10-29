package BoletinArrays;

import java.util.Scanner;

public class Ejercicio1 {
    public static int sumaPosicionesPares(int unArray[]){
        int suma = 0;
        for (int i = 0; i < unArray.length; i+=2) {
            suma += unArray[i];
        }
        return suma;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int miArray[] = new int[6];

        for (int i = 0; i < miArray.length; i++) {
            System.out.printf("Introduce el elemento %d: ", i);
            miArray[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.printf("La suma de las posiciones pares es: %d", sumaPosicionesPares(miArray));
    }
}
