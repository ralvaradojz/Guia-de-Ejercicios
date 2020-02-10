
package programa13;
import java.util.Scanner;

public class Programa13 {

    
    public static void main(String[] args) {
        double pNum1 = 0;
        double pNum2 = 0;
        double pNum3 = 0;
        double pNum4 = 0;
        double pNum5 = 0;
        double suma = 0; double promedio = 0;
        Scanner numeros = new Scanner(System.in);
        
        System.out.println("Ingrese 5 numeros para determinar el promedio:");
        pNum1 = numeros.nextDouble();
        pNum2 = numeros.nextDouble();
        pNum3 = numeros.nextDouble();
        pNum4 = numeros.nextDouble();
        pNum5 = numeros.nextDouble();
        System.out.println("");
        
        suma = pNum1 + pNum2 + pNum3 + pNum4 + pNum5;
        promedio = (suma / 5);
        
        System.out.println("El promedio de los 5 numeros es:    "+promedio);
        System.out.println("");
    }
    
}
