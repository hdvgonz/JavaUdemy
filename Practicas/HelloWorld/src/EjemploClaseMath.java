public class EjemploClaseMath {
    public static void main(String[] args) {

        int absoluto = Math.abs(2);
        System.out.println("absoluto = " + absoluto);
        
        absoluto = Math.abs(-2);
        System.out.println("absoluto = " + absoluto);

        double max = Math.max(3.4,1.2);
        System.out.println("max = " + max);

        double min = Math.min(3.4,1.2);
        System.out.println("min = " + min);

        double techo = Math.ceil(3.5); //redondeo hacia arriba
        System.out.println("techo = " + techo);

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);
        
        long entero = Math.round(3.4);
        System.out.println("entero = " + entero);
        
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        double log = Math.log(10);
        System.out.println("log = " + log);
        
        double potencia = Math.pow(10,3);
        System.out.println("potencia = " + potencia);
        
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        double grados = Math.toDegrees(1.56);
        grados = Math.round(grados);
        System.out.println("Convertir de Radianas a Grados = " + grados);

        double radianes = Math.toRadians(90);
        System.out.println("Convertir Grados A Radianes= " + radianes);

        System.out.println("sin(90) = " + Math.sin(radianes));
        System.out.println("cos(90) = " + Math.cos(radianes));

        radianes = Math.toRadians(180);
        System.out.println("sin(180) = " + Math.sin(radianes));
        System.out.println("cos(180) = " + Math.cos(radianes));

        radianes = Math.toRadians(0.0);
        System.out.println("sin(0) = " + Math.sin(radianes));
        System.out.println("cos(0) = " + Math.cos(radianes));


    }
}
