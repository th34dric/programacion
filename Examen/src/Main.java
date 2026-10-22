import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombrePiloto;
        int numeroVueltas = 0;
        Double tiempoObjetivo = 0.0;
        double tiempoPorVuelta = 0.0;
        double tiempoTotal = 0.0;
        double tiempoMedio = 0.0;
        double mejorTiempo = Double.MAX_VALUE;
        int mejorVuelta = 0;
        int vueltasMejoradas = 0;
        boolean preparadoCompetir = true;

        System.out.println("Bienvenido a los entrenamientos del GP de Isla Cristina de F1");
        System.out.print("Introduce el nombre del piloto: ");
        nombrePiloto = sc.nextLine();

        while (numeroVueltas < 3 || numeroVueltas > 10) {
            System.out.print("Número de vueltas: ");
            numeroVueltas = sc.nextInt();
            if (numeroVueltas < 3 || numeroVueltas > 10) {
                System.out.println("Introduce un número entre 3 y 10");
            }
        }

        sc.nextLine();

        while (tiempoObjetivo <= 0) {
            System.out.print("Tiempo objetivo: ");
            tiempoObjetivo = Double.parseDouble(sc.nextLine());
            if (tiempoObjetivo <= 0) {
                System.out.println("Introduce un número mayor que 0");
            }
        }

        for (int i = 1; i <= numeroVueltas; i++) {
            System.out.printf("Vuelta %d: ", i);
            tiempoPorVuelta = Double.parseDouble(sc.nextLine());
            while (tiempoPorVuelta <= 0) {
                System.out.println("Introduce un número mayor que 0");
                System.out.printf("Vuelta %d: ", i);
                tiempoPorVuelta = Double.parseDouble(sc.nextLine());
            }

            tiempoTotal += tiempoPorVuelta;

            if (tiempoPorVuelta < tiempoObjetivo) {
                System.out.println("Objetivo mejorado");
                vueltasMejoradas++;
            } else if (tiempoObjetivo.equals(tiempoPorVuelta)) {
                System.out.println("Objetivo igualado");
            } else {
                System.out.println("Por encima del objetivo");
            }

            if (mejorTiempo > tiempoPorVuelta) {
                mejorTiempo = tiempoPorVuelta;
                mejorVuelta = i;
            }
        }

        tiempoMedio = tiempoTotal/numeroVueltas;

        if ((tiempoMedio <= tiempoObjetivo) && (vueltasMejoradas >= numeroVueltas/2)) {
            preparadoCompetir = true;
        } else {
            preparadoCompetir = false;
        }

        System.out.println("------------INFORME------------");
        System.out.println();
        System.out.println("Piloto: " + nombrePiloto);
        System.out.println("Tiempo total: " + tiempoTotal);
        System.out.println("Tiempo medio por vuelta: " + tiempoMedio);
        System.out.println("Mejor tiempo: " + mejorTiempo);
        System.out.println("Conseguido en la vuelta " + mejorVuelta);
        System.out.println("Vueltas que mejoran el objetivo: " + vueltasMejoradas);
        if (preparadoCompetir) {
            System.out.println("Preparado para competir");
        } else {
            System.out.println("Necesita otra tanda de entrenamiento");
        }

    }
}
