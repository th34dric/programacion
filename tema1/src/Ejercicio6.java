import java.util.Scanner;

public class Ejercicio6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un caracter");

        char caracter = sc.nextLine().charAt(0);

        if (caracter=='a' || caracter=='e' || caracter=='i' || caracter=='o' || caracter=='u') {
            System.out.println("Es una vocal");
            switch (caracter) {
                case 'a':
                    System.out.println("Es la primera vocal (A)");
                    break;
                case 'e':
                    System.out.println("Es la segunda vocal (E)");
                    break;
                case 'i':
                    System.out.println("Es la tercera vocal (I)");
                    break;
                case 'o':
                    System.out.println("Es la cuarta vocal (O)");
                    break;
                case 'u':
                    System.out.println("Es la quinta vocal (U)");
                    break;
            }
        } else {
            System.out.println("Es una consonante");
        }
    }
}
