import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        //calendario.set(2020, 11,25, 18,10);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH,20);
        calendario.set(Calendar.HOUR, 10);      //calendario.set(Calendar.HOUR_OF_DAY, 19);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 34);
        calendario.set(Calendar.SECOND, 34);
        calendario.set(Calendar.MILLISECOND, 342);
        Date fecha = calendario.getTime();
        System.out.println("calendario = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss:SSS a");
        String fechaConFormato = df.format(fecha);
        System.out.println("fechaConFormato = " + fechaConFormato);

    }
}
