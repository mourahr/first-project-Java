import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        boolean adulto = verificaAdulto(idade);
        if (adulto) {
            System.out.printf("Cliente %s tem %d e esta autorizado para festa", nome, idade);
        } else {
            System.out.printf("Cliente %s tem %d e nao esta autorizado para festa", nome, idade);
        }
    }

    private static boolean verificaAdulto(int idade) {
        return idade >= 18;
    }

}
