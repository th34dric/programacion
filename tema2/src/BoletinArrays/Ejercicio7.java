package BoletinArrays;

public class Ejercicio7 {
    public static boolean contieneElemento(int[] unArray, int elemento) {
        for (int i = 0; i < unArray.length; i++) {
            if (unArray[i] == elemento) {
                return true;
            }
        }
        return false;
    }
}
