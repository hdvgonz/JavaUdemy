import java.util.Properties;

public class EjemploPropiedadesDelSistema {
    public static void main(String[] args) {
        
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);
        
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);
        
        String versionJava = System.getProperty("java.version");
        System.out.println("versionJava = " + versionJava);

        String lineSeparator = System.getProperty("line.separator"); //Salto de linea o line separator
        System.out.println("lineSeparator = " + lineSeparator+"jijijijiji");

        Properties p = System.getProperties();
        p.list(System.out);
    }
}
