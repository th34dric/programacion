package RelacionProblemas2;

import java.util.Scanner;

public class Ejercicio2_5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int contador = 0;

        do {
            System.out.println("Introduce un numero (negativo para terminar):");
            num = sc.nextInt();
            contador++;
        } while (num >= 0);

        System.out.println("Has introducido " + (contador-1) + " numeros positivos");
    }
}
