import java.util.Arrays;

public class IterarArreglos {
    public static void main(String[] args) {

        String[] productos = new String[4];
        productos[0] = "USB";
        productos[1] = "Ram";
        productos[2] = "HDD";
        productos[3] = "SSD";
        int tam = productos.length;
        System.out.println("Usando FOR");
        for(int i =0; i<tam;i++){
            System.out.println("Para indice" + i + " : " + productos[i]);
        }
        String prod1, prod2, prod3, prod4;
        prod1 = productos[0];
        prod2 = productos[1];
        prod3 = productos[2];
        prod4 = productos[3];
        System.out.println("Usando ForEach");
        for(String num:productos){
            System.out.println("Para indice" + " : " + num);
        }
        System.out.println("Usando WHILE");
        int i=0;
        while(i<tam){
            System.out.println("Para indice" + i + " : " + productos[i]);
            i++;
        }


    }
}
