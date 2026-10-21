package RelacionProblemas4;

import java.util.Scanner;

public class Ejercicio4_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeroInicial;
        int aux;
        int puente;
        int numeroFinal = 0;

        do {
            System.out.println("Introduce un numero positivo");
            numeroInicial = sc.nextInt();
            aux = numeroInicial;
        } while (numeroInicial < 0);

        while (numeroInicial != 0) {
            puente = numeroInicial % 10;
            numeroFinal = (numeroFinal * 10) + puente;
            numeroInicial = numeroInicial / 10;
        }

        if (numeroFinal == aux) {
            System.out.println("El numero " + numeroFinal + " es capicuo");
        } else {
            System.out.println("El numero " + aux + " no es capicuo ya que al reves seria: " + numeroFinal);
        }
    }
}
