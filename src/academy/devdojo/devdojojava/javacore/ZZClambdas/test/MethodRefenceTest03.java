package academy.devdojo.devdojojava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

//Reference to an instance method of an arbitrary object of a particular type
public class MethodRefenceTest03 {
    static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        list.sort(String::compareTo);
        System.out.println(list);
        Function<String, Integer>numStringToInteger = Integer::parseInt;
        Integer apply = numStringToInteger.apply("10");
        System.out.println(apply);


        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Rimuru"));

    }
}
