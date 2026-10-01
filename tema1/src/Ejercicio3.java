import java.util.Scanner;

public class Ejercicio3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero para saber si es multiplo de 2 o de 3");

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.printf("El numero %d es multiplo de 2%n", num);
        }
        if (num % 3 == 0) {
            System.out.printf("El numero %d es multiplo de 3%n", num);
        }

    }
}
