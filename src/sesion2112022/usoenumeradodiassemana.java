package sesion2112022;

import java.util.Scanner;

public class usoenumeradodiassemana {
    public static void main(String[] args) {
        int valor = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un valor de 1 a 7");
        valor = sc.nextInt();
        DiasSemana dia = DiasSemana.LUNES;
        switch(valor){
            case 1: System.out.println("es "+dia.LUNES); break;
            case 2: System.out.println("es "+dia.MARTES); break;
            case 3: System.out.println("es "+dia.MIERCOLES); break;
            case 4: System.out.println("es "+dia.JUEVES); break;
            case 5: System.out.println("es "+dia.VIERNES); break;
            case 6: System.out.println("es "+dia.SABADO); break;
            case 7: System.out.println("es "+dia.DOMINGO); break;
            default: System.out.println("no se ha introducido el número correcto");
        }
    }
}
