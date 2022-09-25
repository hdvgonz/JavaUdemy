public class OperadorInstaceOf {

    public static void main (String[] arg){

        String texto = new String ("Creando objeto de clase String");

        Integer num = 7;

        Boolean b1 = texto instanceof String;

        System.out.println("texto es del tipo String = " + b1);

        b1 = texto instanceof Object;
        System.out.println("Es instancia de object = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es Number = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 = " + b1);


    }
}
