package condicionales_ejercicios;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {

        int nota1 = 0;
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

        System.out.println("La media es: "+ (nota1 + nota2 + nota3) / 3);
    }
}
