
package programa6;
import java.io.*;
import java.util.Scanner;

public class Programa6 {

    
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int numero1, numero2, numero3;
        
        System.out.println("Introduzca primer número: ");
        numero1 = valor.nextInt();
        System.out.println("Introduzca segundo número: ");
        numero2 = valor.nextInt();
        System.out.println("Introduzca tercer número: ");
        numero3 = valor.nextInt();
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                System.out.println("El número mayor es: " + numero1);
            } else {
                System.out.println("El número mayor es: " + numero3);
            }
        } else if (numero2 > numero3) {
            System.out.println("El número mayor es: " + numero2);
        } else {
            System.out.println("El número mayor es: " + numero3);
        }
        if (numero1 < numero2) {
            if (numero1 < numero3) {
                System.out.println("El número menor es: " + numero1);
            } else {
                System.out.println("El número menor es: " + numero3);
            }
        } else if (numero2 < numero3) {
            System.out.println("El número menor es: " + numero2);
        } else {
            System.out.println("El número menor es: " + numero3);
        }
    }
}
