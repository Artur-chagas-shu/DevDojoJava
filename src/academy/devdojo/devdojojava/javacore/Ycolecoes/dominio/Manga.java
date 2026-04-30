package academy.devdojo.devdojojava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Manga {
    private Long id ;
    private String nome;
    private double preco;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id,"Id não pode ser null");
        Objects.requireNonNull(nome,"Nome não pode ser null");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(preco, manga.preco) == 0 && Objects.equals(id, manga.id) && Objects.equals(nome, manga.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, preco);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
