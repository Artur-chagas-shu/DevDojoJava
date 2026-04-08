package academy.devdojo.devdojojava.javacore.Npolimorfismo.servico;

import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calculadoraImpostoComputador(Computador computador){
        System.out.println("Relatorio de Imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador " + computador.getNome());
        System.out.println("Valor " + computador.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }

    public static void calculadoraImpostoTomate(Tomate tomate){
        System.out.println("Relatorio de Imposto do Tomate");
        double imposto = tomate.calcularImposto();
        System.out.println("Tomate " + tomate.getNome());
        System.out.println("Valor " + tomate.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }
}
