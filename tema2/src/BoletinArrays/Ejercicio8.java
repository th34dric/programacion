package BoletinArrays;

public class Ejercicio8 {
    public static int buscarElemento(int[] unArray, int elemento) {
        for (int i = 0; i < unArray.length; i++) {
            if (unArray[i] == elemento) {
                return i;
            }
        }
        return -1;
    }
}
