
package programa16;
import java.util.Scanner;

public class Programa16 {

    
    public static void main(String[] args) {
        int opcion = 0, cantidad = 0;
        double pupusas = 0, costillas = 0, carne = 0, pollo = 0, sopa = 0;
        char orden = ' ';
        Scanner datos = new Scanner(System.in);
        
        System.out.println("                    Menú");
        System.out.println("────────────────────────────");
        System.out.println("1. Pupusas ----------------------- 30.0 lps.");
        System.out.println("2. Costillas BBQ ----------------- 80.0 lps.");
        System.out.println("3. Carne de res y cerdo azada ---- 70.0 lps.");
        System.out.println("4. Pollo a la mantequilla -------- 65.0 lps.");
        System.out.println("5. Sopa de mondongo -------------- 90.0 lps.");
        System.out.println("────────────────────────────");
        System.out.println("Elija una opcion del menu");
        opcion = datos.nextInt();
        System.out.println("Ingrese la cantidad de platos");
        cantidad = datos.nextInt();
        System.out.println("");
        System.out.println("Presione Y para confirmar su orden, X Para cambiar su orden o S para salir");
        orden = datos.next().charAt(0);
        
        pupusas = cantidad * 30.0;
        costillas = cantidad * 80.0;
        carne = cantidad * 70.0;
        pollo = cantidad * 65.0;
        sopa = cantidad * 90.0;
        
        switch (orden) {
            case 'x':
            case 'X':
                System.out.println("");
                System.out.println("Elija una opcion del menu");
                opcion = datos.nextInt();
                System.out.println("Ingrese la cantidad de platos");
                cantidad = datos.nextInt();
                System.out.println("");
                switch (opcion){
                    case 1:
                        System.out.println(cantidad+" - ordenes de pupusas");
                        System.out.println("Total a pagar:  "+pupusas+"  Lps.");
                        break;
                    case 2:
                        System.out.println(cantidad+" - ordenes de costilla BBQ");
                        System.out.println("Total a pagar:  "+costillas+"  Lps.");
                        break;
                    case 3:
                        System.out.println(cantidad+" - ordenes de carne azada");
                        System.out.println("Total a pagar:  "+carne+"  Lps.");
                        break;
                    case 4:
                        System.out.println(cantidad+" - ordenes de pollo a la mantequilla");
                        System.out.println("Total a pagar:  "+pollo+"  Lps.");
                        break;
                    case 5:
                        System.out.println(cantidad+" - platos de sopa");
                        System.out.println("Total a pagar:  "+sopa+"  Lps.");
                        break;
                    default:
                        System.err.println("Ingrese una opcion valida:");
                        break;
                }
                break;
            case 'y':
            case 'Y':
                System.out.println("Proceda a cancelar su orden");
                switch (opcion){
                    case 1:
                        System.out.println(cantidad+" - ordenes de pupusas");
                        System.out.println("Total a pagar:  "+pupusas+"  Lps.");
                        break;
                    case 2:
                        System.out.println(cantidad+" - ordenes de costilla BBQ");
                        System.out.println("Total a pagar:  "+costillas+"  Lps.");
                        break;
                    case 3:
                        System.out.println(cantidad+" - ordenes de carne azada");
                        System.out.println("Total a pagar:  "+carne+"  Lps.");
                        break;
                    case 4:
                        System.out.println(cantidad+" - ordenes de pollo a la mantequilla");
                        System.out.println("Total a pagar:  "+pollo+"  Lps.");
                        break;
                    case 5:
                        System.out.println(cantidad+" - platos de sopa");
                        System.out.println("Total a pagar:  "+sopa+"  Lps.");
                        break;
                    default:
                        System.err.println("Ingrese una opcion valida:");
                        break; 
                }
                break;
            default:
                System.out.println("Gracias por su visita...");
                break;
        }
        }
        
    }
