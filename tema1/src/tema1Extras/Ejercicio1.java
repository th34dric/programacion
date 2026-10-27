import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos numeros");

        //int num1 = sc.nextInt();
        //int num2 = sc.nextInt();

        double num1 = Double.parseDouble(sc.nextLine());
        double num2 = Double.parseDouble(sc.nextLine());

        System.out.println("La suma es " + (num1 + num2));
        System.out.println("La resta es " + (num1 - num2));
        System.out.println("La multiplicacion es " + (num1 * num2));
        System.out.println("La division es " + (num1 / num2));
    }
}
