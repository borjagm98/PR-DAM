package condicionales_ejercicios;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        String nota = "";

        int nota1, media = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera nota: ");
        nota1 = sc.nextInt();

        int nota2 = 0;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduce la segunda nota: ");
        nota2 = sc2.nextInt();

        int nota3 = 0;
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduce la tercera nota: ");
        nota3 = sc3.nextInt();

        if (nota1 <= 0 && nota2 <= 0 && nota3 <= 0){
            System.out.println("Introduce un número mayor o igual a 0.");
        }

        media = (nota1 + nota2 + nota3) / 3;

        if (media <=4){
            nota = "Insuficiente";
        }else if (media == 5){
            nota = "Suficiente";
        }else if (media == 6){
            nota = "Bien";
        }else if (media == 7 && media == 8){
            nota = "Notable";
        }else if (media == 9 && media == 10){
            nota = "Sobresaliente";
        }

        System.out.println("La media es: "+ media + " - " + nota);
    }
}
