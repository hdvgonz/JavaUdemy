public class EjemploStringInmutable {
    public static void main(String[] args) {

        String curso = "Programacion Java";
        String profesor = "Andres Guzman";

        String resultado = curso.concat(" con ").concat(profesor);
        System.out.println("curso = "+curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso==resultado);

        String resultado2 = curso.transform(c->{ //transforma o modifica el String original que es Curso
            return c + " con " + profesor;

        });
        System.out.println(resultado2);
        String resultado3=resultado.replace("a","A");
        System.out.println("resultado3 = " + resultado3);
    }
}
