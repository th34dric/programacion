package RelacionProblemas4;

import java.util.Scanner;

public class Ejercicio4_4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hora;
        int min;
        int seg;
        int hora2;
        int min2;
        int seg2;

        do {
            System.out.print("Introduce la hora base: ");
            hora = sc.nextInt();
        } while (hora < 0 || hora > 23);

        do {
            System.out.print("Introduce los minutos base: ");
            min = sc.nextInt();
        } while (min < 0 || min > 59);

        do {
            System.out.print("Introduce los segundos base: ");
            seg = sc.nextInt();
        } while (seg < 0 || seg > 59);

        System.out.print("Cuantas horas quieres sumar?: ");
        hora2 = sc.nextInt();
        System.out.print("Cuantos minutos quieres sumar?: ");
        min2 = sc.nextInt();
        System.out.print("Cuantos segundos quieres sumar?: ");
        seg2 = sc.nextInt();

        int segTotal = (seg + seg2) % 60;
        int minTotal = (((seg + seg2) / 60) + min + min2) % 60;
        int horaTotal = (((((seg + seg2) / 60) + min + min2) / 60) + hora + hora2) % 24;
        int dia = (((((seg + seg2) / 60) + min + min2) / 60) + hora + hora2) / 24;

        if (dia == 1) {
            System.out.printf("La hora resultado es: %d:%d:%d (del dia siguiente)", horaTotal, minTotal, segTotal);
        } else if (dia > 1){
            System.out.printf("La hora resultado es: %d:%d:%d (dentro de %d dias)", horaTotal, minTotal, segTotal, dia);
        } else {
            System.out.printf("La hora resultado es: %d:%d:%d", horaTotal, minTotal, segTotal);
        }
    }
}
