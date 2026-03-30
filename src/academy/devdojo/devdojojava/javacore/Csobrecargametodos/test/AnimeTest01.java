package academy.devdojo.devdojojava.javacore.Csobrecargametodos.test;

import academy.devdojo.devdojojava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive","TV",12,"Ação");
        anime.imprime();
    }
}
