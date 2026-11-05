package BoletinArrays;

public class Ejercicio4 {
    static final int NUMEROS_TOTALES = 6000;

    static void main(String[] args) {
        double media = 0;
        int numero = 0;
        int[] arrayContador = new int[10];
        double porcentajeTotal = 0;
        int masRepetido = 0;
        int menosRepetido = 0;
        int max;
        int min;

        for (int i = 0; i < NUMEROS_TOTALES; i++) {
            numero = (int) (Math.random() * 100);
            media += numero;
            arrayContador[numero % 10]++;
        }

        max = arrayContador[0];
        min = arrayContador[0];
        for (int i = 0; i < arrayContador.length; i++) {
            if (arrayContador[i] > max) {
                max = arrayContador[i];
                masRepetido = i;
            }
            if (arrayContador[i] < min) {
                min = arrayContador[i];
                menosRepetido = i;
            }
        }

        System.out.println("La media de los numeros es " + (media / NUMEROS_TOTALES));
        System.out.printf("El numero en que mas numeros terminan es el %d%n", masRepetido);
        System.out.printf("El numero en que menos numeros terminan es el %d%n", menosRepetido);
        for (int i = 0; i < 10; i++) {
            System.out.printf("El nº%d se ha repetido %d veces. Esto equivale a un %.2f%%%n", i, arrayContador[i], ((arrayContador[i]/(double)NUMEROS_TOTALES)*100));
            porcentajeTotal += ((arrayContador[i]/(double)NUMEROS_TOTALES)*100);
        }
        System.out.printf("La suma de todos los porcentajes es equivalente al %.2f%%. El %% medio para cada contador es de %.2f%%", porcentajeTotal, (porcentajeTotal/10));
    }
}
