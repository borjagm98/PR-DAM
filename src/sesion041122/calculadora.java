package sesion041122;

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        System.out.println("\nCalculadora: \n" +
                "1. Suma \n" +
                "2. Resta \n" +
                "3. Multiplicación \n" +
                "4. División \n");

        int operacion, resultado = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nElige una opción: ");
        operacion = sc.nextInt();

        int numero1 = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\nIntroduce el primer número:");
        numero1 = sc.nextInt();

        int numero2 = 0;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("\nIntroduce el segundo número:");
        numero2 = sc.nextInt();

        if (operacion == 1){
            System.out.println("\nHas elegido la suma.\n");
            suma(numero1, numero2);
        }

    }

    static int suma(int numero1, int numero2){
        int resultado = numero1 + numero2;
        System.out.println("La suma de " +numero1+ " + " +numero2+ " es: "+resultado);
        return resultado;
    }

    static int resta(int numero1, int numero2){
        int resultado = numero1 - numero2;
        return resultado;
    }

    static int multi(int numero1, int numero2){
        int resultado = numero1 * numero2;
        return resultado;
    }

    static int func(int numero1, int numero2){
        int resultado = numero1 / numero2;
        return resultado;
    }
}
