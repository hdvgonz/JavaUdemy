public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1,num2;
        num1=3;
        num2=3;

        boolean val = num1<num2; //false
        Boolean objBoolean = Boolean.valueOf(val);
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = false;
        System.out.println("val = " + val);
        System.out.println("ObjBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        // se pueden comparar por el igual, el valor
        System.out.println("Comparando dos objetos Boolean " + (objBoolean2 == objBoolean));
        System.out.println("Comparando dos objetos Boolean " + (objBoolean.equals(objBoolean2)));
        System.out.println("Comparando dos objetos Boolean " + (objBoolean2 == objBoolean3));
        System.out.println("Comparando dos objetos Boolean " + (objBoolean3 == objBoolean));

        // De Boolean (objeto) a primtivo boolean

        boolean val2 = objBoolean.booleanValue();
    }
}
