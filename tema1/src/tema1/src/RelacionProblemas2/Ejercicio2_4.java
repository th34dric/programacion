package RelacionProblemas2;

import java.util.Scanner;

public class Ejercicio2_4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int suma = 0;

        do {
            System.out.println("Introduzca un numero positivo");
            num = sc.nextInt();
        } while (num < 0);

        for (int i = 0; i < num+1; i++) {
            suma = suma +i;
        }

        System.out.println("La suma de los " + num + " primeros numeros es " + suma);
    }
}
