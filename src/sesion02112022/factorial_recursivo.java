package sesion02112022;

import java.util.Scanner;

public class factorial_recursivo {
    public static long factorial_recursivo(long numero){
        if (numero <= 1)
            return 1;
        return numero * factorial_recursivo(numero - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero para calcular su factorial");
        long numero = 0;
        numero = sc.nextLong();
        System.out.println("El factorial de 3 es: "+factorial_recursivo(3));



    }
}
