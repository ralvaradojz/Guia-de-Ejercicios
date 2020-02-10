
package programa7;
import java.io.*;
import java.util.Scanner;

public class Programa7 {

    
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int ladoa, ladob, ladoc;
        
        System.out.println("Programa para determinar que tipo de triangulo es, Isosceles, Escaleno o Equilatero");
        System.out.println("");
        System.out.println("Ingrese el valor del lado A");
        ladoa = valor.nextInt();
        System.out.println("Ingrese el valor del lado B");
        ladob = valor.nextInt();
        System.out.println("Ingrese el valor del lado C");
        ladoc = valor.nextInt();
        
        if (ladoa == ladob && ladob == ladoc){
            System.out.println("El triangulo es Equilatero");
        }else if (ladoa == ladob && ladob != ladoc){
            System.out.println("El triangulo es Isosceles");
        }else if (ladoa != ladob && ladob != ladoc){
            System.out.println("El triangulo es Escaleno");
        }else{
            System.out.println("Error");
        }
    }
}
