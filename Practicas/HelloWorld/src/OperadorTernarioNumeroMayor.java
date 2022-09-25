import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int n1 = obj.nextInt();

        System.out.println("Ingrese segundo Numero");
        int n2= obj.nextInt();

        System.out.println("Ingrese Tercer Numero");
        int n3= obj.nextInt();

        System.out.println("Ingrese cuarto Numero");
        int n4= obj.nextInt();

        max = (n1>n2) ? n1:n2;
        max = (n1>n3) ? max:n3;
        max = (n4>n3) ? n4:max;

        System.out.println("n1 = " + n1);
        System.out.println("n2 = " + n2);
        System.out.println("n3 = " + n3);
        System.out.println("n4 = " + n4);
        System.out.println("Numero max es= " + max);
    }
}
