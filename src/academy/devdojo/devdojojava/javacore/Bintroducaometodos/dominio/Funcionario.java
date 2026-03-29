package academy.devdojo.devdojojava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
           return ;
        }
        for (double sal : this.salarios) {
            System.out.print(sal + " ");
        }
        mediaSalarios();
    }

    public void mediaSalarios() {
        if (this.salarios == null) {
            return ;
        }
        double media = 0 ;
        for (double sal : salarios){
            media += sal ;
        }
        media /= salarios.length;
        System.out.println("A media salarial é: " + media);
    }
}
