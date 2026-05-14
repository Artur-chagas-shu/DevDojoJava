package academy.devdojo.devdojojava.javacore.Zgenerics.test;

import academy.devdojo.devdojojava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.devdojojava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    static void main() {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro por um mes...");
        carroRentavelService.retornarCarroAlugado(carro);

    }
}
