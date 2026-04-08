package academy.devdojo.devdojojava.javacore.Npolimorfismo.test;

import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main() {
        Computador computador = new Computador("NUC10I7", 11000 );
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao tv = new Televisao("Samsung 50\"",5000 );

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }
}
