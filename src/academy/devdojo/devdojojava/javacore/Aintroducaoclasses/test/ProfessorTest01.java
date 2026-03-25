package academy.devdojo.devdojojava.javacore.Aintroducaoclasses.test;

import academy.devdojo.devdojojava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kame";
        professor.idade = 140;
        professor.sexo = 'M';
        System.out.println("nome: " + professor.nome + " idade: " + professor.idade + "sexo: " + professor.sexo);
    }
}
