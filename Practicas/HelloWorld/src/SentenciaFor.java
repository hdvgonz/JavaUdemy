public class SentenciaFor {
    public static void main(String[] args) {

        /*for (int i=0;i<101;i++){
            System.out.println(i);
        }*/
       //Imprimir numeros impares

        for (int i=0; i<100;i++){
            if(i%2 ==0){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
