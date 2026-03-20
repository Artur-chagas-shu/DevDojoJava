package academy.devdojo.devdojojava.introducao;

public class Aula05EstruturasCondicionais01 {
    static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        //!

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebiba alcólica");
        }else{
            System.out.println("Não Autorizado a comprar bebiba alcólica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não Autorizado a comprar bebiba alcólica");
        }

        System.out.println("Fora do if");
    }
}
