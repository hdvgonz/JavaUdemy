import java.util.Scanner;

public class EjemploArreglosDetectarOrden {
    public static void main(String[] args) {

        Scanner o = new Scanner(System.in);
        int[] a = new int[7];

        System.out.println("Ingrese 7 números");

        for(int i = 0; i < a.length; i ++) {
            a[i] = o.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length-1; i++) {

            if(a[i] > a[i +1] ) {
                descendente = true;
            }

            if(a[i] < a[i +1] ) {
                ascendente = true;
            }
        }
        if(ascendente == true && descendente == true) {
            System.out.println("Está desordenado");
        }
        if(ascendente == false && descendente == false) {
            System.out.println("Son todos iguales");
        }

        if(ascendente == true && descendente == false) {
            System.out.println("Arreglo ascendente");
        }

        if(ascendente == false && descendente == true) {
            System.out.println("Arreglo Descendente");
        }
    }
}
