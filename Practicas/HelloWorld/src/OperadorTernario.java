import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {

        //variable = condicion ? si_es verdadero: si_es Falso;

        String variable = 5<6 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;
        double mat = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese la nota de Matematicas en escala de 7");
        mat = obj.nextDouble();

        System.out.println("Ingrese la nota de ciencias en escala de 7");
        ciencias = obj.nextDouble();

        System.out.println("Ingrese la nota de Historia en escala de 7");
        historia = obj.nextDouble();

        promedio =(mat+ciencias+historia)/3;

        estado = promedio>=5.5 ? "Aprobado": "Reprobado";
        System.out.println("promedio = " + promedio);
        System.out.println("estado = " + estado);

    }
}
