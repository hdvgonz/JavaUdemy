public class OperadorInstaceOfTiposGenericos {

    public static void main (String[] arg){

        Object texto = "Creando objeto de clase String";

        Number num = 7;

        Boolean b1 = texto instanceof String;

        System.out.println("texto es del tipo String = " + b1);

        b1 = num instanceof Integer;
        System.out.println("Num object instacia de Integer "  + b1);

        b1 = texto instanceof Object;
        System.out.println("Es instancia de object = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es Number = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("Texto instancia de Integer = " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 = " + b1);

        b1 = num instanceof Double;
        System.out.println("num es Instancia de Double = " + b1);


    }
}
