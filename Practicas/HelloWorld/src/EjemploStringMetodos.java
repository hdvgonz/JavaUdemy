import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        /*

        String nombre = "Daniel";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Daniel\") = " + nombre.equals("Daniel"));
        System.out.println("nombre.equals(\"daniel\") = " + nombre.equals("daniel"));
        System.out.println("nombre.equals(\"Daniel\") = " + nombre.equalsIgnoreCase("daniel"));
        System.out.println("nombre.compareTo(\"Daniel\") = " + nombre.compareTo("Daniel"));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));//obtener ultimo caracter
        System.out.println("nombre.substring(0, 4) = " + nombre.substring(0, 4));
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));
        */
        //segunda parte

        String trabaluengas = "Trabalenguas";
        System.out.println("trabaluengas.replace(\"a\",\"o\") = " + trabaluengas.replace("a","o"));
        System.out.println("trabaluengas.indexOf(\"a\") = " + trabaluengas.indexOf("a"));
        System.out.println("trabaluengas.lastIndexOf(\"a\") = " + trabaluengas.lastIndexOf("a"));// posicion del primer caracter que coincida
        System.out.println("trabaluengas.lastIndexOf(\"z\") = " + trabaluengas.lastIndexOf("z"));//posicion del ultimo caracter que se le pasa
        System.out.println("trabaluengas.contains(\"a\") = " + trabaluengas.contains("a"));//retorna boleano si el String se encuentra o no
        System.out.println("trabaluengas.startsWith(\"Tra\") = " + trabaluengas.startsWith("Tra"));
        System.out.println("trabaluengas.endsWith(\"as\") = " + trabaluengas.endsWith("as"));
        System.out.println(" Trabalenguas    ");
        System.out.println("Trabalenguas".trim()); //Elimina espacios en blanco

    }

}
