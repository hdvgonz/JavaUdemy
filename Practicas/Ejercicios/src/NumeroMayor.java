import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {

        int n1, n2;
        String max;

        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese Primer Numero ");
        n1 = obj.nextInt();
        System.out.println("Ingrese Segundo Numero ");
        n2 = obj.nextInt();

        max = n1>n2 ? n1+"\n"+n2:n2+"\n"+n1;
        System.out.println(max);
    }
}
