package academy.devdojo.devdojojava.javacore.Jmodificadorfinal.test;

import academy.devdojo.devdojojava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.devdojojava.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTest01 {
    static void main() {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
