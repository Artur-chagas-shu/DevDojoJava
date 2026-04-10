package academy.devdojo.devdojojava.javacore.Qstring.test;

public class StringTest01 {
    static void main(String[] args) {
        String nome = "Sushi";//String constant pool
        String nome2 = "Sushi";
        nome = nome.concat(" Shiro");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Sushi");// 1 variavel de referencia, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
