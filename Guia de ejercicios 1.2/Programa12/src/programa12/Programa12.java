
package programa12;

public class Programa12 {

    
    public static void main(String[] args) {
        int numero = 0;
        System.out.println("Primeros 15 numeros pares naturales");
        System.out.println("");
        int contador = 0;
        
        for(numero = 0; numero <= 28; numero+=2){
            contador = contador + 1;
            System.out.println(contador+ " - " +numero);
        }
        
    }
    
}
