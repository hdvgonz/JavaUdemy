import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd'");
        try {
            Date fecha = format.parse(sc.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

        }catch (ParseException e){
            //e.printStackTrace();
            System.err.println("La fecha tiene un formato Incorrecto" + e.getMessage());
            System.err.println("EL formato debe ser yyyy-MM-dd");
            //System.exit(1);
            main(args);
        }
    }
}
