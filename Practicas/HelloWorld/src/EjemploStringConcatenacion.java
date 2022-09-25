public class EjemploStringConcatenacion {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = "Andres Guzman";

        String detalle = curso + " con el instructor" + profesor;

        System.out.println(detalle);

        int a = 10;
        int b = 5;

        System.out.println(detalle+a+b);
        System.out.println(detalle+(a+b));
        System.out.println(a+b+detalle);

        //otra forma de concatenar
        
        String detalle2 = curso.concat(" ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);
    }
}
