package condicionales_ejercicios;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        String dia = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un día de la semana: ");
        dia = sc.next();

        switch (dia){
            case "lunes": System.out.println("Bases de Datos"); break;
            case "martes": System.out.println("Lenguaje de Marcas"); break;
            case "miercoles": System.out.println("Programación"); break;
            case "jueves": System.out.println("Bases de Datos"); break;
            case "viernes": System.out.println("Fol"); break;
            default:
                System.out.println("Has introducido un día inválido.");
        }
    }
}
