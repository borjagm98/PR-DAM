package sesion25112022;

import java.util.Scanner;

public class ejercicio_array_enumerado {
    public static void main(String[] args) {

        double [][] array_1 = new double[2][3];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < array_1.length; i++){
            for(int j = 0; j < array_1[i].length; j++){
                System.out.println("Introduce la nota: ");
                array_1[i][j] = sc.nextDouble();

                switch (i){
                    case 1:
                        System.out.println("Introduce practica 1 de programacion");
                        break;
                    case 2:
                        System.out.println("Introduce practica 2 de programacion");
                        break;
                    case 3:
                        System.out.println("Introduce practica nota del examen de programacion");
                        break;
                    default:
                        System.out.println("Error");
                }

                switch (j){
                    case 1:
                        System.out.println("Introduce practica 1 de bd");
                        break;
                    case 2:
                        System.out.println("Introduce practica 2 de bd");
                        break;
                    case 3:
                        System.out.println("Introduce practica nota del examen de bd");
                        break;
                    default:
                        System.out.println("Error");
                }
            }
        }





    }
}
