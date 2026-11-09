package BoletinArrays;

public class Ejercicio9 {
    public static int[] metodoBurbuja(int[] unArray, boolean reverse) {
        int aux = 0;
        for (int i = 0; i < unArray.length; i++) {
            for (int j = 0; j < unArray.length-1-i; j++) {
                if (!reverse) {
                    if (unArray[j] > unArray[j+1]) {
                        aux = unArray[j];
                        unArray[j] = unArray[j+1];
                        unArray[j+1] = aux;
                    }
                } else {
                    if (unArray[j] < unArray[j+1]) {
                        aux = unArray[j];
                        unArray[j] = unArray[j+1];
                        unArray[j+1] = aux;
                    }
                }
            }
        }

        return unArray;
    }

    static void main(String[] args) {
        int[] miArray = new int[MiEntradaSalida.leerEntero("Introduce el tamaño del array")];
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = MiEntradaSalida.leerEntero("Introduce el elemento " + (i+1) + " del array");
        }

        boolean reverse = false;
        char sn = MiEntradaSalida.leerSiNo("Lo hacemos al reves?");
        if (sn == 'S') {
            reverse = true;
        }

        int[] array = metodoBurbuja(miArray, reverse);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
