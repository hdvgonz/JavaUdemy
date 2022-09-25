import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {
        
        Scanner o = new Scanner(System.in);
        System.out.println("Ingrese mes en numero");
        int mes = o.nextInt() ;
        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes ="Febrero";
                break;
            case 3:
                nombreMes ="Marzo";
                break;
            case 4:
                nombreMes ="Abril";
                break;
            case 5:
                nombreMes ="Mayo";
                break;
            case 6:
                nombreMes ="Junio";
                break;
            case 7:
                nombreMes ="Julio";
                break;
            case 8:
                nombreMes ="Agosto";
                break;
            case 9:
                nombreMes ="Septiembre";
                break;
            case 10:
                nombreMes ="Octubre";
                break;
            case 11:
                nombreMes ="Noviembre";
                break;
            case 12:
                nombreMes ="Diciembre";
                break;
            default:
                nombreMes = ("Mes no existe");
        }
        System.out.println("nombreMes = " + nombreMes);

        int num=5;
        switch (num){
            case 0:
                System.out.println("EL numero es cero");
            case 1:
                System.out.println("EL numero es uno");
                break;
            case 2:
                System.out.println("EL numero es dos");
                break;
            case 3:
                System.out.println("EL numero es tres");
                break;
            default:
                System.out.println("EL numero no esta en la lista");
        }

        String nombre = "Daniel";

        switch (nombre){
            case "Daniel":
                System.out.println("Encontraste a Daniel");
                break;
            case "Andres":
                System.out.println("Encontraste a Andres");
                break;
            default:
                System.out.println("el nombre no esta");
        }

    }
}
