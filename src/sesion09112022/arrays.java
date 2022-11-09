package sesion09112022;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {

        // Creación de un array con valores
        int[] numeros = {1, 2, 3};

        // Creacion de un array con un maximo de 10 valores
        // numeros = new int[10]

        // Imprime la posicion [2] del array (Empieza por 0)
        System.out.println("La posicion 2 del array es: " + numeros[2]);

        int numero = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nuevo valor: ");
        numero = sc.nextInt();

        // Añadir un nuevo valor al final del array (sin sustituir ningun dato existente)
        numeros = Arrays.copyOf(numeros, numeros.length + 1);
        numeros[numeros.length -1 ] = numero;

        // Imprime la posicion [3] del array (Empieza por 0)
        System.out.println("Posicion 3 del array: " + numeros[3]);

        // Muestra todos los valores del array
        System.out.println("Todos los valores del array: " + Arrays.toString(numeros));

        // Muestra el total de valores del array
        System.out.println("Total de valores del array: " + numeros.length);

        // Otra forma de mostrar todos los valores del array
    }


}
