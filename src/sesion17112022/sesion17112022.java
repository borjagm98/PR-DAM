package sesion17112022;

public class sesion17112022 {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};
        System.out.println("Arras numeros "+java.util.Arrays.toString(numeros));
        int [] listanumeros2 = java.util.Arrays.copyOf(numeros, numeros.length);
        System.out.println("Array listanumeros2"+ java.util.Arrays.toString(listanumeros2));
        int [] listanumeros3 = java.util.Arrays.copyOf(numeros, 3);
        System.out.println("Array listanumeros3"+ java.util.Arrays.toString(listanumeros3));
        int [] listanumeros4 = java.util.Arrays.copyOfRange(numeros, 0, 3);
        System.out.println("Array listanumeros4"+ java.util.Arrays.toString(listanumeros4));
    }
}
