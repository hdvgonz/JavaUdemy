import java.util.Arrays;

public class EjemploArregloInverso {
    public static void main(String[] args) {

        String[] productos = new String[4];
        productos[0] = "USB";
        productos[1] = "Ram";
        productos[2] = "HDD";
        productos[3] = "SSD";
        int tam = productos.length;
        System.out.println("Usando FOR");
        Arrays.sort(productos);
        for(int i =0; i<tam;i++){
            System.out.println("Para indice" + i + " : " + productos[i]);
        }
        System.out.println("Imprimiendo Inverso");
        for(int i = 0; i<tam;i++){
            System.out.println("Para i " +(tam-1-i)+ " Valor: "+ productos[tam-1-i]);
        }
        System.out.println("Imprimiendo Inverso 2");
        for(int i =tam-1; i >= 0;i--){
            System.out.println("Para indice" + i + " : " + productos[i]);
        }



    }
}
