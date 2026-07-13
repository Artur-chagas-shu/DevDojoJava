package academy.devdojo.devdojojava.javacore.ZZClambdas.test;

import academy.devdojo.devdojojava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.devdojojava.javacore.ZZClambdas.dominio.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//Reference to a constructor
public class MethodReferenceTest04 {
    static void main(String[] args) {
        Supplier<AnimeComparators>    newAnimeComprators = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComprators.get();
        List<Anime> animeList = new ArrayList<>( List.of(new Anime("Berzerk", 43), new Anime("One Piece", 100), new Anime("Naruto", 500)));

        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String,Integer,Anime> animeBiFunction = (title,episodes) -> new Anime(title,episodes);
        BiFunction<String,Integer,Anime> animeBiFunctio2 = Anime::new;
        System.out.println(animeBiFunctio2.apply("Super Campeoes", 36));
    }
}
