package grupal;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;


public class horas_paises {
    public static void main(String[] args) {

        String pais= "";
        Scanner sc = new Scanner(System.in);
        System.out.println("\nElige un pais para saber su horario (): ");
        pais = sc.next();

        if (pais == "") {
            Locale local = new Locale("pt", "BR");
        }else if (pais == ""){
            Locale local = new Locale("", "");
        }else if (pais == ""){
            Locale local = new Locale("", "");
        }else{
            System.out.println("Has introducido un valor incorrecto");
        }

       // Calendar c = Calendar.getInstance(local);
        //System.out.println(c.getTime());

        //DateFormat dt = DateFormat.getDateInstance(DateFormat.LONG, local);
//        String s = dt.format(c.getTime());
        //System.out.println(s);
    }
}
