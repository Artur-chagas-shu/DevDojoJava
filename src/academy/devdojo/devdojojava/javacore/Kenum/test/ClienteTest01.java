package academy.devdojo.devdojojava.javacore.Kenum.test;

import academy.devdojo.devdojojava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.devdojojava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    static void main() {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
