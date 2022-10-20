package condicionales_ejercicios;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {

        String entrada_mes = "";
        Scanner sc0 = new Scanner(System.in);
        System.out.println("Introduce el mes: ");
        entrada_mes = sc0.nextLine();

        int entrada_dia = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduce el dia: ");
        entrada_dia = sc1.nextInt();

        if (entrada_mes == "marzo"){
            if (entrada_dia >= 21 && entrada_dia <= 31){
                System.out.println("Aries");
            }
        }else if (entrada_mes == "abril") {
            if (entrada_dia >= 1 && entrada_dia <= 19) {
                System.out.println("Aries");
            }
        }else if (entrada_mes == "abril") {
            if (entrada_dia >= 20 && entrada_dia <= 30) {
                System.out.println("Tauro");
            }
        }else if (entrada_mes == "mayo") {
            if (entrada_dia >= 1 && entrada_dia <= 20) {
                System.out.println("Tauro");
            }

        }
    }
}
