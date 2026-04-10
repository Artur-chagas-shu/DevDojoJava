package academy.devdojo.devdojojava.javacore.Oexception.exception.test;

import academy.devdojo.devdojojava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuario");
        String usernameDigitador = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDB.equals(usernameDigitador) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuario ou senha invalidos");
        }
        System.out.println("Usuario logado com sucesso");

    }
}
