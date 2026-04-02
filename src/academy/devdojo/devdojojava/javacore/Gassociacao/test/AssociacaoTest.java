package academy.devdojo.devdojojava.javacore.Gassociacao.test;

import academy.devdojo.devdojojava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.devdojojava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.devdojojava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.devdojojava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local1 = new Local("Konoha");
        Professor professor = new Professor("Jiraya Sensei", "Jutsu sexy");
        Aluno aluno1 = new Aluno("Naruto Uzumaki", 16);
        Seminario seminario1 = new Seminario("Seminario de jutsu sexy");
        seminario1.setLocal(local1);
        professor.setSeminarios(new Seminario[]{seminario1});
        aluno1.setSeminario(seminario1);

        professor.imprime();




    }
}
