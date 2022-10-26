package condicionales_ejercicios;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        int variable1, resultado = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("El formato es ax+b = 0, introduce el primer termino: ");
        variable1 = sc.nextInt();

        int variable2 = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduce el segundo termino: ");
        variable2 = sc1.nextInt();

        int variable3 = 0;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce el tercer termino: ");
        variable3 = sc2.nextInt();

        resultado = (variable3 - variable2) / variable1;

        System.out.println("Resultado: "+resultado);

    }
}