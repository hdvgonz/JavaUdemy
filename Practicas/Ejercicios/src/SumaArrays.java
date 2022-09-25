public class SumaArrays {
    public static void main(String[] args) {
        int tamano = 100;
        int [] arr = new int[tamano];
        int i = 0;
        int sum=0;
        int media;

        for ( i = 0; i<tamano;i++){
            arr[i] = i+1;
            sum = sum + arr[i];
            System.out.println("arr = " + arr[i]);
        }
        media = sum/tamano;
        System.out.println("suma del 1 al 100 es = " + sum);
        System.out.println("media = " + media);
    }
}
