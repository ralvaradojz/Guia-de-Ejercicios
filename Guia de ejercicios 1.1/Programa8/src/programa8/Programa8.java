
package programa8;
import java.io.*;
import java.util.Scanner;

public class Programa8 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String letra = " ";
        int vocales = 0, consonantes = 0;
        
        for (int i=0; i<5; i++){
            System.out.println("Ingrese una letra...");
            letra = leer.nextLine();
            if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u") || 
                    letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
                vocales++;
            }else{
                consonantes++;
            }
        }
        System.out.println("El total de vocales es: "+vocales);
        System.out.println("El total de consonantes es: "+consonantes);
        
        
        
    }
}
