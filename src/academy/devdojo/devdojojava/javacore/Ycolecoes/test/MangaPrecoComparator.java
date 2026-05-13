package academy.devdojo.devdojojava.javacore.Ycolecoes.test;

import academy.devdojo.devdojojava.javacore.Ycolecoes.dominio.Manga;

import java.util.Comparator;

public class MangaPrecoComparator implements Comparator<Manga> {


    @Override
    public int compare(Manga o1, Manga o2) {
        return  (o1.getPreco() <= o2.getPreco() ? -1 : 1);
    }
}
