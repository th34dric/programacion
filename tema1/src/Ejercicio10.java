import java.util.Scanner;

public class Ejercicio10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un caracter");
        char caracter = sc.nextLine().charAt(0);
        System.out.println("Introduce dos numeros");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        switch (caracter){
            case '+':
                System.out.println("La suma es " + (num1+num2));
                break;
            case '-':
                System.out.println("La resta es " + (num1-num2));
                break;
            case '*':
                System.out.println("La multiplicacion es " + num1*num2);
                break;
            case '/':
                System.out.println("La division es " + num1/num2);
                break;
            default:
                System.out.println("ERROR");
        }
    }
}
