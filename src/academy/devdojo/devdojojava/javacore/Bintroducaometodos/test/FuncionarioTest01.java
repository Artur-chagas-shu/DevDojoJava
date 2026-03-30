package academy.devdojo.devdojojava.javacore.Bintroducaometodos.test;

import academy.devdojo.devdojojava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sushi");
        funcionario.setIdade( 25);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprimir();
        System.out.println("Média " + funcionario.getMedia());

    }
}
