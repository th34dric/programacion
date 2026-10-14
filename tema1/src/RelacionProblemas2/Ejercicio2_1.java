package RelacionProblemas2;

public class Ejercicio2_1 {
    static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            if (i%7 == 0){
                System.out.printf("El numero %d es multiplo de 7 %n", i);
            }
            if (i%13 == 0) {
                System.out.printf("El numero %d es multiplo de 13 %n", i);
            }
        }
    }
}
