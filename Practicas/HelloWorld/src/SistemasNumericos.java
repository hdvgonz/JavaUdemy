public class SistemasNumericos {
    public static void main(String[] args) {

        int numeroDecimal = 500;
        System.out.println("numerodecimal = " + numeroDecimal);

        System.out.println("numero binario de  = " + numeroDecimal + " es " + Integer.toBinaryString(numeroDecimal));

        int numBinario = 0b111110100;
        System.out.println("numBinario = " + numBinario);

        System.out.println("numero octal de = " + numBinario+" es = "+Integer.toOctalString(numeroDecimal));

        int numOctal = 0764;

        System.out.println("numOctal = " + numOctal);

        System.out.println("numero hexadecimal de = " + numOctal + " es= "+Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4;
        System.out.println("numeroHex = " + numeroHex);
    }
}
