public class OperadoresRelacionales {
    public static void main(String[] args) {
        
        int i = 3;
        byte j = 7;
        float l = 2.44f;
        double k = 2.122;
        boolean m = false;
        
        boolean b1 = i==j;
        System.out.println("b1 = " + b1);
        
        boolean b2 =!b1;
        System.out.println("b2 = " + b2);
        
        boolean b3 = i != j;
        System.out.println("b3 = " + b3);

        boolean b4 = b1 == b2;
        System.out.println("b4 = " + b4);

        boolean b5 = b1 == true;
        
        boolean b6 = i>j;
        System.out.println("b6 = " + b6);
    }
}
