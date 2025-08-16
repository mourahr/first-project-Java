import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Jogo Sudoku");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a quantidade de linhas: ");
        int linhas = scanner.nextInt();

        System.out.print("\nInforme a quantidade de colunas: ");
        int colunas = scanner.nextInt();

        System.out.printf("Total de linhas é %d e colunas é %d\n", linhas, colunas);

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j <= colunas; j++) {
                System.out.printf("%d,%d\n", i, j);


//                int num = i * 10 + j;
//                System.out.printf("%d ",num);
            }
//            System.out.println();
        }
    }
}
