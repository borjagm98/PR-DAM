package condicionales_ejercicios;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        int hora = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una hora: ");
        hora = sc.nextInt();

        if (hora >= 6 && hora <= 12){
            System.out.println("Buenos días");
        }else if(hora >= 13 && hora <= 20){
            System.out.println("Buenas tardes");
        }else if(hora >= 21 && hora <= 24 || (hora >=0 && hora <=5)){
            System.out.println("Buenas noches");
        }else{
            System.out.println("Has introducido un número inválido");
        }
    }
}
