package academy.devdojo.devdojojava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    static void main(String[] args) {
        divisao(1, 0);

        System.out.println("Còdigo finalizado");

    }

    /**
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }
        return a / b;
    }
}
