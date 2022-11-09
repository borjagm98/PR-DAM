package sesion09112022;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {

        // Declaración del array,
        // Este array almacenará las notas de las asignaturas del primer trimestre
        // de DAM: BD, ED, PROG, LM, SI, FOL.

        int [] notas_1trimestre = new int[5];

        notas_1trimestre[0] = 7;
        notas_1trimestre[1] = 8;
        notas_1trimestre[2] = 6;
        notas_1trimestre[3] = 5;
        notas_1trimestre[4] = 5;

        int [] notas_2trimestre = {7, 8, 9, 7, 4};

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < notas_2trimestre.length; i++){
            System.out.println("Introduce la nota: ");
            notas_2trimestre[i] = sc.nextInt();
        }

    }
}
