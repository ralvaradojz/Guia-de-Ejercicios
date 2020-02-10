
package programa5;
import java.io.*;
import java.util.Scanner;

public class Programa5 {

    
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int ventas, cosVentas, utilBruta, gasOpera, utilOpera, otPro, otGastos, utilIP, impuesto, parTra, utilNeta;
        
        System.out.println("Ingrese el valor de las ventas:");
        ventas = valor.nextInt();
        System.out.println("Ingrese el costo de ventas");
        cosVentas = valor.nextInt();
        System.out.println("Ingrese los gastos de Operación");
        gasOpera = valor.nextInt();
        System.out.println("Ingrese el valor de otros productos");
        otPro = valor.nextInt();
        System.out.println("Ingrese el valor de otros gastos");
        otGastos = valor.nextInt();
        System.out.println("Ingrese el valor de (PTU)");
        parTra = valor.nextInt();
        System.out.println("__________________________________________________________________________");
        
        utilBruta = (ventas - cosVentas);
        utilOpera = (utilBruta - gasOpera);
        utilIP = (utilOpera + otPro) - otGastos;
        impuesto = (utilIP * 28) / 100;
        utilNeta = (utilIP - impuesto) - parTra;
        
        System.out.println("                      J.Z COMERCIALIZADORA S.A.");
        System.out.println("     Estado de resultados del 1 de enero al 31 de diciembre de 2020");
        System.out.println("__________________________________________________________________________");
        System.out.println("Ventas                                                        " + ventas);
        System.out.println("Costo de ventas                                              -" + cosVentas);
        System.out.println("Utilidad bruta                                                " + utilBruta);
        System.out.println("Gastos de operación                                          -" + gasOpera);
        System.out.println("Utilidad en operación                                         " + utilOpera);
        System.out.println("Otros productos                                               " + otPro);
        System.out.println("Otros gastos                                                 -" + otGastos);
        System.out.println("Utilidad antes del ISR y PTU                                  " + utilIP);
        System.out.println("Impuesto sobre la renta (ISR) 28%                            -" + impuesto);
        System.out.println("Participacion de los trabajadores en las utilidades (PTU)    -" + parTra);
        System.out.println("Utilidad neta                                                 " + utilNeta);
        
    }
    
}
