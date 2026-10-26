import java.util.Scanner;

public class BucleWhile {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserta un numero");
        int num = sc.nextInt();
        int i = 2;
        boolean encontrado = false;

        while (!encontrado){
            if (num%i == 0) {
                encontrado = true;
            }
            i++;
        }
        System.out.printf("El primer divisor de %d es %d", num, i-1);
    }
}
