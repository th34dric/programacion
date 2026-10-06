import java.util.Scanner;

public class Ejercicio7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu estado civil (S, C, V, D)");
        char caracter = sc.nextLine().charAt(0);

        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();

        if (edad>50) {
            System.out.println("Obtiene un 8.5%");
        } else if (edad < 36) {
            if (caracter=='s' || caracter=='d'){
                System.out.println("Obtiene un 12%");
            } else {
                System.out.println("Obtiene un 11.3%");
            }
        } else {
            System.out.println("Obtiene un 10.5%");
        }
    }
}
