package academy.devdojo.devdojojava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de prvisão do futuro");
        System.out.println("Digite sua pergunte e eu responderei sim ou não");
        String pergunta = input.nextLine();
        if (pergunta.charAt(0) == ' ') {
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }
    }
}
