package RelacionProblemas2;

import java.util.Scanner;

public class Ejercicio2_9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int divisor;
        int sumatorio = 0;
        String cadenaDivisores = "";

        do {
            System.out.println("Introduzca un numero entero positivo");
            num = sc.nextInt();
        } while (num < 0);

        for (int i = 1; i < num; i++) {
            divisor=num%i;

            if (divisor == 0) {
                if (cadenaDivisores.isEmpty()){
                    cadenaDivisores.concat(divisor+"");

                }
                else{
                    cadenaDivisores.concat(" + " + divisor);
                }
                System.out.println(i);
                sumatorio += i;
            }
        }

        if (sumatorio == num) {
            System.out.println("El numero " + num + " es perfecto porque es igual que " + cadenaDivisores );
        }

    }
}
