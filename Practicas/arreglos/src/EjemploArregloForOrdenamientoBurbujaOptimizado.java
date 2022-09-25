public class EjemploArregloForOrdenamientoBurbujaOptimizado {

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
        int contador  = 0;
        for(int i=0; i<tam-1;i++){
            for(int j=0;j<tam-1-i;j++){
                if(productos[i].compareTo(productos[j])<0){ // compara valores en tabla unicode
                     String auxiliar = productos[j];
                     productos[j] = productos[j+1];
                     productos[j+1] = auxiliar;

                }
                contador++;
            }
        }
        System.out.println("Se ha iterado este numero de veces= " + contador);

        //Arrays.sort(productos);
        //arregloInverso(productos);
        //System.out.println(productos);
        //Collections.reverse(Arrays.asList(productos));
        System.out.println("===Usando For==");
        for(int i =0; i<tam;i++){
            System.out.println("Para indice" + i + " : " + productos[i]);
        }




    }
}
