public class Ejercicio1Array {

    public static void main(String[] args) {
        int tamano = 100;
        int [] arr = new int[tamano];
        int i = 0;
        for ( i = 0; i<tamano;i++){
            arr[i] = i+1;
         System.out.println("arr = " + arr[i]);
        }

    }
}
