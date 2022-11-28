package metodos_ejercicios;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int base, exponente = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base: ");
        base = sc.nextInt();
        System.out.println("Introduce el exponente");
        exponente = sc.nextInt();
        double resultado = calcularPotencia(base, exponente);
    }

    private static double calcularPotencia(double base, double exponente) {

        double resultado = 0;

        resultado = Math.pow(base, exponente);

        return resultado;

    }
}
