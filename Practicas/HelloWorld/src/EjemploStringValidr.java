import java.util.Locale;

public class EjemploStringValidr {
    public static void main(String[] args) {

        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo) {
            curso = " No estoy vacio";
        }
        boolean esVacio = curso.length() == 0;
        boolean esVacio2= curso.isEmpty();
        boolean esBlanco= curso.isBlank();

        if (!esVacio2) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso " + curso);
        }
    }
}
