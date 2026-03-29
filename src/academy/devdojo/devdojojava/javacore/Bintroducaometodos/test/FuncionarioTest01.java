package academy.devdojo.devdojojava.javacore.Bintroducaometodos.test;

import academy.devdojo.devdojojava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Sushi";
        funcionario.idade = 25;
        double[] salarios = new double[]{1200, 987.32, 2000};
        funcionario.salarios = salarios;

        funcionario.imprimir();

    }
}
