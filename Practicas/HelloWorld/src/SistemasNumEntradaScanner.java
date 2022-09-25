import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumEntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese Numero Entero");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;

        // otra forma de hacerlo:
         try{
            numeroDecimal = scanner.nextInt();
         }catch(InputMismatchException e){
             System.out.println("Error debe ingresar un numero");
             main(args);
             System.exit(0);

         }
        /*try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            System.out.println("Error debe ingresar un numero entero");
            main(args); //para que regrese el main, necesita argumentos para invocar el main
            System.exit(0); // 0 = todo sale bien
        }*/

        String mensBinario = "numero binario de  = " + numeroDecimal + " es " + Integer.toBinaryString(numeroDecimal);
        String mensOctal = "numero octal de = " + numeroDecimal+" es = "+Integer.toOctalString(numeroDecimal);
        String mensHex = "numero hexadecimal de = " + numeroDecimal + " es= "+Integer.toHexString(numeroDecimal);
        String mensaje= mensBinario;
        mensaje += "\n"+mensOctal;
        mensaje += "\n"+mensHex;

        System.out.println(mensaje);


    }
}
