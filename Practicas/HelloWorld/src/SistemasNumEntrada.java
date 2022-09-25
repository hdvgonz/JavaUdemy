import javax.swing.*;

public class SistemasNumEntrada {
    public static void main(String[] args) {
        int numeroDecimal = 0;
        String numeroStr= JOptionPane.showInputDialog(null, "Ingrese Numero Entero");
        try{
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero");
            main(args); //para que regrese el main, necesita argumentos para invocar el main
            System.exit(0); // 0 = todo sale bien
        }


        System.out.println("numerodecimal = " + numeroDecimal);

        String mensBinario = "numero binario de  = " + numeroDecimal + " es " + Integer.toBinaryString(numeroDecimal);
        System.out.println(mensBinario);

        int numBinario = 0b111110100;
        System.out.println("numBinario = " + numBinario);
        String mensOctal = "numero octal de = " + numBinario+" es = "+Integer.toOctalString(numeroDecimal);
        System.out.println(mensOctal);

        int numOctal = 0764;

        System.out.println("numOctal = " + numOctal);

        String mensHex = "numero hexadecimal de = " + numOctal + " es= "+Integer.toHexString(numeroDecimal);
        System.out.println();

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje= mensBinario;
        mensaje += "\n"+mensOctal;
        mensaje += "\n"+mensHex;
        JOptionPane.showMessageDialog(null,mensaje);


    }
}
