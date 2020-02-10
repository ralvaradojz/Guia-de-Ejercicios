
package programa11;
import java.io.*;
import java.util.Scanner;

public class Programa11 {

    
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        String nombreEmp = "Roberto Alvarado";
        int codigoEmp = 271017;
        double valorhora = 50.00;
        double numHoras, horaNormal, horExtras, horExtras1, total, horExEx;
        
        System.out.println("___________ Planilla de empleados ___________");
        System.out.println("---------------------------------------------");
        System.out.println("Empleado "+codigoEmp+" - "+nombreEmp);
        System.out.println("---------------------------------------------");
        System.out.println("Ingrese la cantidad de horas laboradas:");
        System.out.println(" ");
        numHoras = datos.nextInt();
        
        if (numHoras <= 44) {
        total = (numHoras*valorhora);
        System.out.println ("El Total a Pagar es de : "+total);
            System.out.println("Horas Extra = 0");
        }
        else {
        if ((numHoras > 44)&&(numHoras <=60)) {
        horaNormal = (44*valorhora);
        horExtras = ((numHoras-44)*(valorhora*2));
        total = (horaNormal+horExtras);
        System.out.println ("El Total a Pagar es de : "+total);
            System.out.println("Horas Extra = "+horExtras);
        }
        else {
        if (numHoras > 60) {
        horExEx = (numHoras-60);
        horaNormal = (44*valorhora);
        horExtras = (8*(valorhora*2));
        horExtras1 = (horExEx*(3*valorhora));
        total = (horaNormal+horExtras+horExtras1);
        System.out.println ("El Total a Pagar es de : "+total);
        }
    }
        }
    }
}

