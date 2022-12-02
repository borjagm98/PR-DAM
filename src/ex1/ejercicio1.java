package ex1;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        String texto ="";
        texto = solicitar_usuario(texto);
        String [] array_string = convertir_array_string(texto);
        int[] array_entero = convertir_array_a_enteros(array_string);
        int sumatorio = suma_enteros(array_entero);
    }

    private static int suma_enteros(int[] array_entero) {
        int resultado = 0;
        for (int i = 0; i < array_entero.length;i++){
            resultado = resultado + array_entero[i];
        }

        return resultado;
    }

    private static int[] convertir_array_a_enteros(String[] array_string) {
        int[] array_resultado = new int[array_string.length];
        for (int i = 0; i<array_string.length;i++){
            array_resultado[i] = Integer.parseInt(array_string[i]);
        }
        return array_resultado;
    }

    private static String[] convertir_array_string(String texto) {
        String[] array_string = texto.split(",");
        return array_string;
    }

    private static String solicitar_usuario(String texto) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceme un texto compuesto por numeros y separados por ,: ");
        texto = sc.next();
        return texto;
    }
}
