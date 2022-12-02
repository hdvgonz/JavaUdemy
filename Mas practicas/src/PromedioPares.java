import javax.swing.*;

public class PromedioPares {

    public static void main(String[] args) {

        int n, suma = 0, promedio = 0;
        int valores = 0;
        String aux;
        aux = JOptionPane.showInputDialog("Ingrese tamaño del vector");

        n = Integer.parseInt(aux);

        int [] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {
            valores = i +11;
            if(valores %2 == 0) {
                vector[i] = valores;
            } else {
                vector[i] = valores+1;
            }
            suma += vector[i];
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println("Vector en posicion " +(i) + " = " + vector[i]);
        }

        promedio = suma /n;

        System.out.println("promedio = " + promedio);

    }
}
