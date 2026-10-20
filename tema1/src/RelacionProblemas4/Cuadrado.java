package RelacionProblemas4;

import java.util.Scanner;

public class Cuadrado {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;
        int anchura;

        do {
            System.out.println("Introduce la altura");
            altura = sc.nextInt();
        } while (altura < 0);

        do {
            System.out.println("Introduce la anchura");
            anchura = sc.nextInt();
        } while (anchura < 0);

        /*
        //CUADRADO NORMAL

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                    System.out.print("*");
            }
            System.out.println();
        }
        */

        /*
        //RECTANGULO

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /*
        //CUADRADO SOLO BORDES

        for (int i = 0; i < altura; i++) {
            if (i == 0 || i == altura - 1) {
                for (int j = 0; j < altura; j++) {
                    System.out.print("* ");
                }
            } else {
                System.out.print("* ");
                for (int j = 0; j < anchura + 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
        */

        //CUADRADO SOLO BORDES

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == anchura -1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
