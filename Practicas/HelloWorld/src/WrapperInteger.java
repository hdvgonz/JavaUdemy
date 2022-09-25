public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimivito = 32728;
        Integer intObjeto = Integer.valueOf(intPrimivito);
        Integer intObjeto2 = 32728;

        int num = intObjeto2;
        int num2 = intObjeto2.intValue(); //retorna el entero primi del objeto

        System.out.println("num2 = " + num2);
    }
}
