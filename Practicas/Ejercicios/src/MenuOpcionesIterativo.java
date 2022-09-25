import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MenuOpcionesIterativo {
    public static void main(String[] args) {
        int indiceOpcion =0;
        do{
        Map<String,Integer> opciones = new HashMap<>();
        opciones.put("Actualizar",1);
        opciones.put("Eliminar",2);
        opciones.put("Agregar", 3);
        opciones.put("Listar",4);
        opciones.put("Salir",5);

        Object[] opArreglo = opciones.keySet().toArray();

        Object opcion = JOptionPane.showInputDialog(null, "Selecione una opcion",
                "mantenedor de productos", JOptionPane.INFORMATION_MESSAGE,null,opArreglo,opArreglo[0]);

        if (opcion==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una operacion");
        }else{
            indiceOpcion = opciones.get(opcion.toString());
        }

        String mens = "";
        switch (indiceOpcion){
            case 1:
                mens = "Se actualizó el usuario";
                JOptionPane.showMessageDialog(null,mens);
            case 2:
                mens = "Se eliminó el usuario";
                JOptionPane.showMessageDialog(null,mens);
            case 3:
                mens = "Se agregó el usuario";
                JOptionPane.showMessageDialog(null,mens);
            case 4:
                mens = "Enlistando el usuario";
                JOptionPane.showMessageDialog(null,mens);
        }
        }while (!(indiceOpcion ==5));
        JOptionPane.showMessageDialog(null, "Final del programa");
    }
}
