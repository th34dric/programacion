package RelacionProblemas3;

import java.util.Scanner;

public class Ejercicio3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroSecreto = (int) (Math.random() * 100) + 1;
        int miNumero = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Escribe un numero entre el 1-100 para intentar adivinar el numero secreto");
            miNumero = sc.nextInt();
            while (miNumero <= 0 || miNumero > 100) {
                System.out.println("El numero tiene que estar entre 1-100");
            }
            if (miNumero == numeroSecreto) {
                System.out.println("Es el numero!!");
                break;
            } else if (miNumero < numeroSecreto) {
                System.out.println("El numero escrito es menor que el numero secreto");
            } else
                System.out.println("El numero es mayor que el numero secreto");
        }
    }
}