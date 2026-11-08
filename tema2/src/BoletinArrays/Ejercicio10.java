package BoletinArrays;

public class Ejercicio10 {
    public static int tamano2Array(int[] miArray) {
        int pos = 0;
        int tamano = 0;
        int aux = miArray[pos];
        int[] arrayAux = new int[miArray.length];
        for (int i = 0; i < miArray.length; i++) {
            if (aux == miArray[i]) {
                pos++;
                aux = miArray[pos];
                i = 0;
            }

            if (i == miArray.length-1) {
                tamano++;
                arrayAux[tamano] = aux;
            }

            if (pos == miArray.length-1) {
                break;
            }
        }

        return tamano;
    }

    static void main(String[] args) {
        int[] miArray = new int[MiEntradaSalida.leerEntero("Introduce el tamaño del array")];
        for (int i = 0; i < miArray.length; i++) {
            miArray[i] = MiEntradaSalida.leerEntero("Introduce el elemento " + (i+1) + " del array");
        }

        System.out.println(tamano2Array(miArray));
    }
}
