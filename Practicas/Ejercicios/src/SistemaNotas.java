import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner o = new Scanner(System.in);
        double [] notas = new double[20];
        int tam= notas.length;
        double prom1 =0; //promedio notas>5
        double prom2 =0; //promedio notas<4
        double promT=0; //promedio Total
        double suma4=0, suma5=0;
        double sumaT=0;
        int contUnos=0, contCuatro=0, contCinco=0;

        for (int i=0;i<tam;i++){
            System.out.println("Ingrese nota #"+(i+1));
            notas[i] = o.nextDouble();
        }
        for (int i=0; i<tam;i++){
            if(notas[i]==0){
                break;
            }else if(notas[i]==1){
                contUnos = contUnos+1;
            } else if (notas[i]<4) {
                contCuatro= contCuatro+1;
                suma4 = suma4+notas[i];
            }else if(notas[i]>5){
                contCinco+=1;
                suma5+=notas[i];
            }
            sumaT = sumaT+notas[i];
        }
        promT= sumaT/tam;

        if(contCuatro>0){
            prom2 = suma4/contCuatro;
            System.out.println("El promedio de notas menores a 4 = " + prom2);
        }else{
            System.out.println("No hay notas menores a 4");
        }
        if(contCinco>0){
            prom1 = suma5/contCinco;
            System.out.println("El promedio de notas menores a 5 = " + prom1);
        }else{
            System.out.println("No hay notas mayores a 5");
        }

        System.out.println("El numero total de unos (1) es de "+contUnos);
        System.out.println("Promedio total de es notas es "+promT);



    }
}
