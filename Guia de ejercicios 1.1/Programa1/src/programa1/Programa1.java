
package programa1;
import java.io.*;
import java.util.Scanner;

public class Programa1 {

    
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
        double suma = 0;
        double resta = 0;
        double division = 0;
        double multi = 0;
        Scanner scanNum = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        num1 = scanNum.nextDouble();
        System.out.println("Ingrese otro numero:");
        num2 = scanNum.nextDouble();
        
        suma = (num1) + (num2);
        resta = (num2) - (num2);
        division = (num1) / (num2);
        multi = (num1) * (num2);
        
        System.out.println("     Resultados     ");
        System.out.println("");
        System.out.println("El valor de la suma es        :     " + suma);
        System.out.println("El valor de la resta es       :     " + resta);
        System.out.println("El valor de la división es    :     " + division);
        System.out.println("El valor de la multiplicación :     " + multi);
    }
    
}
