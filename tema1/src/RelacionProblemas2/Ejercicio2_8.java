package RelacionProblemas2;

import java.util.Scanner;

public class Ejercicio2_8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char seguir = 'S';
        int num;

        while (seguir == 'S') {
            System.out.println("Introduce un numero");
            num = sc.nextInt();

            System.out.println("¿Desea introducir más números (S/N)");
            sc.nextLine();
            seguir = sc.nextLine().charAt(0);
        }
    }
}
