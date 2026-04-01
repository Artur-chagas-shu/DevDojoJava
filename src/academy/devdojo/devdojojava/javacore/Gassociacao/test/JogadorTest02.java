package academy.devdojo.devdojojava.javacore.Gassociacao.test;

import academy.devdojo.devdojojava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.devdojojava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");

        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);

        jogador1.imprime();
    }
}
