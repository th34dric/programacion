import java.util.Scanner;

public class Ejercicio4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una edad");

        int edad = sc.nextInt();

        if (edad <= 12) {
            System.out.println("Es un niño");
        } else if (edad <= 17) {
            System.out.println("Es un adolescente");
        } else if (edad <= 29) {
            System.out.println("Es un joven");
        } else {
            System.out.println("Es un adulto");
        }

    }
}
