import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {
        
        double random = Math.random();
        /*System.out.println("random = " + random);
        random*=7;
        System.out.println("random = " + random);
        
        random = Math.ceil(random);
        System.out.println("random = " + random);*/

        String[] colores = {"Azul","Rojo","Verde","Blanco","Negro"};
        random *= colores.length;
        random = Math.floor(random);
        System.out.println("colores[(int)random] = " + colores[(int)random]);

        Random randomObj = new Random();
        int randomInt = 15+randomObj.nextInt(25-15);
        System.out.println("randomInt rango entre (15-25) = " + randomInt);

        //para el vector

        randomInt = randomObj.nextInt(colores.length);
        System.out.println("Color aleatorio del vector = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);




    }
}
