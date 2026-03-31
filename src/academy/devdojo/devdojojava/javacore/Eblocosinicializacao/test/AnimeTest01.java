package academy.devdojo.devdojojava.javacore.Eblocosinicializacao.test;

import academy.devdojo.devdojojava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTest01 {
    static void main(String[] args) {
        Anime anime = new Anime();
        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");

        }

    }
}
