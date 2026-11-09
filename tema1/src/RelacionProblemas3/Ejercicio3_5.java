package RelacionProblemas3;

import java.util.Scanner;

public class Ejercicio3_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numero;
        boolean esPrimo = true;

        System.out.println("Escribe un numero y te digo si es primo");
        numero = sc.nextInt();

        for (int i = 2; i <numero ; i++) {
            if (numero % i == 0){
                esPrimo = false;
            }
        }
        if (esPrimo){
            System.out.println("El numero es primo");
        }else {
            System.out.println("El numero no es primo");
        }
    }
}
