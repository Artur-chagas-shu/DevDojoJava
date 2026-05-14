package academy.devdojo.devdojojava.javacore.Zgenerics.test;

import academy.devdojo.devdojojava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.devdojojava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.devdojojava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.devdojojava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    static void main() {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco por um mes...");
        barcoRentavelService.retornarBarcoAlugado(barco);;

    }
}
