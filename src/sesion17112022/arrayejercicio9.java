package sesion17112022;

public class arrayejercicio9 {
    public static void main(String[] args) {
        int [] arrayorigen = {1,2,3,4,5};

        int [] arraydestino1 = new int[5];
        System.arraycopy(arrayorigen, 0, arraydestino1, 0, 5);
        System.out.println(java.util.Arrays.toString(arraydestino1));

        int [] arraydestino2 = new int[5];
        System.arraycopy(arrayorigen, 0, arraydestino2, 0, 4);
        System.out.println(java.util.Arrays.toString(arraydestino2));

        int [] arraydestino3 = new int[5];
        System.arraycopy(arrayorigen, 0, arraydestino3, 0, 3);
        System.out.println(java.util.Arrays.toString(arraydestino3));

        int [] arraydestino4 = new int[5];
        System.arraycopy(arrayorigen, 0, arraydestino4, 0, 3);
        System.out.println(java.util.Arrays.toString(arraydestino4));
    }
}
