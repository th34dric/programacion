import java.util.Scanner;

public class Ejercicio2_7 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int contador = 0;
        int media = 0;

        do {
            System.out.println("Introduce numeros para hacer la media (negativo para terminar):");
            num = sc.nextInt();
            media += num;
            contador++;
        } while (num >= 0);

        System.out.println("La media de los numeros es " + (((double)media-num)/(contador-1)));
    }
}
