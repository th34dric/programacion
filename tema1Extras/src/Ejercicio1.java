import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce dos numeros");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double num3 = Double.parseDouble(sc.nextLine()); //lee una cadena de caracteres y lo pasa a double solo

        int suma, resta, multi;
        double division;

        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        division = (double)num1 / (double)num2;

        System.out.println("La suma es " + suma);
        System.out.println("La resta es " + resta);
        System.out.println("La multiplicacion es " + multi);
        System.out.println("La division es " + division);
    }
}
