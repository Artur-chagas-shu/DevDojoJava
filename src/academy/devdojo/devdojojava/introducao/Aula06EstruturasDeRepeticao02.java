package academy.devdojo.devdojojava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    static void main(String[] args) {
        // imprima todos os números pares de 0 ate 1000000

        for(int i = 0; i <= 1000000; i ++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
