package academy.devdojo.devdojojava.javacore.Hheranca.test;

import academy.devdojo.devdojojava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.devdojojava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.devdojojava.javacore.Hheranca.dominio.Pessoa;

public class HerencaTest01 {
    static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("40240-620");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohissa Shimazu");
        pessoa.setCpf("111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("2222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("-----------");

        funcionario.imprime();
    }
}
