public class EjemploArregloOrdenPrincipioFinal {

    public static void main (String[] args) {

        int[] num = new int [18];
        int tam = num.length;
        //otro arreglo
        int[] a = new int[18];
        int tam2 = a.length;

        for (int i = 0; i < tam; i ++) {
            num[i] = i + 1;
        }

        int aux = 0;

        for (int i = 0; i < tam-i; i ++) {

            a[aux++] = num[i];
            a[aux++] = num[tam -1 -i];



        }

        for (int i =0; i <tam2; i++) {
            System.out.println("a= "+"["+ a[i]+"]");
        }
        /*for (int i = 0; i < tam/2; i ++) { //Mostrar arreglo num

            System.out.println("["+ num[i]+"] " + "["+num[tam-1-i]+"]" );
        }*/

    }
}
