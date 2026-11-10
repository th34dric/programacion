package RelacionProblemas3;

import java.util.Scanner;

public class Ejercicio3_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int numeroAlumnos;
        int notas = 0;
        int aprobados = 0;
        int suspensos = 0;
        int porcentajeAprobados;
        int porcenajeSuspendidos;

        System.out.println("¿Cuantos alumnos hay en el examen?");
        numeroAlumnos = sc.nextInt();

        for (int i = 0; i < numeroAlumnos; i++) {

            System.out.println("Dime la nota del alumno");
            notas = sc.nextInt();
            if (notas >=5){
                aprobados++;
            }else {
                suspensos++;
            }
        }
        porcentajeAprobados = aprobados * 100 / numeroAlumnos;
        porcenajeSuspendidos = suspensos * 100 / numeroAlumnos;

        System.out.println("hay aprobados " + aprobados + " y hay suspendidos " + suspensos);
        System.out.println("El porcentaje de aprobados es " + porcentajeAprobados + "%");
        System.out.println("El porcentaje de suspenso es " + porcenajeSuspendidos + "%");
    }
}