package BoletinArrays;

public class Ejercicio10 {
    static void main(String[] args) {
        int[] miArray = new int[MiEntradaSalida.leerEntero("Introduce el tamaño del array")];
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = MiEntradaSalida.leerEntero("Introduce el elemento " + (i+1) + " del array");
        }

        boolean igual;
        int contador = 0;
        int[] array2 = new int[miArray.length];
        for (int i = 0; i < miArray.length; i++) {
            igual = false;
            for (int j = 0; j < miArray.length; j++) {
                if (miArray[i] == array2[j]) {
                    igual = true;
                }
            }

            if (!igual) {
                array2[contador++] = miArray[i];
            }
        }

        int[] array3 = new int[contador];
        for (int i = 0; i < contador; i++) {
            array3[i] = array2[i];
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
