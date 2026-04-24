package academy.devdojo.devdojojava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    static void main(String[] args) {
        //\d = Todos os digitos
        //\D = Tudo o que nao for digito
        //\s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // \w = a-zA-Z, digitos, _
        //\W = Tudo o que nao for incluso no \W
        String regex = "\\W";
        //String texto = "abababa";
        String texto2 = "@#hh_j2 12gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto    " + texto2 );
        System.out.println("Indice:  0123456789 " );
        System.out.println("regex " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()){
            System.out.print(matcher.start() + " "+ matcher.group()+ "\n");
        }

    }
}
