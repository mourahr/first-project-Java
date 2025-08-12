import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bannerAplicacao();
        String materia = escolheMateria();
        System.out.printf("Materia escolhida: %s\n", materia);
        coletaProvasNotas(materia);
    }

    private static void coletaProvasNotas(String materia) {
        int avaliacoes = carregaQtdadeAvaliacoes();
        var lista = carregaNotas(avaliacoes);
        System.out.println(Arrays.toString(lista));
    }

    private static float[] carregaNotas(int avaliacoes) {
        Scanner scanner = new Scanner(System.in);
        float[] notas = new float[avaliacoes];
        for (int cont = 0; cont < avaliacoes; cont++) {
            System.out.printf("\nInforme a nota %d: ", cont+1);
            float nota = scanner.nextFloat();
            notas[cont] = nota;
        }
        return notas;
    }

    private static int carregaQtdadeAvaliacoes() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de avaliacoes: ");
        return scanner.nextInt();
}

    private static String escolheMateria() {
        switch (iniciaJornadaProfessor()) {
            case 1:
                return "Portugues";
            case 2:
                return "Matematica";
            default:
                System.out.println("Opção inválida. Tente novamente");
                escolheMateria();
        }
        return "null";
    }

    private static int iniciaJornadaProfessor() {
        System.out.println("Informe o código da matéria a ser lançada as notas:");
        System.out.print("1) Português\n2) Matemática\nCódigo da Matéria: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void bannerAplicacao() {
        System.out.println("############################");
        System.out.println("Bem vindo ao sistema escolar");
        System.out.println("############################\n");
    }
}
