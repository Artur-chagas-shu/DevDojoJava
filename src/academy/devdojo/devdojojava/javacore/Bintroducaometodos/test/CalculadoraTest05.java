package academy.devdojo.devdojojava.javacore.Bintroducaometodos.test;

import academy.devdojo.devdojojava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[]numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
