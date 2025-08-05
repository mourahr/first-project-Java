import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        bannerAplicacao();
        switch (iniciaJornadaProfessor()) {
            case 1:
                System.out.println("Matéria Português!");
                break;
            case 2:
                System.out.println("Matéria Matemátca");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente");
        }
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
