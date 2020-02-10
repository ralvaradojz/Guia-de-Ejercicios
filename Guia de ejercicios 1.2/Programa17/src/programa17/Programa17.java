
package programa17;
import java.util.Scanner;

public class Programa17 {

    
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        float num1 = 0, num2 = 0;
        double base = 0,exponente = 0;
        int opcion = 0;
        
        System.out.println("Elija una opcion para efectuar un calculo");
        System.out.println("");
        System.out.println("1.- Sumar dos numeros");
        System.out.println("2.- Restar dos numeros");
        System.out.println("3.- Multiplicar dos numeros");
        System.out.println("4.- Dividir dos numeros");
        System.out.println("5.- La “n” potencia de un numero");
        System.out.println("");
        
        Formulas Jz = new Formulas();
        System.out.println("Ingrese su opcion");
        opcion = datos.nextInt();
        System.out.println("");
        
        switch (opcion){
            case 1:
                System.out.println("Ingrese un numero");
                num1 = datos.nextFloat();
                System.out.println("Ingrese otro numero");
                num2 = datos.nextFloat();
                System.out.println("La suma de dos numeros es: "+Jz.Sumar(num1, num2));
                break;
            case 2:
                System.out.println("Ingrese un numero");
                num1 = datos.nextFloat();
                System.out.println("Ingrese otro numero");
                num2 = datos.nextFloat();
                System.out.println("La resta de dos numeros es: "+Jz.Restar(num1, num2));
                break;
            case 3:
                System.out.println("Ingrese un numero");
                num1 = datos.nextFloat();
                System.out.println("Ingrese otro numero");
                num2 = datos.nextFloat();
                System.out.println("La multiplicacion de dos numero es: "+Jz.Multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("Ingrese un numero");
                num1 = datos.nextFloat();
                System.out.println("Ingrese otro numero");
                num2 = datos.nextFloat();
                System.out.println("La division de dos numeros es: "+Jz.Dividir(num1, num2));
                break;
            case 5:
                System.out.println("Ingrese el valor de la base");
                base = datos.nextDouble();
                System.out.println("Ingrese el valor de la potencia");
                exponente = datos.nextDouble();
                System.out.println("La potencia es:  "+Jz.Potencia(base, exponente));
                break;
            default :
                System.out.println("Ingrese una opcion valida");
        }
    }
}
