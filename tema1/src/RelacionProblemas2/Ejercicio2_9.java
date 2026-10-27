package RelacionProblemas2;

import java.util.Scanner;

public class Ejercicio2_9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int resto;
        int sumatorio = 0;
        String cadenaDivisores = "";

        do {
            System.out.println("Introduzca un numero entero positivo");
            num = sc.nextInt();
        } while (num < 0);

        for (int i = 1; i < num; i++) {
            resto = num % i;

            if (resto == 0) {
                if (cadenaDivisores.isEmpty()) {
                    cadenaDivisores = cadenaDivisores.concat(i + "");

                } else {
                    cadenaDivisores = cadenaDivisores.concat(" + " + i);
                }
                sumatorio += i;
            }
        }
        cadenaDivisores = cadenaDivisores.concat(" = " + sumatorio);

        if (sumatorio == num) {
            System.out.println("El numero " + num + " es perfecto porque es igual que " + cadenaDivisores);
        } else {
            System.out.println("El numero " + num + " no es perfecto porque " + cadenaDivisores);
        }

    }
}
