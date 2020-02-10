
package programa2;
import java.io.*;
import java.util.Scanner;

public class Programa2 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        double area = 0;
        double base = 0;
        double altura = 0;
        double lado = 0;
        double rectan = 0;
        double cubo = 0;
        double cuadra = 0;
        
        System.out.println("Calcular el area de un Rectagulo, Cubo y un Cuadrado");
        System.out.println("");
        System.out.println("Ingrese la base del Rectagulo:");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura del Rectagulo:");
        altura = entrada.nextInt();
        System.out.println("Ingrese el lado del Cubo:");
        lado = entrada.nextInt();
        
        rectan = (base * altura) / 2;
        area = (lado * 4);
        cubo = (6 * area);
        cuadra = (base * altura);
        
        System.out.println("          Resultados          ");
        System.out.println("");
        System.out.println("Area de un Rectangulo");
        System.out.println(rectan);
        System.out.println("Area de un Cubo");
        System.out.println(cubo);
        System.out.println("Area de un Cuadrado");
        System.out.println(cuadra);
    }
}