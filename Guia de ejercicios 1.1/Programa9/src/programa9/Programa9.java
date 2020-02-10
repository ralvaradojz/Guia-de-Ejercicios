
package programa9;
import java.util.Scanner;

public class Programa9 {

    
    public static void main(String[] args) {
        Scanner dia = new Scanner(System.in);
        int num = 0;
        
        System.out.println("Ingrese un numero para identificar el dia de la semana");
        System.out.println("");
        System.out.println("| Domingo | - | Lunes | - | Martes | - | Miercoles | - | Jueves | - | Viernes | - | Sabado |");
        System.out.println("");
        num = dia.nextInt();
        
        switch (num) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                num = dia.nextInt();
                break;
        }
    }
}
