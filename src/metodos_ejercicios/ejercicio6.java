package metodos_ejercicios;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Introduce la moneda a cambiar: ");
        Scanner sc = new Scanner(System.in);
        double dinero_a_cambiar = sc.nextDouble();
        System.out.println("¿A que moneda quieres cambiar? ");
        String moneda_a_cambiar = sc.next().toLowerCase();
        conversor(dinero_a_cambiar, moneda_a_cambiar);
    }

    private static void conversor(double dinero_a_cambiar, String moneda_a_cambiar) {
        final double DOLAR = 1.25;
        final double LIBRA = 0.86;
        final double YENES = 129.852;
        double resultado = 0;

        switch (moneda_a_cambiar){
            case "DOLAR": resultado = dinero_a_cambiar * DOLAR; break;
            case "LIBRA": resultado = dinero_a_cambiar * LIBRA; break;
            case "YENES": resultado = dinero_a_cambiar * YENES; break;
            default: System.out.println("Entrada no valida");
        }
        System.out.println("La cantidad en euros " + dinero_a_cambiar + "es en "+moneda_a_cambiar+resultado);

    }


}
