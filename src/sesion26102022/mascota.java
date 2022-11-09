package sesion26102022;

public class mascota {
    private String nombre;
    public int edad;
    private String raza;
    private String color;
    private int peso;
    private int altura;
    private char genero;

    public mascota(){
        nombre = "default";
        edad = 0;
        raza = "default";
        color = "default";
        peso = 0;
        altura = 0;
        genero = 'd';
    }

    //funcion
    public char getGenero(){
        return genero;
    }

    //procedimiento
    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad(){
        return edad;
    }

    public static void main(int edad) {
       // this.edad = edad;
    }

}