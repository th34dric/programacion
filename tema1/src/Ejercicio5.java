import java.util.Scanner;

public class Ejercicio5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce cuatro numeros");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        double media = (n1 + n2 + n3 + n4)/4.0;

        System.out.printf("La media es %f%n", media);

        if (media < n1) {
            System.out.println(n1);
        }
        if (media < n2) {
            System.out.println(n2);
        }
        if (media < n3) {
            System.out.println(n3);
        }
        if (media < n4) {
            System.out.println(n4);
        }

    }
}
