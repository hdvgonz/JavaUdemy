public class SentenciaBuclesEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for (int i = 0; i < 5; i++) {//etiqueta del for que esta debajo

            System.out.println("\n");
            for (int j = 0; j < 5; j++) {
                if (i == 02) {
                    continue bucle1;

                }
                System.out.print("[i = " + i + " j = "+j+"]" + " ");
            }
        }
        System.out.println("\n================================");
        bucle2:
        for (int i = 0; i < 5; i++) {//etiqueta del for que esta debajo

            System.out.println("\n");
            for (int j = 0; j < 5; j++) {
                if (i == 02) {
                    break bucle2;

                }
                System.out.print("[i = " + i + " j = "+j+"]" + " ");
            }
        }
    }
}
