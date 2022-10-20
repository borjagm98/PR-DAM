package bucles_ejercicios;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        int entrada = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para calcular su tabla de multiplicar: ");
        entrada = sc.nextInt();

        for(int i = 0; i <= 10; i++){
            System.out.println(entrada + " * " + i + " = " + entrada * i);
        }
    }
}
