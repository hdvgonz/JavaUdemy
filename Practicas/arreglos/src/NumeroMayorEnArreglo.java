import java.util.Scanner;

public class NumeroMayorEnArreglo {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int[] num = new int[6];

        System.out.println("Ingrese 5 numeros");
        for (int i = 0; i < num.length; i++) {
            num[i] = obj.nextInt();
        }



        //int mayor = num[0];
        int max = 0;
        for (int i = 1; i < num.length; i++) {
            max = (num[max] > num[i])? max : i;

            /*if(mayor < num[i]) {

                //mayor = num[i];
            }*/
        }
        System.out.println("max = " + num[max]);
        //System.out.println("mayor = " + mayor);
    }
}
