package sesion17112022;

import java.util.Arrays;

public class arrayargumento {
    public static void main(String[] args) {
        int [] arrayorigen = {1, 2, 3, 4, 5};
        int longitud = calcular_longitud(arrayorigen);
        imprimirArray(arrayorigen, longitud);
    }
    private static void imprimirArray(int[] arrayorigen, int longitud){
        System.out.println("El array: " + Arrays.toString(arrayorigen)+" tiene una longiud de: "+ longitud);
    }
    private static int calcular_longitud(int [] arrayorigen){
        int resultado= -1;
        resultado = arrayorigen.length;
        return resultado;
    }
}