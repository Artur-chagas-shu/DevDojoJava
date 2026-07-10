package academy.devdojo.devdojojava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.devdojojava.javacore.ZZBcomportamento.dominio.Car;


@FunctionalInterface
public interface CarPredicate {

    //anonimas, funções , conciso
    boolean test (Car car);
    //(parametro) -> <expressão>
    //(Car car) -> car.getColor().equals("green")


}
