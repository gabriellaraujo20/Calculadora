package Calculo;

/** @author gabriel*/
public class Elevado {
    private double resultado;
    
    public double elevado(double base, double exp){
        resultado = Math.pow(base,exp);
        return resultado;
    }
}
