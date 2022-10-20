package condicionales_ejercicios;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        int horas, salario = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las horas trabajadas: ");
        horas = sc.nextInt();

        if (horas <= 40 && horas > 0) {
            salario = horas * 12;
        }else if(horas >= 41) {
            salario = horas * 16 - 4 * 40;
        }else{
            System.out.println("Error");
        }

        System.out.println("El salario es: "+salario);

    }
}
