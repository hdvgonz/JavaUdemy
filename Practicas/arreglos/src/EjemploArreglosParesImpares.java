import java.util.Scanner;

public class EjemploArreglosParesImpares {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int [] a, pares, impares;

        a = new int [10];
        int contPar = 0, contImpar = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = obj.nextInt();
        }

        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }

        pares = new int[contPar];
        impares = new int[contImpar];

        int nPares =0, nImpares = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0) {
                pares[nPares++] = a[i];
            } else {
                impares[nImpares++] = a[i];
            }
        }

        System.out.println("Pares");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\r\nImpares");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }
    }
}
