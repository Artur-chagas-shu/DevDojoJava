package academy.devdojo.devdojojava.javacore.Ycolecoes.test;

import academy.devdojo.devdojojava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "iPhone");
        System.out.println(s1.equals(s2));
    }
}
