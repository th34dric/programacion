package RelacionProblemas2;

import java.util.Scanner;

public class Ejercicio2_10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int factorial = 1;

        do {
            System.out.println("Introduce un numero positivo");
            num = sc.nextInt();
        } while (num < 0);

        if (num == 0) {
            System.out.printf("Factorial (%d) = 0", num);
        } else {
            for (int i = num; i > 0; i--) {
                factorial = factorial * i;
            }

            System.out.printf("Factorial (%d) = %d", num, factorial);
        }
    }
}
