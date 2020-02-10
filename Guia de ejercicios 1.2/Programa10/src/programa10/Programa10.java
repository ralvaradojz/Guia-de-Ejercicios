
package programa10;
import java.io.*;
import java.util.Scanner;

public class Programa10 {

    
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int opcion = 0;
        double monto = 0;
        double dolares = 24.62;
        double euros = 27.11;
        double quetzales = 3.21;
        double bitcoins = 230107.06;
        double tasaCambio = 0;
        
        System.out.println("___________ Tasas de Cambio ___________");
        System.out.println(" ");
        System.out.println(" 1 - Dolares");
        System.out.println(" 2 - Euros");
        System.out.println(" 3 - Quetzales");
        System.out.println(" 4 - Bitcoins");
        System.out.println(" ");
        System.out.println("Elija una opcion de moneda para realizar la conversión");
        opcion = datos.nextInt();
        System.out.println("Ingrese el valor a convertir:");
        monto = datos.nextDouble();
        System.out.println(" ");
        
        switch (opcion) {
            case 1:
                tasaCambio = monto * dolares;
                System.out.println(+monto+"  USD  = "+tasaCambio+ " Lps." );
                break;
            case 2:
                tasaCambio = monto * euros;
                System.out.println(+monto+"  EUR  = "+tasaCambio+ " Lps." );
                break;
            case 3:
                tasaCambio = monto * quetzales;
                System.out.println(+monto+"  GTQ = "+tasaCambio+ " Lps." );
                break;
            case 4:
                tasaCambio = monto * bitcoins;
                System.out.println(+monto+"  BTC  = "+tasaCambio+ " Lps." );
                break;
            default:
                System.out.println("Ingrese una opcion valida:");
                break;
        }
    }
    
}
