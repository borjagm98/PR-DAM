package sesion02112022;

import java.util.Scanner;

public class usopersona {
    public static void main(String[] args) {
        persona persona = new persona();
        System.out.println("Introduce el nombre de la persona: ");
        Scanner sc = new Scanner(System.in);
        persona.nombre=sc.next();
        System.out.println("Introduce la edad de la persona: ");
        persona.edad = sc.nextInt();
        System.out.println(persona.nombre+"nacio en el año "+persona.obtenerAnyo(persona.edad));
    }
}
