package metodos_ejercicios;

import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Introduce el número: ");
        num = sc.nextInt();

        if (es_primo(num)){
            System.out.println(num+" es primo.");
        } else {
            System.out.println(num+" no es primo.");
        }

    }

    private static boolean es_primo (int n){

        int num =n;
        int div = 2;
        boolean primo=false;

        if (num == 2){
            primo = true;
        }else{

            while (num != 1) {

                if (num % div == 0) {
                    num = num / div;
                }else{

                    div++;

                    if (num == div) {
                        primo = true;
                    }
                }
            }
        }
        return primo;
    }

}