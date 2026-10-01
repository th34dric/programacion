import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos numeros para ver cual es mayor");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El primer numero es mayor");
        }
        else if (num2 > num1) {
            System.out.println("El segundo numero es mayor");
        }
        else {
            System.out.println("Son iguales");
        }
    }
}
