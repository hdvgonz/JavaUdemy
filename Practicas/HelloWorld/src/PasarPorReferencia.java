public class PasarPorReferencia {
    public static void main(String[] args) {

        int[] edad = {10,11,13,15,16};

        System.out.println("iniciamos el metodo main con i = ");
        for (int i=0;i< edad.length;i++){
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("Antes de Invocar el metodo test");
        test(edad);
        System.out.println("Despues de Invocar el metodo test");
        for (int i=0;i< edad.length;i++){
            System.out.println("edad = " + edad[i]);
        }
        System.out.println("Finaliza el metodo main con los datos del arreglo modificado ");
    }

    public static  void test(int[] edadArreglo){
        System.out.println("iniciamos el metodo test");
        for (int i=0;i< edadArreglo.length;i++){
            edadArreglo[i] = edadArreglo[i]+20;
        }

        System.out.println("Finaliza el test");
    }
}
