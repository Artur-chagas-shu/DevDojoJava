package academy.devdojo.devdojojava.javacore.Zgenerics.test;

import academy.devdojo.devdojojava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {

    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcoList);

    }

    private static <T> List<T> criarArrayComUmObjeto(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        return list;
    }

    /*private static <T extends Comparable> List<T> criarArrayComUmObjeto(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        return list;
    }*/


}


