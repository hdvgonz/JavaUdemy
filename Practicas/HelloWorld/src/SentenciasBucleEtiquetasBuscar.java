public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "trigo tristes tigres trigos tragan trigo en un trigaltrigo";
        String palabra = "trigo";
        int maxPalabra = palabra.length();
        int maxFrase = frase.length()-maxPalabra;
        int cantidad = 0;
        char letra = 'g';

        buscar:
        for (int i = 0; i <=maxFrase; ) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i = i +maxPalabra;
        }
        System.out.println("Encontrado = " + palabra+ " en la frase "+cantidad+ " de veces");
    }
    // Coloco el i++ en el for j para que no busque letra por letra
    //si no palabra por palabra, y cuando sea distinto, incrementa el i en 1
    // y cuando encuentra la palabra que le sume al i el largo de la palabra y evalua la siguiente
}
