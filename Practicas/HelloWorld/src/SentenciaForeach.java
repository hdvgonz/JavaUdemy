public class SentenciaForeach {

    public static void main(String[] args) {

        int[] num = {1,3,5,7,9,11,13,15};

        for(int numeros: num){
            System.out.println("numeros = " + numeros);
        }
        String[] nombres ={"Andres", "pepe","Maria", "carl", "papo", "pepo","pepa"};

        for(String nom: nombres){
            System.out.println("nom = " + nom);
        }
    }
}
