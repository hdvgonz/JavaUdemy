import javax.swing.*;

public class Multiplicar {
    public static void main(String[] args) {

        int num1=0,num2=0;
        int total=0;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Segundo numero"));
        if(num1<0){
            for (int i=0;i<num2;i++){
              total = total+(-(num1));
             }

        }else if (num2<0) {
            for (int i=0;i<num1;i++){
                total = total+(-(num2));
            }
        }else{
            for (int i=0;i<num2;i++){
                total = total+num1;
            }
        }

        JOptionPane.showMessageDialog(null, "El resultado es "+total);
    }
}
/*import java.util.Scanner;

public class MultiplicarSinSimbolo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero a: ");
        int a = scanner.nextInt();

        System.out.println("Ingrese el numero b: ");
        int b = scanner.nextInt();
        int resultado = 0;

        // verificamos los signos de cada uno, si es positivo o negativo
        boolean positivoB = b > -1;
        boolean positivoA = a > -1;

        // calculamos el valor absoluto de a
        int absolutoA = positivoA? a: -a; // equivalente a Math.abs(a);

        // sumamos tantas veces el valor de b, segun el valor de a.
        for(int i = 0; i < absolutoA; i++){
            resultado = resultado + b;
        }

        // si ambos son negativos o si solo a es negativo damos vuelta el signo
        if((!positivoA && !positivoB) || !positivoA){
            resultado = -resultado;
        }

        System.out.println("el resultado es " + resultado);
    }
} */
