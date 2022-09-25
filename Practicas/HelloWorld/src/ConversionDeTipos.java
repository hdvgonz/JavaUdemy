public class ConversionDeTipos {
    public static void main(String[] args) {

        String a = "3333.2e-3";
        double cA = Double.parseDouble(a);
        System.out.println("a = " + cA);

        String logic = "true";
        boolean log = Boolean.parseBoolean(logic);

        String strNumeroStr = Double.toString(cA);
        String strNumStr = Boolean.toString(log);

        //directo a String, otra forma

        String doub = String.valueOf(cA);
        String logi = String.valueOf(log);
        System.out.println("Double a String"+doub);

        double strReal=1.2334e5;
        String strRealD = Double.toString(strReal);
        System.out.println("StrrealD es "+strRealD);

        strRealD = String.valueOf(3332f);
        System.out.println("strRealD = " + strRealD);


        int i= 214;

        short b = (short)i; // casteo o forzar conversion
        System.out.println("b = " + b);
        long c = i;

        short e = 233;
        int f = e;

        char g = (char) e;
        System.out.println("g = " + g);
    }
}
