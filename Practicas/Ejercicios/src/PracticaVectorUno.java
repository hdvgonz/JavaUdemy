import javax.swing.*;
import java.util.Arrays;

public class PracticaVectorUno {
    public static void main(String[] args) {

    int [] arrayN = {4,3,2,1,6,7,8,9,10};
    int num;

    String mens = JOptionPane.showInputDialog("Ingrese un numero");
    num = Integer.parseInt(mens);

    for (int i=0;i<arrayN.length;i++){

        if (num == arrayN[i]){
            JOptionPane.showMessageDialog(null, "El numero" + num + " se encuentra en la posicion: "+ i);
            continue;

        }else{
            JOptionPane.showMessageDialog(null, "El numero" + num + " No se encuentra");

    }
        }

    }
}
