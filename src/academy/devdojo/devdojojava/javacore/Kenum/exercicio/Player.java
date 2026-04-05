package academy.devdojo.devdojojava.javacore.Kenum.exercicio;

public class Player {
    private String nome;
    private Escolha escolha;

    public Player(String nome, Escolha escolha) {
        this.nome = nome;
        this.escolha = escolha;
    }

    public static void vencedor(Player player1, Player player2) {
        if (player1.escolha.equals(player2.escolha)) {
            System.out.println("Empate");
        } else if (player1.escolha.equals(Escolha.PEDRA) && player2.escolha.equals(Escolha.TESOURA) ||
                player1.escolha.equals(Escolha.TESOURA) && player2.escolha.equals(Escolha.PAPEL) ||
                player1.escolha.equals(Escolha.PAPEL) && player2.escolha.equals(Escolha.PEDRA)
        ) {
            System.out.println("O vencedor é: " + player1);
        }else{
            System.out.println("O vencedor é: " + player2);
        }
    }

        @Override
        public String toString () {
            return "Player{" +
                    "nome='" + nome + '\'' +
                    ", escolha=" + escolha +
                    '}';
        }
    }
