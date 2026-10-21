package RelacionProblemas4;

import java.util.Scanner;

public class Ejercicio4_4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horaTotal;
        int minTotal;
        int segTotal;

        System.out.print("Introduce la hora base: ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos base: ");
        int min = sc.nextInt();
        System.out.print("Introduce los segundos base: ");
        int seg = sc.nextInt();

        System.out.print("Cuantas horas quieres sumar?: ");
        int hora2 = sc.nextInt();
        System.out.print("Cuantos minutos quieres sumar?: ");
        int min2 = sc.nextInt();
        System.out.print("Cuantos segundos quieres sumar?: ");
        int seg2 = sc.nextInt();

        segTotal = (seg + seg2) % 60;
        minTotal = (((seg + seg2) / 60) + min + min2) % 60;
        horaTotal = ((((seg + seg2) / 60) + min + min2) / 60) + hora + hora2 % 24;

        if (horaTotal == 24) {
            horaTotal = 0;
            System.out.printf("La hora resultado es: %d:%d:%d (del sia siguiente)", horaTotal, minTotal, segTotal);
        } else {
            System.out.printf("La hora resultado es: %d:%d:%d", horaTotal, minTotal, segTotal);
        }
    }
}
