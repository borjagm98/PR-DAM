package metodos_ejercicios;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        System.out.println("Área de circulo \n" +
                           "Área de triangulo \n" +
                           "Área de cuadrado \n" +
                           "Seleccione una opción: ");

        Scanner sc = new Scanner(System.in);
        String figura = sc.next().toUpperCase();
        switch(figura){

            case "circulo":
                System.out.println("Introduzca el radio");
                double radio = sc.nextDouble();
                double area = 0;
                area = circulo(radio);
                imprimir(area, figura);
                break;
            case "triangulo":
                System.out.println("Introduzca el radio");
                double base = sc.nextDouble();
                System.out.println("Introduzca la altura");
                double altura = sc.nextDouble();
                area = triangulo(base, altura);
                imprimir(area, figura);
                break;
            case "cuadrado":
                System.out.println("Introduzca el lado");
                double lado = sc.nextDouble();
                area = cuadrado(lado);
                imprimir(area, figura);
                break;
        }
    }
    private static double circulo(double lado){
        double resultado;
        resultado = lado * lado;
        return resultado;
    }

    private static double triangulo(double base, double altura){
        double resultado;
        resultado = (base * altura) / 2;
        return resultado;
    }

    private static double cuadrado(double lado){
        double resultado;
        resultado = lado * lado;
        return resultado;
    }

    public static void imprimir(double resultado) {
        System.out.println(resultado);
    }

}
