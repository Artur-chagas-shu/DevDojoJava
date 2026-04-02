package academy.devdojo.devdojojava.javacore.Hheranca.dominio;

public class Endereco {
    private String Rua;
    private String cep;

    public void imprime(){
        Pessoa p  = new Pessoa();
        p.nome = "sasa";
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
