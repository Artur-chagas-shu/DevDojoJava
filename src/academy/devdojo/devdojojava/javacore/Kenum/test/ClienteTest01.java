package academy.devdojo.devdojojava.javacore.Kenum.test;

import academy.devdojo.devdojojava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.devdojojava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.devdojojava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    static void main() {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

    }
}
