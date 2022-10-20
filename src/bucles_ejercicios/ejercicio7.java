package bucles_ejercicios;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        int combinacion = 1234;

        for(int i = 0; i <= 3; i++){

            int entrada = 0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la combinación de la caja fuerte: ");
            entrada = sc.nextInt();

            if(entrada != combinacion){
                System.out.println("Has fallado");
            }else if (entrada == combinacion){
                System.out.println("Has acertado");
                break;
            }
        }
    }
}
