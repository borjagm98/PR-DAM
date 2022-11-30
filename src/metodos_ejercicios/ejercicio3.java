package metodos_ejercicios;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

        String palabra = null;
        Scanner sc = new.Scanner(System.in);
        System.out.println("Introduzca la palabra con la que quieres trabajar.");
        palabra = sc.next();

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
        System.out.println("Introduce una opcion del menu: ");
        opcion = sc1.nextInt();

        switch (opcion){
            case 1:
                System.out.println("La longitud de "+palabra+" es"+longitud_string(palabra));
                break;
            case 2:
                System.out.println("La inicial de "+palabra+" es"+inicial_string(palabra));
                break;
            case 3:
                System.out.println("La inicial de "+palabra+" es"+inicial_string(palabra));
                break;
            case 4:

            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default: System.out.println("Opcion no valida.");
        }

    }
    public static int longitud_string(String palabra){
        int resultado = 0;
        resultado = palabra.length();

        return resultado;
    }
    public static char inicial_string(String palabra){
        char inicial;
        inicial = palabra.charAt(0);

        return inicial;
    }
    public static char final_string(String palabra){
        char ultima;
        ultima = palabra.charAt(palabra.length()-1);
        return ultima;
    }
    public static String quitar_espacios(String palabra){
        String pal = "";
        pal = palabra.trim();
        return pal;
    }
    public static void quitar_espacios2(String palabra){
        System.out.println("La palabra libre de espacios es: " +palabra.trim());
    }
    public static String mayusculas(String palabra){
        String resultado;
        resultado = palabra.toUpperCase();
        return resultado;
    }
    public static void minusculas(String palabra){
        System.out.println("La palabra en minusculas es: "+palabra.toLowerCase());
    }
    public static String remplazo(String palabra, char letra_aremplazar, char letra_nueva){
        String palabra_resultante = null;
        palabra_resultante = palabra.replace(letra_aremplazar, letra_nueva);
        return palabra_resultante;
    }
    public static boolean esvacio(String palabra){
        boolean resultado = false;
        resultado = palabra.isEmpty();
        return resultado;
    }
    public static char[] pasararrachar(String palabra){
        char[] array;
        array = palabra.toCharArray();
        return array;
    }

}
