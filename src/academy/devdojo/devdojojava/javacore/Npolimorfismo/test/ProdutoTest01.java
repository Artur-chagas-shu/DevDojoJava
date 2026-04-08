package academy.devdojo.devdojojava.javacore.Npolimorfismo.test;

import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main() {
        Computador computador = new Computador("NUC10I7", 11000 );
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        CalculadoraImposto.calculadoraImpostoComputador(computador);
        System.out.println("------------------------");
        CalculadoraImposto.calculadoraImpostoTomate(tomate);
    }
}
