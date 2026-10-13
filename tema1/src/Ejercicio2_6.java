import java.util.Scanner;

public class Ejercicio2_6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero");
        int numeroA = sc.nextInt();
        System.out.println("Introduce otro numero");
        int numeroB = sc.nextInt();

        int suma = 0;

        for (int i = 0; i < numeroB; i++) {
            suma = suma + numeroA;
        }

        System.out.println(suma);
    }
}
