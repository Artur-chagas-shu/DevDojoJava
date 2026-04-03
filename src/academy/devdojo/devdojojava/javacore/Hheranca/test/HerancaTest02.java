package academy.devdojo.devdojojava.javacore.Hheranca.test;

import academy.devdojo.devdojojava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    //0 - bloco de inicialização Estatico da superclasse é executado quando a JVM carregar a classe pai
    //1-  bloco de inicialização Estatico da sub classe é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaco em memoria pro objeto da classe pai
    // 3- Cada atributo de superclasse é criado e inicializado com valores default ou o que for passado
    // 4- Bloco de inicializacao da superclasse é executado na ordem em que aparece
    // 5- Construtor é executado da superclasse
    // 6 - Alocado espaco em memoria pro objeto da sbuclasse
    // 7- Cada atributo de subclasse é criado e inicializado com valores default ou o que for passado
    // 8- Bloco de inicializacao da subclasse é executado na ordem em que aparece
    // 9- Construtor é executado da subclasse

    static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Jiraya");

    }
}
