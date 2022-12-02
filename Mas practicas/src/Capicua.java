import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Capicua {

    public  static boolean esCapicua (int num) {
        int aux, inverso=0, cifra;
        boolean esCapicua;
        //Voy a invertir numero
        aux = num;
        while (aux != 0) {

            cifra = aux % 10; //Saco primera Cifra
            inverso = inverso* 10 + cifra; //asigno cifra al nuevo num inverso
            aux = aux /10; //Reduzco auxiliar en una unidad menos
        }

        if (num == inverso) {
            esCapicua = true;
        } else {
            esCapicua = false;
        }
        return esCapicua;
    }
    public static void main(String[] args) {

        int len = 10;
        int [] vector;
        vector = new int[len];
        int numeros;


        JOptionPane.showMessageDialog(null,"Ingrese 10 numeros");
        for (int i=0; i < vector.length; i++) {
            String aux = JOptionPane.showInputDialog("Ingrese numero #" + (i+1));
            numeros = Integer.parseInt(aux);
            if(esCapicua(numeros)) {
                vector[i] = numeros;
            } else {
                vector[i] = 161;
            }
        }

        for (int i =0; i < vector.length; i++) {
            System.out.println("vector = " + vector[i]);
        }

    }
}
