import java.sql.Array;
import java.util.Scanner;

public class EjemploArreglosBuscarEnteros {
    public static void main(String[] args) {

        int [] numeros;
        numeros = new int [10];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i ++) {
            System.out.print("Ingrese elemento" +
                    "#" + (i+1));
            numeros[i] = s.nextInt();
        }
        System.out.println("\r\nIngrese numero a buscar");
        int numBuscar = s.nextInt();
        int i = 0;

        while(i < numeros.length && numeros[i] != numBuscar) {
            i++;
        }

        if(i ==numeros.length) {
            System.out.println("Numero no encontrado");
        } else if(numeros[i] == numBuscar) {
            System.out.println("Numero encontrado");
        }



    }
}
