package academy.devdojo.devdojojava.javacore.Zgenerics.test;

import academy.devdojo.devdojojava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    static void main() {
        List <String> lista = new ArrayList<>();
        lista.add("Midoriya");
        lista.add("Midoriya");

        for (String o : lista) {
            System.out.println(o);
        }
        add(lista, new Consumidor("Midoriya"));

        for (String o : lista) {
            System.out.println(o);
        }


    }

    private static void add (List lista , Consumidor consumidor){
        lista.add(consumidor);
    }
}
