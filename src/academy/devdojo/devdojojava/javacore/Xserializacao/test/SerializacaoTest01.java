package academy.devdojo.devdojojava.javacore.Xserializacao.test;

import academy.devdojo.devdojojava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.devdojojava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    static void main(String[] args) {
        Aluno aluno = new Aluno(2L, "Sushi", "123456");
        Turma turma = new Turma("Maratona java virado no jiraya em breve ricos");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }
    private static void serializar(Aluno aluno){
        Path path = Paths.get("folder/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deserializar(){
        Path path = Paths.get("folder/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
         Aluno aluno = (Aluno)  ois.readObject();
            System.out.println(aluno);
        }catch (IOException| ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
