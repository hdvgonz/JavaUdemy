public class OperadoresIncrementales {
    public static void main(String[] args) {
        // Preincremento: Se incrementa y luego se asigna
        int i =1;
        int j=++i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Post-Incremeto: Se asigna el valor y se incrementa

        i=2;
        System.out.println("inicial de i = " + i);
        j=i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        //Pre decremento
        System.out.println("Pre decremento");
        i= 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("Post decremento");
        i= 3;
        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("(j++) = " + (j++));

    }
}
