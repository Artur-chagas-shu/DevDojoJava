package academy.devdojo.devdojojava.javacore.Aintroducaoclasses.test;

import academy.devdojo.devdojojava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Chevrolet Onix";
        carro1.modelo = "Sedan";
        carro1.ano = 2024;

        Carro carro2 = new Carro();
        carro2.nome = "Gmw Haval h6";
        carro2.modelo = "SUV";
        carro2.ano = 2025;

        System.out.println("Nome: " + carro1.nome + ",Modelo: " + carro1.modelo + ",ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + ",Modelo: " + carro2.modelo + ",ano: " + carro2.ano);

    }
}
