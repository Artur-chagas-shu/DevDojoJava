package academy.devdojo.devdojojava.introducao;

public class Aula05EstruturasCondicionais04 {
    static void main(String[] args) {
        double salYear = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double bracketValue ;



        if(salYear <= 34712 ){
            bracketValue =  salYear * primeiraFaixa;
        } else if (salYear > 34712 && salYear <= 68507 ) {
            bracketValue =  salYear *  segundaFaixa ;
        }else {
            bracketValue =  salYear * terceiraFaixa;
        }


        System.out.println( bracketValue);
    }
}
