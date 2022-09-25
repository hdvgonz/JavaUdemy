import java.util.Scanner;

public class OperadoresLogicosLoginTernario {
    public static void main(String[] args) {

        /*String[] usernames= new String[2];
        String[] password = new String[2];
        usernames[0] = "Daniel";
        usernames[1] = "admin";
        password[0] = "45644";
        password[1] = "44444";
        */

        String[] usernames= {"daniel","admin","pepe"};
        String[] password = {"123456","admin43","66666"};
        Scanner obj = new Scanner(System.in);
        System.out.println("Ingrese user");
        String usuario = obj.next();

        System.out.println("Ingrese password");
        String p = obj.next();

        boolean esAutenticado = false;

        for(int i=0;i<usernames.length;i++){

            esAutenticado = usernames[i].equals(usuario) && password[i].equals(p) || esAutenticado;

            /*if (usernames[i].equals(usuario) && password[i].equals(p)){
                esAutenticado = true;
                break;
            }*/

         }
        System.out.println("esAutenticado = " + esAutenticado);
        String mensaje = esAutenticado  ? "Bienvenido al sistema ".concat(usuario).concat("!"):
                "Debe autenticarse ";
        System.out.println(mensaje);
           /* if (esAutenticado){
                System.out.println("Bienvenido al sistema ".concat(usuario));
            }else{
                System.out.println("Acceso restringido, revise sus credenciales");
            }*/
    }
}
