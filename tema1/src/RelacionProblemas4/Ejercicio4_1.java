package RelacionProblemas4;

import java.util.Scanner;

public class Ejercicio4_1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroInicial;
        int puente;
        int numeroFinal = 0;

        do {
            System.out.println("Introduce un numero positivo");
            numeroInicial = sc.nextInt();
        } while (numeroInicial < 0);

        while (numeroInicial != 0) {
            puente = numeroInicial % 10;
            numeroFinal = (numeroFinal * 10) + puente;
            numeroInicial = numeroInicial / 10;
        }

        System.out.println(numeroFinal);
    }
}
