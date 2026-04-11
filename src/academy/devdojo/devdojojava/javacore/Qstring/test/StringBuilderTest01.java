package academy.devdojo.devdojojava.javacore.Qstring.test;

public class StringBuilderTest01 {
    static void main(String[] args) {
        String nome = "Sushi Shiro";
        nome.concat(" Sukita");
        nome = nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Sushi Shiro");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb.toString());
    }
}
