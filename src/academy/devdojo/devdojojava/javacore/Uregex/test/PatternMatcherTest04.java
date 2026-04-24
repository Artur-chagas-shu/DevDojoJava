package academy.devdojo.devdojojava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    static void main(String[] args) {
        //\d = Todos os digitos
        //\D = Tudo o que nao for digito
        //\s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-zA-Z, digitos, _
        //\W = Tudo o que nao for incluso no \W
        //[]
        // ? Zero ou uma
        // * Zero ou mais
        // + uma ou mais
        //{n,m} de n até m
        //()
        //|
        //$
        //. 1.3 = 123, 133, 1@3 ,1A3

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto    " + texto);
        System.out.println("Indice:  0123456789 ");
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }

    }
}
