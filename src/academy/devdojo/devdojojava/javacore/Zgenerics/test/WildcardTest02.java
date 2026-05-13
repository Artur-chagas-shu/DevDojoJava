package academy.devdojo.devdojojava.javacore.Zgenerics.test;


import java.util.List;

public class WildcardTest02 {
    static void main() {
        List<Cachorro> cachorros = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatos = List.of(new Gato(), new Gato());


    }
        //Type erasure
    private static void printConsulta(List<Animal> animals){
        for (Animal animal : animals) {
           animal.consulta();
        }

        animals.add(new Cachorro());


    }
}
