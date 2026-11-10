package BoletinArrays;

public class Ejercicio14 {
    public static int encolar(int[] array, int contador) {
        if (contador == 10) {
            System.out.println("La cola está llena, no puedo encolar el elemento");
        } else {
            int num = MiEntradaSalida.leerEntero("Encolar");
            array[contador++] = num;
        }

        return contador;
    }

    public static int desapilar(int[] array, int contador) {
        if (contador == 0) {
            System.out.println("No hay elementos en la cola");
        } else {
            System.out.println("Desencolar:");
            array[contador--] = 0;
        }

        return contador;
    }

    static void main(String[] args) {
        int[] cola = new int[10];
        int contador = 0;
        int opcion;

        opcion = MiEntradaSalida.leerEnteroEnRango("Elige una opción (1. Encolar / 2. Desencolar / 3. Salir)", 1, 3);
        while (opcion == 1 || opcion == 2) {
            switch (opcion) {
                case 1:
                    contador = encolar(cola, contador);
                    System.out.printf("Pila:");
                    for (int i = 0; i < contador; i++) {
                        System.out.print(" " + cola[i] + " ");
                    }
                    System.out.println();
                    break;
                case 2:
                    contador = desapilar(cola, contador);
                    System.out.printf("Pila:");
                    for (int i = 0; i < contador; i++) {
                        System.out.print(" " + cola[i] + " ");
                    }
                    System.out.println();
                    break;
            }
            opcion = MiEntradaSalida.leerEnteroEnRango("Elige una opción (1. Encolar / 2. Desencolar / 3. Salir)", 1, 3);
        }
    }
}