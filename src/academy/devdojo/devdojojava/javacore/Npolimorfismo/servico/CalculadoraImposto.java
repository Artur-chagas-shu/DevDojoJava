package academy.devdojo.devdojojava.javacore.Npolimorfismo.servico;

import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}
