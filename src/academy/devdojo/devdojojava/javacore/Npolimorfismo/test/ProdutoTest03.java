package academy.devdojo.devdojojava.javacore.Npolimorfismo.test;

import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    static void main() {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2026");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------");
        CalculadoraImposto.calcularImposto(produto);

    }

}
