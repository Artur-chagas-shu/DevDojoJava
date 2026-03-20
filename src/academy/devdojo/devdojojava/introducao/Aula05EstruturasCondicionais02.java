package academy.devdojo.devdojojava.introducao;

public class Aula05EstruturasCondicionais02 {
    static void main(String[] args) {
        // idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >=18 categoria adulto
        int idade = 45;
        String categoria ;

        if(idade < 15 ){
            categoria = "Categoria Infantil";
        } else if (idade >=15 && idade <18) {
            categoria = "Categoria Juvenil";
        }else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
