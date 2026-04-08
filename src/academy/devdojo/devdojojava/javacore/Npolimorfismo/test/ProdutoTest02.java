package academy.devdojo.devdojojava.javacore.Npolimorfismo.test;

import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    static void main() {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("-------");

        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }

}
