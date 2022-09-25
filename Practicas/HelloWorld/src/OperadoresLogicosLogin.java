import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        /*String[] usernames= new String[2];
        String[] password = new String[2];
        usernames[0] = "Daniel";
        usernames[1] = "admin";
        password[0] = "45644";
        password[1] = "44444";
        */
        Scanner obj = new Scanner(System.in);
        String[] usernames= {"Daniel","admin","pepe"};
        String[] password = {"123456", "admin43","66666"};
        System.out.println("Ingrese user");
        String usuario = obj.nextLine();
        System.out.println("Ingrese password");
        String p = obj.nextLine();

        boolean esAutenticado = false;

        for(int i=0;i<usernames.length;i++){
            if (usernames[i].equals(usuario) && password[i].equals(p)){
                esAutenticado = true;
                break;
            }
        }
            if (esAutenticado){
                System.out.println("Bienvenido al sistema ".concat(usuario));
            }else{
                System.out.println("Acceso restringido, revise sus credenciales");
            }
    }
}
