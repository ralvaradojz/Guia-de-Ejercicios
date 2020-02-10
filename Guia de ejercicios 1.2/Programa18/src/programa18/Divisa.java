
package programa18;


public class Divisa {
    private String nombre, pais, simbolo;
    private double tasaCambio, montoLps, conversion;
    
    Divisa(){
        this.nombre = "";
        this.tasaCambio = 0;
        this.pais = "";
        this.simbolo = "";
        this.montoLps = 0;
        this.conversion = 0;
    }
    
    public String Nombre(String nombre){
        return this.nombre;
    }
    public double TasaCambio(double tasaCambio){
        return this.tasaCambio;
    }
    public String Pais(String pais){
        return this.pais;
    }
    public String Simbolo(String simbolo){
        return simbolo;
    }
    public double MontoLps(double montoLps){
        return this.montoLps;
    }
    public double Conversion(double tasaCambio, double montoLps){
        double conversion = montoLps / tasaCambio;
        return conversion;
    }
}
