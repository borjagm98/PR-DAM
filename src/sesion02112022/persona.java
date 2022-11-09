package sesion02112022;

import java.time.LocalDate;

public class persona {

    LocalDate current_date = LocalDate.now();
    final int anyo_actual = current_date.getYear();

    public String nombre;

    public int edad;
    public String anyo_nacimiento;

    public String obtenerAnyo(int edad) {
        String anyo;
        anyo = String.valueOf(anyo_actual -edad);
        return anyo;
    }
}
