import java.util.Scanner;

public class EjemploArregloDesplazarPosicion {
    public static void main(String[] args) {

        int[] arreglo = new int [10];
        int ultimo;
        Scanner s = new Scanner(System.in);
        int tam = arreglo.length;
        for (int i = 0; i < tam ; i++)
        {
            System.out.print("Digite un elemento");
            arreglo[i] = s.nextInt();
        }

        ultimo = arreglo[arreglo.length-1];

        for (int i= arreglo.length-2; ) {

        }



    }
}
