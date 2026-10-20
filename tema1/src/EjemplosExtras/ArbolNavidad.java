package RelacionProblemas4;

import java.util.Scanner;

public class ArbolNavidad {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int altura;

        do {
            System.out.println("Introduce la altura");
            altura = sc.nextInt();
        } while (altura < 0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
