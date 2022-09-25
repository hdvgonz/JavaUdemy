import javax.swing.*;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String nombre1 = JOptionPane.showInputDialog("Digite nombre");
        String nombre2 = JOptionPane.showInputDialog("Digite nombre");
        String nombre3 = JOptionPane.showInputDialog("Digite nombre");

        String modificado1 = nombre1.substring(1,2).toUpperCase().concat(".").concat(nombre1.substring(nombre1.length()-2)).concat("_") + nombre2.substring(1,2).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length()-2)).concat("_") +
                nombre3.substring(1,2).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length()-2));
        System.out.println("modificado1 = " + modificado1);



    }
}
