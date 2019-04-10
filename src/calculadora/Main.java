package calculadora;

import Calculo.RaizQuadrada;
import calculadora.views.FrmCalculadoraController;

/* @author gabriel*/
public class Main {

    public static void main(String[] args) {
        FrmCalculadoraController telaCalc = new FrmCalculadoraController();
        RaizQuadrada raizQuadrada = new RaizQuadrada();
        
        raizQuadrada.raizQuadrada(49);
        telaCalc.show(args);
        
    }

}
