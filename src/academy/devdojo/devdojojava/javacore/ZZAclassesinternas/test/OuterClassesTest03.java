package academy.devdojo.devdojojava.javacore.ZZAclassesinternas.test;

import javax.xml.namespace.QName;

public class OuterClassesTest03 {
    private String name = "Sukita";
    static class Nested {
        private String lastName = "Suka";
        void print (){
            System.out.println(new OuterClassesTest03().name + " " + lastName );
        }
    }
    static void main(String[] args) {
        new Nested().print();
    }
}
