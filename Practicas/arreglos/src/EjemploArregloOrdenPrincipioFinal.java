public class EjemploArregloOrdenPrincipioFinal {

    public static void main (String[] args) {

        int[] num = new int [18];
        int tam = num.length;
        for (int i = 0; i < tam; i ++) {
            num[i] = i + 1;
        }

        for (int i = 0; i < tam/2; i ++) {

            System.out.println("["+ num[i]+"] " + "["+num[tam-1-i]+"]" );
        }

    }
}
