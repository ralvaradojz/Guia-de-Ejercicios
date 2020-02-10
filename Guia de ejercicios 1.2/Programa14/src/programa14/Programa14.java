
package programa14;
import java.util.Scanner;

public class Programa14 {

    
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double meses = 0;
        double cuotaMen = 0, valCuota = 0, cuotaMenInt = 0;
        
        System.out.println("        Cooperativa de ahorro, JisZun S.A.        ");
        System.out.println("───────────────────────────────");
        System.out.println("");
        System.out.println("Ingrese la cantidad de meses que desea ahorrar");
        meses = datos.nextInt();
        System.out.println("Ingrese el valor de la cuota mensual");
        valCuota = datos.nextDouble();
        System.out.println("");
        
        cuotaMen = valCuota * 0.05;
        cuotaMenInt = valCuota + cuotaMen;

        System.out.println("La cooperativa otorga el 5% de intereses a sus cliente por su ahorros");
        System.out.println("");
        for (int i=1; i<=meses; i++){
            System.out.println("Mes:  "+i+"  total ahorrado:  "+i*cuotaMenInt);
            System.out.println("───────────────────────");
        }
        System.out.println("");
        System.out.println("Total ahorrado: "+meses*cuotaMenInt+"  en  "+meses+"  meses");
        System.out.println("───────────────────────────────");
        System.out.println("");
    }
    
}
