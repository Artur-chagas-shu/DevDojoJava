package academy.devdojo.devdojojava.javacore.Ycolecoes.test;

import academy.devdojo.devdojojava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.devdojojava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("DevDojo Academy");

        Manga manga4 = new Manga(3L, "Attack on titan", 11.20);
        Manga manga2 =  new Manga(1L,"Berserk", 9.5);
        Manga manga1 =  new Manga(5L,"Hellsing Ultimate",19.9);
        Manga manga3 =  new Manga(4L,"Pokemon",3.2);
        Manga manga5 =  new Manga(2L,"Dragon ball z",2.99);

        Map<Consumidor,Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,manga1);
        consumidorManga.put(consumidor2,manga4);

        for(Map.Entry<Consumidor,Manga> entry : consumidorManga.entrySet()){
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
