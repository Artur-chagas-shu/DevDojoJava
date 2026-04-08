package academy.devdojo.devdojojava.javacore.Npolimorfismo.servico;

import academy.devdojo.devdojojava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em Memoria");
    }
}
