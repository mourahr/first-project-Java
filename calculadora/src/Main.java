public class Main {

    public static void main(String[] args) {
        int a = 20;
        int b = -40;
        int resultado = somar(a, b);
        System.out.print("Resultado soma: " + resultado);

        int c = 8;
        int d = 2;
        System.out.println("\nResultado subtracao: " + subtrair(c, d));

        int e = 10;
        int f = 13;
        System.out.printf("Resultado multiplicacao: %d", multiplicar(e, f));

        int g = 5;
        int h = 2;
        System.out.printf("Resultado divisao: %.1f", divisao(g, h));
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static float divisao(int a, int b) {
        return (float) a / b;
    }
}
