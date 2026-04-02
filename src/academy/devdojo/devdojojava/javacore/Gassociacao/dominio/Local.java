package academy.devdojo.devdojojava.javacore.Gassociacao.dominio;

public class Local {
    private String endereco;


    public Local(String edenreco) {
        this.endereco = edenreco;
    }

    public void imprime(){
        System.out.println(this.endereco);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
