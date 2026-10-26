package RelacionProblemas2;

import java.util.Scanner;

public class Ejercicio2_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        do {
            System.out.println("Introduce un numero");
            num = sc.nextInt();
        } while (num<0 || num>10);

        System.out.println("Tabla del " + num);
        for (int i = 0; i < 11; i++) {
            System.out.println(num + " * " + i + " = " + (num*i));
        }
    }
}
