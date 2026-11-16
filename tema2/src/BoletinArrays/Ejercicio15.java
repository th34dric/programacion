package BoletinArrays;

public class Ejercicio15 {
    public static boolean[] cribaEratostenes(int num) {
        boolean[] array = new boolean[num];

        for (int i = 2; i < num/2; i++) {
            if (!array[i]) {
                for (int j = i*2; j < num; j+=i) {
                    array[j] = true;
                }
            }
        }

        return array;
    }

    static void main(String[] args) {
        int num = MiEntradaSalida.leerEnteroPositivo("Introduce un numero");
        boolean[] array = cribaEratostenes(num);

        for (int i = 2; i < array.length; i++) {
            if (!array[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
