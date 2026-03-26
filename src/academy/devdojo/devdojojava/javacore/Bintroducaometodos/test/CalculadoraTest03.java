package academy.devdojo.devdojojava.javacore.Bintroducaometodos.test;

import academy.devdojo.devdojojava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
       double resultado = calculadora.divideDoisNumeros(20,2);
        System.out.println(resultado);
        System.out.println(calculadora.divideDoisNumeros02(20,0));
        System.out.println("-----------------");
        calculadora.imprimeDivisaoDeDoisNumeros02(86,0);

    }
}
