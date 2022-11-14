package sesion14112022;

import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {

        //String
        String nombre1="Sofia";
        String nombre2="Elena";

        if (nombre1==nombre2){
            System.out.println("Los nombres son iguales");
        }else{
            System.out.println("Los nombres no son iguales");
        }

        //Int
        int[] numero1= {1,2,3,4};
        int[] numero2={1,2};
        if (Arrays.equals(numero1, numero2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

        //String comparativa arrays
        String[] string1= {"Elena","Marta","Sofia"};
        String[] string2={"Sofia","Elena","Marta"};
        Arrays.sort(string2);
        if (Arrays.equals(string1, string2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

    }
}