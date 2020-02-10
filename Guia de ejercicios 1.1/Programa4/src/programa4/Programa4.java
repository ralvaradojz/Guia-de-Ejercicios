
package programa4;
import java.io.*;
import java.util.Scanner;

public class Programa4 {

    
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        double ladoa = 0;
        double ladob = 0;
        double hipo = 0;
        
        System.out.println("Programa para calcular la Hipotenusa (h) de un triangulo rectangulo");
        System.out.println("");
        System.out.println("Introduzca el lado A:");
        ladoa = valor.nextDouble();
        System.out.println("Introduzca el lado B:");
        ladob = valor.nextDouble();
        
        hipo = ((ladoa * ladoa) + (ladob * ladob));
        hipo = Math.sqrt (hipo);
        
        System.out.println("El valor de la Hipotenusa es:      " + hipo);
    }
    
}
