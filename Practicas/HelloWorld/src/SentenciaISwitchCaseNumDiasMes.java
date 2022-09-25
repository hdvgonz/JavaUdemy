public class SentenciaISwitchCaseNumDiasMes {
    public static void main(String[] args) {

        int mes=2;
        int numeroDias = 0;
        int anio=0;

        switch (mes){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                System.out.println("Es mes tiene = " + numeroDias);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias=30;
                System.out.println("Es mes tiene = " + numeroDias);
                break;
            case 2:
                if ((anio%400==0) || (anio %4 == 0) && (anio %100!=0)){
                    numeroDias=29;
                    System.out.println("Es mes tiene = " + numeroDias);

                }else {
                    numeroDias=28;
                    System.out.println("Es mes tiene = " + numeroDias);
                }
                break;
            default:
                System.out.println("No es un Mes Valido");
        }


    }
}
