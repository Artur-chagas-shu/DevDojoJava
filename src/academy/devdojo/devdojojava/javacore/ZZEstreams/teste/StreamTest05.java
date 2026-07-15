package academy.devdojo.devdojojava.javacore.ZZEstreams.teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    static void main(String[] args) {
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));


        //Stream<String[]> collect = words.stream().map(w -> w.split("")).collect(Collectors.toList());
        Stream<String> stream1 = Arrays.stream(letters);
        List<String> letters2 = words.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());

        System.out.println(letters2);

    }
}
