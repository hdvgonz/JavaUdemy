import javax.swing.*;

public class OperadoresAricmeticos {
    public static void main(String[] args) {
        int i= 5;
        int j=4;
        int suma,resta, multi, div, resto;
        float div2;
        suma= i+j;
        resta = i-j;
        multi = i*j;
        div = i/j;
        div2 = (float) i/j;
        resto = i%j;
        System.out.println("suma = " + suma);
        System.out.println("resta = " + resta);
        System.out.println("multi = " + multi);
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if(numero%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
