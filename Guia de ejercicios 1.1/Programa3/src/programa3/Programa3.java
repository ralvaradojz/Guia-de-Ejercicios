
package programa3;
import java.io.*;
import java.util.Scanner;

public class Programa3 {

    
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int numero = 0;

        System.out.println("Introduzca un número entero:");
        numero = valor.nextInt();

        if (numero % 2 == 0 )
        {
            System.out.println("El número es PAR" );
        }
        else
        {
            System.out.println("El número es IMPAR" );
        }
        
    }
}
