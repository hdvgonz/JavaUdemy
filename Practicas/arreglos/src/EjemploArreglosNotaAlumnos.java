import java.util.Scanner;

public class EjemploArreglosNotaAlumnos {

    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria,
                claseLenguaje;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        double sumNotasMatematicas = 0, sumNotasLenguaje = 0,
                sumNotasHistoria = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de Math");
        for (int i = 0; i < claseMatematicas.length;
             i++) {

            claseMatematicas[i] = s.nextDouble();
        }
        System.out.println("Ingrese 7 notas de lenguaje");
        for (int i = 0; i < claseLenguaje.length;
             i++) {

            claseLenguaje[i] = s.nextDouble();
        }
        System.out.println("Ingrese 7 notas de Historia");
        for (int i = 0; i < claseHistoria.length;
             i++) {

            claseHistoria[i] = s.nextDouble();
        }

        for (int i =0; i < 7; i++) {
            sumNotasMatematicas += claseMatematicas[i];
            sumNotasLenguaje += claseLenguaje[i];
            sumNotasHistoria += claseHistoria[i];
        }

        double promedioHist =  (sumNotasHistoria/claseHistoria.length);
        double promedioLeng = (sumNotasLenguaje/claseLenguaje.length);
        double promedioMate =  (sumNotasMatematicas/claseMatematicas.length);
        System.out.println("Promedio clase matematicas: " +
                promedioMate);

        System.out.println("Promedio clase Lenguaje: " +
                promedioLeng);

        System.out.println("Promedio clase Historia: " +
               promedioHist);

    }
}
