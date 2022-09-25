public class PrimitivoEntero {

    public static void main(String[] args) {

        byte a = -127;
        System.out.println("a = " + a);
        System.out.println("tipo byte corresponde en bytes a "+ Byte.BYTES);
        System.out.println("tamaño e¡n bites "+ Byte.SIZE);
        System.out.println("Valor minimo "+ Byte.MIN_VALUE);
        System.out.println("\nValor maximo de un byte "+ Byte.MAX_VALUE);

        short b = 32767;

        System.out.println("b = " + b);
        System.out.println("tipo short corresponde en Bytes a "+ Short.BYTES);
        System.out.println("tamaño en bites "+ Short.SIZE);
        System.out.println("Valor minimo "+ Short.MIN_VALUE);
        System.out.println("\nValor maximo de un short "+ Short.MAX_VALUE);

        int c= 444444;
        System.out.println("\ntipo int corresponde en bytes a "+ Integer.BYTES);
        System.out.println("\nTipo entero corresponde en bites a "+ Integer.SIZE);
        System.out.println("\nValor minimo "+ Integer.MIN_VALUE);
        System.out.println("Valor maximo de un int "+ Integer.MAX_VALUE);

        long d= 2147483648L;
        System.out.println("\ntipo long corresponde en bytes a "+ Long.BYTES);
        System.out.println("\nTipo long corresponde en bites a "+ Long.SIZE);
        System.out.println("\nValor minimo "+ Long.MIN_VALUE);
        System.out.println("Valor maximo  "+ Long.MAX_VALUE);

    }
}
