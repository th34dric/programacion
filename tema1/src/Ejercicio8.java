import java.util.Scanner;

public class Ejercicio8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta horas, minutos y segundos");
        int hor1 = sc.nextInt();
        int min1 = sc.nextInt();
        int seg1 = sc.nextInt();
        int horatotal1 = seg1 + (min1 * 60) + (hor1 * 3600);
        System.out.println("Inserta otras horas, minutos y segundos");
        int hor2 = sc.nextInt();
        int min2 = sc.nextInt();
        int seg2 = sc.nextInt();
        int horatotal2 = seg2 + (min2 * 60) + (hor2 * 3600);

        if (horatotal1 > horatotal2) {
            System.out.println("La hora 1 es mayor");
        } else if (horatotal2 > horatotal1) {
            System.out.println("La hora 2 es mayor");
        } else {
            System.out.println("Las horas son iguales");
        }
    }
}
