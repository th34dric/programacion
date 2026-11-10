package BoletinArrays;

public class Ejercicio13 {
    public static int apilar(int[] array, int contador) {
        if (contador == 10) {
            System.out.println("La pila está llena, no puedo apilar el elemento");
        } else {
            int num = MiEntradaSalida.leerEntero("Apilar");
            array[contador++] = num;
        }

        return contador;
    }

    public static int desapilar(int[] array, int contador) {
        if (contador == 0) {
            System.out.println("No hay elementos en la pila");
        } else {
            System.out.println("Desapilar:");
            array[contador--] = 0;
        }

        return contador;
    }

    static void main(String[] args) {
        int[] pila = new int[10];
        int contador = 0;
        int opcion;

        opcion = MiEntradaSalida.leerEnteroEnRango("Elige una opción (1. Apilar / 2.Desapilar / 3.Salir)", 1, 3);
        while (opcion == 1 || opcion == 2) {
            switch (opcion) {
                case 1:
                    contador = apilar(pila, contador);
                    System.out.printf("Pila:");
                    for (int i = 0; i < contador; i++) {
                        System.out.print(" " + pila[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    contador = desapilar(pila, contador);
                    System.out.printf("Pila:");
                    for (int i = 0; i < contador; i++) {
                        System.out.print(" " + pila[i] + " ");
                    }
                    System.out.println();
                    break;
            }
            opcion = MiEntradaSalida.leerEnteroEnRango("Elige una opción (1. Apilar / 2.Desapilar / 3.Salir)", 1, 3);
        }
    }
}
