package academy.devdojo.devdojojava.javacore.ZZDoptional.test;

import academy.devdojo.devdojojava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.devdojojava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    static void main(String[] args) {
        Optional<Manga> byTitle = MangaRepository.findByTitle("Boku no hero");
        byTitle.ifPresent(m -> m.setTitle("Boku no hero 2"));
        System.out.println(byTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);


        Manga newManga = MangaRepository.findByTitle("Drifters")
                .orElseGet(() -> new Manga(3, "Drifters", 20));

        System.out.println(newManga);


    }
}
