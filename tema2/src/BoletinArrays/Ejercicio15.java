package BoletinArrays;

public class Ejercicio15 {
    public static int[] cribaEratostenes(int num) {
        int[] array = new int[num-1];

        for (int i = 0; i < num-1; i++) {
            for (int j = 2; j < num-1; j++) {
                if (j % array[i] == 0) {
                    array[i] = i+2;
                } else {
                    array[i] = 0;
                }
            }
        }



        return array;
    }

    static void main(String[] args) {
        int num = MiEntradaSalida.leerEnteroPositivo("Introduce un numero");
        int[] array = cribaEratostenes(num);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
