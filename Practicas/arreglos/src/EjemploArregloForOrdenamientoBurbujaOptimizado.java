public class EjemploArregloForOrdenamientoBurbujaOptimizado {



    public static void sortBurbuja(Object[] arreglo) {

        int tam = arreglo.length;

        for (int i = 0; i < tam; i++) {

            for (int j = 0; j < tam-1-i; j++) {
                if( ((Comparable) arreglo[j+1]).compareTo(arreglo[j]) < 0) {
                     Object aux = arreglo[j];
                     arreglo[j] = arreglo[j+1];
                     arreglo[j+1] = aux;
                }
            }
        }

    }
    public static void main(String[] args) {

        String[] productos = {"USB", "Ram","HDD","SSD"};

        int tam = productos.length;

        sortBurbuja(productos);
        System.out.println("===Usando For==");
        for(int i =0; i<tam;i++){
            System.out.println("Para indice" + i + " : " + productos[i]);
        }

        Integer[] numeros = new Integer[4];
        numeros[0] = 1;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = (int) 32L;
        numeros[3] = 4;

        sortBurbuja(numeros);
        for(int i =0; i<tam;i++){
            System.out.println("Para indice" + i + " : " + numeros[i]);
        }


    }
}
