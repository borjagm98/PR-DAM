package bucles_ejercicios;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        for(int i = 0; i <= 3; i++){

            int entrada, longitud = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce un número: ");
            entrada = sc.nextInt();

            String conversion_entrada_a_str = Integer.toString(entrada);

            longitud = conversion_entrada_a_str.length();

            System.out.println("El número introducido tiene: " + longitud + " digito(s)");

        }
    }
}
