package academy.devdojo.devdojojava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    static void main(String[] args) {
        abreConexao2();
    }

    private static String abreConexao() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo Dados no arquivo");
            return "Conexão aberta";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }
    private static void abreConexao2() {
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo Dados no arquivo");

        } finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
