public class IceCreamPrice {
    public static void main(String[] args) {

        int price;
        int options=0;
        String description;

        switch (options){

            case 1:
                description = "paleta de uva";
                price = 15;
                break;
            case 2:
                description = "paleta de fresa";
                price = 15;
                break;
            case 3:
                description = "paleta de crema";
                price = 25;
                break;
            case 4:
                description = "bote 1L De helado de yogurt";
                price = 45;
                break;
            case 5:
                description = "bote 1L De helado de Fresa";
                price = 45;
                break;
            case 6:
                description = "bote 1L De helado napolitano";
                price = 45;
                break;
            default:
                System.out.println("Elija un valor valido");


        }
    }
}
