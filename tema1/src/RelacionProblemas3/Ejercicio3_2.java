package RelacionProblemas3;

import java.util.Scanner;

public class Ejercicio3_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base;
        int exponente;
        int potencia = 1;

        do {
            System.out.println("Introduce una base");
            base = sc.nextInt();
        } while (base < 0);

        do {
            System.out.println("Introduce un exponente");
            exponente = sc.nextInt();
        } while (exponente < 0);

        for (int i = 0; i < exponente; i++) {
            potencia *= base;
        }

        System.out.println(potencia);
    }
}
