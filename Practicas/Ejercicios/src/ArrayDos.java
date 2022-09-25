import java.util.Scanner;

public class ArrayDos {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int i=0;
        System.out.println("Ingrese tamaño del array");
        int tamano =obj.nextInt();
        int numero;
        int[] num = new int[tamano];


        for(i=0;i<num.length;i++){
            do{
                System.out.println("Ingrese un numero");
                numero = obj.nextInt();
                num[i] = numero;
            }while(numero>=0 && numero<=10);
            System.out.println("Numero Ingresado"+num[i]);
            break;
        }

    }
}
