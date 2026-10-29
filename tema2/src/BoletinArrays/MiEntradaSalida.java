package BoletinArrays;

import java.util.Scanner;

public class MiEntradaSalida {
    static Scanner sc = new Scanner(System.in);

    public static String leerCadena(String mensaje) {
        System.out.printf("%s: ", mensaje);
        return sc.nextLine();
    }

    public static int leerEntero(String mensaje) {
        System.out.printf("%s: ", mensaje);
        return Integer.parseInt(sc.nextLine());
    }

    public static int leerEnteroPositivo(String mensaje) {
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

    public static double leerDouble(String mensaje) {
        System.out.printf("%s: ", mensaje);
        return Double.parseDouble(sc.nextLine());
    }

    public static int leerEnteroEnRango(String mensaje, int min, int max) {
        int numeroLeido;
        System.out.printf("%s: ", mensaje);
        do {
            numeroLeido = Integer.parseInt(sc.nextLine());
            if (numeroLeido < min || numeroLeido > max) {
                System.out.printf("%s (debe estar entre %d y %d): ", mensaje, min, max);
            }
        } while (numeroLeido < min || numeroLeido > max);
        return numeroLeido;
    }

    public static char leerCaracter(String mensaje) {
        System.out.printf("%s: ", mensaje);
        return sc.nextLine().charAt(0);
    }

    public static char leerSiNo(String mensaje) {
        char caracterLeido;
        System.out.printf("%s: ", mensaje);
        do {
            caracterLeido = sc.nextLine().toUpperCase().charAt(0);
            if (caracterLeido != 'S' && caracterLeido != 'N') {
                System.out.printf("%s (S o N): ", mensaje);
            }
        } while (caracterLeido != 'S' && caracterLeido != 'N');
        return caracterLeido;
    }
}
