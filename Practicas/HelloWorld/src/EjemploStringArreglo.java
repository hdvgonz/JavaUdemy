public class EjemploStringArreglo {
    public static void main(String[] args) {


        String trabaluengas = "Trabalenguas";
        System.out.println("trabaluengas.toCharArray() = " + trabaluengas.toCharArray());
        System.out.println("trabaluengas = " + trabaluengas.length());
        char[] arreglo = trabaluengas.toCharArray();
        int largo = arreglo.length;
        
        for (int i=0; i<largo;i++){
            System.out.println("arreglo[i] = " + arreglo[i]);

            System.out.print("arreglo[i] = " + arreglo[i]);
        }

        System.out.println("arreglo = " + trabaluengas.split("a"));

        String[] arreglo2 = trabaluengas.split("a");
        int largo2 = arreglo2.length;
        for (int j=0;j<largo2;j++) {
            System.out.print(arreglo2[j]);
        }

        String archivo = "archivo.Lol.pdf";
        String[] archArray = archivo.split("[.]"); //o String[] archArray = archivo.split("\\.");
        int largo3= archArray.length;
        System.out.println("largo3 = " + largo3);
        for (int k=0; k<largo3;k++){
            System.out.println(archArray[k]);
        }
        System.out.println("archArray[largo3-1] = " + archArray[largo3-1]);
    }

}
