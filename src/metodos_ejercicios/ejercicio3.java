package metodos_ejercicios;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        String entrada = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una string: ");
        entrada = sc.next();

        System.out.println("Elige una opcion del siguiente menu: \n" +
                "1- Longitud del string.\n" +
                "2- Inicial del string.\n" +
                "3- Última lera del string.\n" +
                "4- Quitar espacios.\n" +
                "5- Pasar a mayúsculas del string.\n" +
                "6- Pasar a minúsculas del string.\n" +
                "7- Reemplazar una letra por otra que se solicita al usuario y mostrar el resultado de ese remplazo.\n" +
                "8- Esvacio.\n" +
                "9- Pasar a arraydechar.\n");

        Scanner sc1 = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Introduce una opcion: ");
        opcion = sc1.nextInt();

        switch (opcion){
            case 1:
                longitud_string(entrada);
                break;
            case 2:
                inicial_string(entrada);
                break;
            case 3:
                ultima_letra();
                break;
            case 4:
                quitar_espacios();
                break;
            case 5:
                pasar_mayusculas();
                break;
            case 6:
                pasar_minusculas();

        }
    }

    private static int longitud_string(String entrada) {
        int longitud = entrada.length();

        return longitud;
    }
    private static int inicial_string(String entrada) {
        int 
    }
    private static void ultima_letra() {
    }
    private static void quitar_espacios() {
    }
    private static void pasar_minusculas() {
    }
    private static void pasar_mayusculas() {
    }

}
