
package programa17;


public class Formulas {
    private float num1, num2;
    
    public Formulas(){
        this.num1 = 0;
        this.num2 = 0;
    }
    public Formulas(float num1, float num2){
        this.num1 = 0;
        this.num2 = 0;
    }
    public float Sumar(float num1, float num2){
        return num1 + num2;
    }
    public float Restar(float num1, float num2){
        return num1 - num2;
    }
    public float Multiplicar(float num1, float num2){
        return num1 * num2;
    }
    public float Dividir(float num1, float num2){
        float div = 0;
        if (num2 != 0){
            div = num1 / num2;
        }
        return num1 / num2;
    } 
    public double Potencia(double base, double exponente){
        double resultado = Math.pow(base, exponente);
        return resultado;
    }
    
}
