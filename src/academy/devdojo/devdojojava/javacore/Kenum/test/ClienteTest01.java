package academy.devdojo.devdojojava.javacore.Kenum.test;

import academy.devdojo.devdojojava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.devdojojava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    static void main() {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Tsubasa",TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Tsubasa",TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
