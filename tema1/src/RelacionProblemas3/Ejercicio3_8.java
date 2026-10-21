package RelacionProblemas3;

import java.util.Scanner;

public class Ejercicio3_8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el coeficiente A:");
        int coeA = sc.nextInt();
        System.out.println("Introduce el coeficiente B:");
        int coeB = sc.nextInt();
        System.out.println("Introduce el coeficiente C:");
        int coeC = sc.nextInt();

        double xPositiva = (-coeB+Math.pow((coeB*coeB-4*coeA*coeC),(0.5)))/(2*coeA);
        double xNegativa = (-coeB-Math.pow((coeB*coeB-4*coeA*coeC),(0.5)))/(2*coeA);

        if ((coeB*coeB-4*coeA*coeC) > 0) {
            System.out.println("Tiene dos soluciones");
            System.out.println(xPositiva);
            System.out.println(xNegativa);
        } else if ((coeB*coeB-4*coeA*coeC) == 0) {
            System.out.println("Tiene una solucion");
            System.out.println(xPositiva);
        } else {
            System.out.println("Ninguna solucion real");
        }
    }
}
