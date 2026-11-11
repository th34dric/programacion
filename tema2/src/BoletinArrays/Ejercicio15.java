package BoletinArrays;

public class Ejercicio15 {
    public static boolean[] cribaEratostenes(int num) {
        boolean[] array = new boolean[num+1];

        for (int i = 2; i < num; i++) {
            array[i] = true;
        }

        for (int i = 2; i < num/i; i++) {
            if (array[i]) {
                for (int j = i; j < num; j+=i) {
                    array[j] = false;
                }
            }
        }

        return array;
    }

    static void main(String[] args) {
        int num = MiEntradaSalida.leerEnteroPositivo("Introduce un numero");
        boolean[] array = cribaEratostenes(num);

        for (int i = 2; i < array.length; i++) {
            if (array[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
