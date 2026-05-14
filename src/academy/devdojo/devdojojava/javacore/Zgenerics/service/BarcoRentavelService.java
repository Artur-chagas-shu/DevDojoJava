package academy.devdojo.devdojojava.javacore.Zgenerics.service;

import academy.devdojo.devdojojava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.devdojojava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> BarcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"),
            new Barco("Canoa")));


    public Barco buscarBarcoDisponivel(){
             System.out.println("Buscando barco disponivel...");
        Barco barco = BarcosDisponiveis.remove(0);
        System.out.println("Alugando barco: " + barco);
        System.out.println("Barcos disponiveis para alugar: ");
        System.out.println(BarcosDisponiveis);    return barco;
    }


    public void retornarBarcoAlugado(Barco barco){
        System.out.println("Devolvendo barco " + barco);
        BarcosDisponiveis.add(barco);
        System.out.println("Barcos disponiveis para alugar: ");
             System.out.println(BarcosDisponiveis);}
}
