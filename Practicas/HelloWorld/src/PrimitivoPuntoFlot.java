public class PrimitivoPuntoFlot {
    static float nuMFlotante;
    public static void main(String[] args) {
        float a = 2.12e3f; // 2120f;

        System.out.println("a = " + a);
        System.out.println("Float Corresponde en Byte a = " + Float.BYTES);
        System.out.println("Float corresponde en bits a " + Float.SIZE);
        System.out.println("Valor minimo de float es = " + Float.MIN_VALUE);
        System.out.println("Valor maximo de float es " + Float.MAX_VALUE);

        double b=3.4028235E39;
        System.out.println("Float Corresponde en Byte a = " + Double.BYTES);
        System.out.println("Float corresponde en bits a " + Double.SIZE);
        System.out.println("Valor minimo de float es = " + Double.MIN_VALUE);
        System.out.println("Valor maximo de float es " + Double.MAX_VALUE);

        System.out.println("nuMFlotante = " + nuMFlotante);

    }
}
