import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EjemploAsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/config.properties");

            Properties p = new Properties(System.getProperties());//Agregamos las propiedades del sistema
            p.load(archivo);
            p.setProperty("mi.propiedad.personalizada","Mi Valor Guardado en el Objeto properties");
            System.setProperties(p);

            Properties ps= System.getProperties();
            System.out.println("ps = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));//obtener propiedad personalizada
            ps.list(System.out);

        }catch(Exception e){ //Exception es la clase Generica de Exception, maneja todas las exepciones
            System.out.println("No existe el archivo");
        }

    }
}
