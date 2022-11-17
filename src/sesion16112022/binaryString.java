package sesion16112022;

import java.util.Arrays;
import java.util.Scanner;

public class binaryString {
    public static void main(String[] args) {
        String[] lista={"Mark", "Elias", "Yassin"};
        String[] lista2 = new String[3];
        int posicion = -1 ;
        String busca;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué nombre quiere buscar?");
        busca = sc.next();
        posicion = buscar(lista, busca);
        imprimir(posicion,busca,lista);
        lista2 = lista.clone();
        System.out.println(lista2.toString());
    }

    private static void imprimir(int posicion, String nombre, String[] list){
        System.out.println("El array introducido es "+Arrays.toString(list));
        if(posicion == -1){
            System.out.println("El elemento que buscabas: "+nombre+" no está");
        }else {
            System.out.println("El elemento "+nombre+ "que buscas está en la posicion: " +posicion);
        }
    }
    private static int buscar(String[] lista, String busca){
        int posicion = -1;
        for(int i = 0; i < lista.length; i++ ){
            if(busca.equals(lista[i])){
                posicion = i;
            }
        }
        return posicion;
    }
}
