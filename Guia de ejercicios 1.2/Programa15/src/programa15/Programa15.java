
package programa15;
import java.util.Scanner;

public class Programa15 {

    
    public static void main(String[] args) {
        double valMasa = 0;
        int opcion = 0;
        char opcionx = ' ';
        double kilo = 0; double gramo = 0;
        double libra = 0; double onzas = 0;
        Scanner datos = new Scanner(System.in);
        System.out.println("Conversor de Masa");
        System.out.println("");
        
        System.out.println("Elija una opcion de conversion:");
        System.out.println("");
        System.out.print(" 1 - Kilogramos a libras        ");System.out.println(" 6 - Libras a onzas");
        System.out.print(" 2 - Kilogramos a gramos        ");System.out.println(" 7 - Gramos a libras");
        System.out.print(" 3 - Kilogramos a onzas         ");System.out.println(" 8 - Gramos a onzas");
        System.out.print(" 4 - Libras a kilogramos        ");System.out.println(" 9 - Onzas a libras");
        System.out.print(" 5 - Libras a gramos            ");System.out.println(" 10 - Onzas a gramos");
        System.out.println("");
        opcion = datos.nextInt();
        System.out.println("Ingrese el valor a convertir");
        valMasa = datos.nextDouble();
        System.out.println("");
        
        switch (opcion) {
            case 1:
                kilo = valMasa * 2.20462;
                System.out.println(+valMasa+"  kilogramos =  "+kilo+ " libras");
                break;
                
            case 2:
                kilo = valMasa * 1000;
                System.out.println(+valMasa+"  kilogramos =  "+kilo+ " gramos");
                break;
            case 3:
                kilo = valMasa * 35.274;
                System.out.println(+valMasa+"  kilogramos =  "+kilo+ " onzas");
                break;
            case 4:
                libra = valMasa * 0.453592;
                System.out.println(+valMasa+"  libras = "+libra+ " kilogramos");
                break;
            case 5:
                libra = valMasa * 453.592;
                System.out.println(+valMasa+"  libras = "+libra+ " gramos");
                break;
            case 6:
                libra = valMasa * 16;
                System.out.println(+valMasa+"  libras = "+libra+ " onzas");
                break;
            case 7:
                gramo = valMasa * 0.00220462;
                System.out.println(+valMasa+"  gramos = "+gramo+ " libras");
                break;
            case 8:
                gramo = valMasa * 0.035274;
                System.out.println(+valMasa+"  gramos = "+gramo+ " onzas");
                break;
            case 9:
                onzas = valMasa * 0.0625;
                System.out.println(+valMasa+"  gramos = "+onzas+ " libras");
                break;
            case 10:
                onzas = valMasa * 28.3495;
                System.out.println(+valMasa+"  gramos = "+onzas+ " gramos");
                break;
            default:
                System.err.println("Ingrese una opcion valida:");
                break;
        }
        System.out.println("");
        System.out.println("Presione Y para realizar otra conversion o presiones X para salir");
        opcionx = datos.next().charAt(0);
        if (opcionx == 'y'){
            System.out.println("");
            System.out.println("Elija una opcion de conversion:");
            System.out.println("");
            opcion = datos.nextInt();
            System.out.println("Ingrese el valor a convertir");
            valMasa = datos.nextDouble();
            System.out.println("");
        
        switch (opcion) {
            case 1:
                kilo = valMasa * 2.20462;
                System.out.println(+valMasa+"  kilogramos =  "+kilo+ " libras");
                break;
                
            case 2:
                kilo = valMasa * 1000;
                System.out.println(+valMasa+"  kilogramos =  "+kilo+ " gramos");
                break;
            case 3:
                kilo = valMasa * 35.274;
                System.out.println(+valMasa+"  kilogramos =  "+kilo+ " onzas");
                break;
            case 4:
                libra = valMasa * 0.453592;
                System.out.println(+valMasa+"  libras = "+libra+ " kilogramos");
                break;
            case 5:
                libra = valMasa * 453.592;
                System.out.println(+valMasa+"  libras = "+libra+ " gramos");
                break;
            case 6:
                libra = valMasa * 16;
                System.out.println(+valMasa+"  libras = "+libra+ " onzas");
                break;
            case 7:
                gramo = valMasa * 0.00220462;
                System.out.println(+valMasa+"  gramos = "+gramo+ " libras");
                break;
            case 8:
                gramo = valMasa * 0.035274;
                System.out.println(+valMasa+"  gramos = "+gramo+ " onzas");
                break;
            case 9:
                onzas = valMasa * 0.0625;
                System.out.println(+valMasa+"  gramos = "+onzas+ " libras");
                break;
            case 10:
                onzas = valMasa * 28.3495;
                System.out.println(+valMasa+"  gramos = "+onzas+ " gramos");
                break;
            default:
                System.err.println("Ingrese una opcion valida:");
                break;
            }
        }else {
            System.out.println("Hasta luego...");
        }
    }
}
