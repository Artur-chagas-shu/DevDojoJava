package academy.devdojo.devdojojava.javacore.Kenum.test;

import academy.devdojo.devdojojava.javacore.Kenum.exercicio.Escolha;
import academy.devdojo.devdojojava.javacore.Kenum.exercicio.Player;

public class ExercicioTest01 {
    static void main() {

        Player player1 = new Player("Sushi", Escolha.PAPEL);
        Player player2 = new Player("Sukita", Escolha.TESOURA);

        Player.vencedor(player1,player2);
    }
}
