package academy.devdojo.devdojojava.javacore.ZZEstreams.teste;

import academy.devdojo.devdojojava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.devdojojava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.devdojojava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamTest16 {


    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamIterate(num);
        sumParallelLongStreamIterate(num);


    }

    private static void  sumFor(long num){
        System.out.println("Sum for");
        long result = 0;

        long init = System.currentTimeMillis();
        for(long i = 1; i <= num; i++){
            result += i;
        }

        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms" );
    }

    private static void  sumStreamIterate(long num){
        System.out.println("sum StreamIterate");
        long init = System.currentTimeMillis();

        Long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);


        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms" );
    }

    private static void  sumParallelStreamIterate(long num){
        System.out.println("sum ParallelStreamIterate");
        long init = System.currentTimeMillis();

        Long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);


        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms" );
    }

    private static void  sumLongStreamIterate(long num){
        System.out.println("sum longStreamIterate");
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms" );
    }

    private static void  sumParallelLongStreamIterate(long num){
        System.out.println("sum ParallelLongStreamIterate");
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + "ms" );
    }

}

