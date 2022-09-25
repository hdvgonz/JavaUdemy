class Persona{
    private String nombre;

    public void modificarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String leerNombre(){
        return this.nombre;
    }
}
public class PasarPorReferencia2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Daniel");

        System.out.println("iniciamos el metodo main con i = ");
        System.out.println("persona = " + persona.leerNombre());

        System.out.println("Antes de Invocar el metodo test");
        test(persona);
        System.out.println("Despues de Invocar el metodo test");
        System.out.println("Finaliza el metodo main con los datos  modificados ");
        System.out.println("persona = " + persona.leerNombre());
    }

    public static  void test(Persona persona){
        System.out.println("iniciamos el metodo test");
        persona.modificarNombre("Andres");
        System.out.println("Finaliza el test");
    }
}
