public class PrimitivoCaracteres {
    public static void main(String[] args) {
        char caracter = '\u0040';
        char decimal = 64;
        char retrocesoCarro = '\r';
        System.out.println("c = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = " + (decimal==caracter));

        System.out.println("Char equivale en byte a " + Character.BYTES);
        System.out.println("Char equivale en bites a " +Character.SIZE);
        System.out.println("char valor max es "+Character.MAX_VALUE);
        System.out.println("Probando varibales de tipo char "+ retrocesoCarro);
        System.out.println("Char valor min es "+Character.MIN_VALUE);

    }
}
