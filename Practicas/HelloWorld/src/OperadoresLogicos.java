public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float l = 2.44f;
        double k = 2.122;
        boolean m = false;

        boolean b1 = i==j && k>l; //si la primera expresion I==J
        System.out.println("b1 = " + b1);

        boolean b2 = i<k || i<j;
        System.out.println("b2 = " + b2);

    }
}
