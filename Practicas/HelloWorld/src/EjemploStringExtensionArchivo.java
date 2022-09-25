public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.jpg";
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(14) = " + archivo.substring(14));

        int i = archivo.lastIndexOf(".");
        System.out.println("La extension del archivo es " + archivo.substring(i+1));

        

    }
}
