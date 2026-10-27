import java.util.Scanner;

public class MiEntradaSalida {
    public static String leerCadena(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        return sc.nextLine();
    }

    public static int leerEntero(String mensaje){
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        return Integer.parseInt(sc.nextLine());
    }

    public static int leerEnteroPositivo(String mensaje){
        Scanner sc = new Scanner(System.in);
        int numeroLeido;
        System.out.printf("%s: ", mensaje);
        do {
            numeroLeido = Integer.parseInt(sc.nextLine());
            if (numeroLeido < 0) {
                System.out.printf("%s (mayor que 0): ", mensaje);
            }
        } while (numeroLeido < 0);
        return numeroLeido;
    }

    static void main(String[] args) {
        /*String nombre = leerCadena("Como te llamas?");
        System.out.println("hola " + nombre);*/
        int numero = leerEnteroPositivo("Dime un numero");
        System.out.println("Has introducido el " + numero);
    }

}
