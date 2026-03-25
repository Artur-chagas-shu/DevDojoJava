package academy.devdojo.devdojojava.javacore.Bintroducaometodos.test;

import academy.devdojo.devdojojava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTeste01");
        calculadora.subtraiDoisNumeros();
    }
}
