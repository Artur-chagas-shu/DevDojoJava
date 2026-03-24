package academy.devdojo.devdojojava.introducao;

public class Teste {
    static void main(String[] args) {
        int[][] numeros = new int[2][3];
        numeros[0][0] = 4;
        numeros[0][1] = 3;
        numeros[0][2] = 5;

        numeros[1][0] = 4;
        numeros[1][1] = 3;
        numeros[1][2] = 5;

        int[][] numeros2 = new int[2][3];
        numeros2[0][0] = 4;
        numeros2[0][1] = 3;
        numeros2[0][2] = 5;

        numeros2[1][0] = 4;
        numeros2[1][1] = 3;
        numeros2[1][2] = 5;

        int[][] soma = new int[2][3];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                soma[i][j] = (numeros[i][j] + numeros2[i][j]);
            }

        }

        for(int []arrBase : soma ){
            for(int num : arrBase ){
                System.out.println(num);
            }
        }

    }
}
