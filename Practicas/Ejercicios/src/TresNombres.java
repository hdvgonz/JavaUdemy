import javax.swing.*;

public class TresNombres {
    public static void main(String[] arg){

        String nomb1,nomb2,nomb3;

        nomb1 = JOptionPane.showInputDialog("Ingrese Nombre#1");
        nomb2 = JOptionPane.showInputDialog("Ingrese Nombre#2");
        nomb3 = JOptionPane.showInputDialog("Ingrese Nombre#3");

        String [] nom1 = nomb1.split(" ");
        String [] nom2 = nomb2.split(" ");
        String [] nom3 = nomb3.split(" ");

        int i = nom1.length;
        int j = nom2.length;
        int k = nom3.length;

        if(i>j && i>k){
            JOptionPane.showMessageDialog(null, "El Nombre mas largo es nomb1 "+  nom1[0]);
        } else if (j>k) {
            JOptionPane.showMessageDialog(null, "El Nombre mas largo es nomb2 "+  nom2[0]);

        } else {
            JOptionPane.showMessageDialog(null, "El Nombre mas largo nomb3 = "+  nom3[0]);
        }




    }
}
