import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres ={"Andres", "pepe","Maria", "carl", "papo", "pepo","pepa"};
        int count = nombres.length;
        for(int i=0;i<count;i++){
            System.out.println("nombres = " + nombres[i]);
        }
        String buscar = JOptionPane.showInputDialog("Ingrese nombre a buscar");
        boolean encontrado = false;
        for (int i=0; i<count;i++){
            if(buscar.equalsIgnoreCase(nombres[i])){
                encontrado= true;
                break;
            }

            /*if(buscar.equalsIgnoreCase(nombres[i])){
                JOptionPane.showMessageDialog(null, "El nombre "+buscar+" se encuentra en la base" +
                        "de datos");
                 break;
            }else{
                JOptionPane.showMessageDialog(null,"no hay incidencia");
                break;
            }*/
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null, "El nombre se encuentra en la BD");

        }else{
            JOptionPane.showMessageDialog(null, "el nombre no se encuentra");

        }
    }
}
