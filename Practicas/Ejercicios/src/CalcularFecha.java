import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularFecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dddd");
        System.out.println("Ingrese Fecha de nacimiento (formato: 'yyyy-MM-dddd)");
        try{
            Date fecha = df.parse(sc.next());
            Date fechaActual = new Date();
            double anio= 3.1709791983765E-11;
             int edad = (int) (fechaActual.getTime()*anio)-(int)(fecha.getTime()*anio);

            System.out.println("edad = " + edad);
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
