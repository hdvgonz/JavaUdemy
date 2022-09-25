import java.util.Scanner;

public class TanqueGas {
    public static void main(String[] args) {

        double medidaActual =0.0;
        String res;

        Scanner o = new Scanner(System.in);

        System.out.println("Ingrese medida actual en Litros");
        medidaActual = o.nextDouble();

        res = (medidaActual==70) ? "Estanque lleno": (medidaActual>=60 && medidaActual<70) ? "Estanque casi lleno":
                (medidaActual>=40 && medidaActual<60) ? "Estanque 3/4": (medidaActual>=35 && medidaActual<40) ? "Medio estanque":
                        (medidaActual>=20 && medidaActual<35) ? "Suficiente": (medidaActual>=1 && medidaActual<20) ? "Insuficiente":"";

        System.out.println("Estado actual de Gasolina en el tanque= " + res);
    }
}
