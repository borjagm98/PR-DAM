package sesion17112022;

public class arrayejercicio10 {
    public static void main(String[] args) {
        int [] arrayorigen = {1, 2, 3, 4, 5};
        int longitud = calcular_longitud(arrayorigen);
        System.out.println("La longitud del array es " + longitud);
    }
    public static int calcular_longitud(int[] a){
        int resultado;
        resultado = a.length;
        return resultado;
    }
}
