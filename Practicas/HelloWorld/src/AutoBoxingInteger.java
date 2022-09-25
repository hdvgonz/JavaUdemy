public class AutoBoxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {1,2,3,4,5,6,7};

        int suma=0;
        //forma Explicita
        for(Integer i: enteros){
            if (i.intValue() %2 ==0){
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);
        suma =0;
        //forma Implicita
        for(Integer i: enteros){
            if (i %2 ==0){
                suma += i;
            }
        }
        System.out.println("suma = " + suma);
    }
}
