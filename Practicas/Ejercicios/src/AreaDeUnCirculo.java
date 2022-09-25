import javax.swing.*;

public class AreaDeUnCirculo {
    public static void main(String[] args) {

        double area=0.0;
        double radio=0.0;
        radio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese Radio del Circulo"));

        area = Math.PI*Math.pow(radio,2);
        JOptionPane.showMessageDialog(null,"el area del circulo es" + area);
    }
}
