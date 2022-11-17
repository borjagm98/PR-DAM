package sesion16112022;

public class arrayejercicio7 {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};
        int [] listanumeros2 = new int[4];

        System.out.println("Array numeros "+java.util.Arrays.toString(numeros));
        listanumeros2 = numeros.clone();
        System.out.println("Array");
    }
}
