import java.util.Scanner;

public class Ejercicio9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un tipo de producto (A, B o C)");
        char producto = sc.nextLine().charAt(0);
        System.out.println("Introduce un precio");
        double precio = sc.nextInt();

        if (producto == 'A' || producto == 'a') {
            System.out.println("Se aplicara un 7% de descuento, el precio pasa de " + precio + " a " + (precio*7)/100);
        } else if (producto == 'C' || producto == 'c' || precio < 500) {
            System.out.println("Se aplicara un 12% de descuento, el precio pasa de " + precio + " a " + (precio*12)/100);
        } else {
            System.out.println("Se aplicara un 9% de descuento, el precio pasa de " + precio + " a " + (precio*9)/100);
        }
    }
}
