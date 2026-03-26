package academy.devdojo.devdojojava.javacore.Bintroducaometodos.test;

import academy.devdojo.devdojojava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        Calculadora calculadora = new Calculadora();
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro CalculadoraTeste04");
        System.out.println(num1);
        System.out.println(num2);
    }
}
