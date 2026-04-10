package academy.devdojo.devdojojava.javacore.Oexception.exception.test;

import academy.devdojo.devdojojava.javacore.Oexception.exception.dominio.Funcionario;
import academy.devdojo.devdojojava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.devdojo.devdojojava.javacore.Oexception.exception.dominio.Pessoa;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();


        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
