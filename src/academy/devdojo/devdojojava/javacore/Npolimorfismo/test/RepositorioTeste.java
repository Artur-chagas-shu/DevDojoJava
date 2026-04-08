package academy.devdojo.devdojojava.javacore.Npolimorfismo.test;

import academy.devdojo.devdojojava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academy.devdojo.devdojojava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste {
    static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
