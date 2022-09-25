import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class EjemploModificarArregloInverso {

    public static void arregloInverso(String[] arreglo){
        int tam = arreglo.length;
        int tam2 = arreglo.length;
        //Que revierta hasta la mitad, porque luego revierte lo que venia invirtiendo
        for (int i = 0; i<tam2;i++){

            String actual = arreglo[i];
            String inverso = arreglo[tam2-1-i];
            arreglo[i] = inverso; // el actual en la posicion del ultimo
            arreglo[tam2-1-i] = actual;//el ultimo en la posicion actual
            tam2--;
        }
    }
    public static void main(String[] args) {

        String[] productos = {"USB", "Ram","HDD","SSD"};

        int tam = productos.length;
        System.out.println("Usando FOR");
        Arrays.sort(productos);

        arregloInverso(productos);
        System.out.println(productos);
        //Que revierta hasta la mitad, porque luego revierte lo que venia invirtiendo

        //Podemos usar coleccion
        Collections.reverse(Arrays.asList(productos));
        for(int i =0; i<tam;i++){
            System.out.println("Para indice" + i + " : " + productos[i]);
        }

        /* Otra forma:
        for (int i = 0; i<tam/2;i++){

            String actual = productos[i];
            String inverso = productos[tam-1-i];
            productos[i] = inverso;
            productos[tam-1-i] = actual;
        }
         */


    }
}
