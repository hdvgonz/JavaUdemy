import java.util.Arrays;

public class EjemploArreglos2 {
    public static void main(String[] args) {

        String[] productos = new String[4];
        productos[0] = "USB";
        productos[1] = "Ram";
        productos[2] = "HDD";
        productos[3] = "SSD";

        Arrays.sort(productos);

        String prod1, prod2, prod3, prod4;
        prod1 = productos[0];
        prod2 = productos[1];
        prod3 = productos[2];
        prod4 = productos[3];

        System.out.println("i = " + prod1);
        System.out.println("j = " + prod2);
        System.out.println("k = " + prod3);
        System.out.println("l = " + prod4);


    }
}
