package BoletinArrays;

import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        boolean repeticionMenor = false;
        int contadorMenor = 1;
        boolean repeticionMayor = false;
        int contadorMayor = 1;
        double suma = 0.0;

        System.out.print("Introduce el numero de elementos del array: ");
        int numElementos = Integer.parseInt(sc.nextLine());

        int miArray[] = new int[numElementos];

        for (int i = 0; i < miArray.length; i++) {
            System.out.printf("Introduce el numero %d: ", (i+1));
            miArray[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < miArray.length; i++) {
            suma += miArray[i];
            if (miArray[i] < menor) {
                menor = miArray[i];
            } else if (miArray[i] > mayor) {
                mayor = miArray[i];
            } else if (miArray[i] == menor) {
                repeticionMenor = true;
                contadorMenor++;
            } else if (miArray[i] == mayor) {
                repeticionMayor = true;
                contadorMayor++;
            }
        }

        if (repeticionMenor) {
            System.out.printf("El menor numero introducido es %d (se repite %d veces)%n", menor, contadorMenor);
        } else {
            System.out.printf("El menor numero introducido es %d%n", menor);
        }
        if (repeticionMayor) {
            System.out.printf("El mayor numero introducido es %d (se repite %d veces)%n", mayor, contadorMayor);
        } else {
            System.out.printf("El mayor numero introducido es %d%n", mayor);
        }
        System.out.printf("La media de los numeros es: %f%n", (suma/ miArray.length));
    }
}
