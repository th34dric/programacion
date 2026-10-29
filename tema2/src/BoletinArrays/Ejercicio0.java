package BoletinArrays;//crea manualmente un array de 5 posiciones y muestra los elementos por pantalla

public class Ejercicio0 {
    static void main(String[] args) {
        int miArray[] = {2, 3, 6, 7, 1};

        for (int i = 0; i < miArray.length; i++) {
            System.out.printf("Elemento %d: %d%n", i, miArray[i]);
        }
    }
}
