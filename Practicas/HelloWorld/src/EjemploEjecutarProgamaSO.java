import java.io.IOException;
import java.util.Locale;

public class EjemploEjecutarProgamaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try{
            if(System.getProperty("os.name").toLowerCase().startsWith("Windows")){
                proceso = rt.exec("notepad");
            }else if(System.getProperty("os.name").toLowerCase().startsWith("Nux") ||
                    System.getProperty("os.name").startsWith("Nix")){
                proceso = rt.exec("gedit");
            }
            //proceso.waitFor();
        }catch(Exception e){
            System.err.println("Comando Desconocido" + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
