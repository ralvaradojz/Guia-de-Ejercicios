
package programa18;
import java.util.Scanner;

public class Programa18 {

    
    public static void main(String[] args) {
        Divisa Jz = new Divisa();
        String nombre, pais, simbolo;
        double tasaCambio, montoLps, conversion = 0;
        Scanner datos = new Scanner(System.in);
        
        System.out.println("Calculadora de divisas");
        System.out.println("");
        System.out.println("Divisa 1:");
        System.out.print("Nombre: ");
        nombre = datos.next();
        System.out.print("Tasa de Cambio: ");
        tasaCambio = datos.nextDouble();
        System.out.print("País: ");
        pais = datos.next();
        System.out.print("Símbolo: ");
        simbolo = datos.next();
        System.out.print("Monto Lempiras: ");
        montoLps = datos.nextDouble();
        System.out.println("Conversión: "+Jz.Simbolo(simbolo)+" "+Jz.Conversion(tasaCambio, montoLps));
        System.out.println("");
        
        System.out.println("");
        System.out.println("Divisa 2:");
        System.out.print("Nombre: ");
        nombre = datos.next();
        System.out.print("Tasa de Cambio: ");
        tasaCambio = datos.nextDouble();
        System.out.print("País: ");
        pais = datos.next();
        System.out.print("Símbolo: ");
        simbolo = datos.next();
        System.out.print("Monto Lempiras: ");
        montoLps = datos.nextDouble();
        System.out.println("Conversión: "+Jz.Simbolo(simbolo)+" "+Jz.Conversion(tasaCambio, montoLps));
        System.out.println("");
        
        System.out.println("");
        System.out.println("Divisa 3:");
        System.out.print("Nombre: ");
        nombre = datos.next();
        System.out.print("Tasa de Cambio: ");
        tasaCambio = datos.nextDouble();
        System.out.print("País: ");
        pais = datos.next();
        System.out.print("Símbolo: ");
        simbolo = datos.next();
        System.out.print("Monto Lempiras: ");
        montoLps = datos.nextDouble();
        System.out.println("Conversión: "+Jz.Simbolo(simbolo)+" "+Jz.Conversion(tasaCambio, montoLps));
        System.out.println("");
    }
    
}
