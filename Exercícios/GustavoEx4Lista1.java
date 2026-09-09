import java.util.Scanner;

public class GustavoEx4Lista1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto (R$): ");
        double valorOriginal = scanner.nextDouble();

        double desconto = valorOriginal * 0.10;
        double precoFinal = valorOriginal - desconto;

        System.out.printf("O preço com 10%% de desconto é: R$ %.2f\n", precoFinal);

        scanner.close();
    }
}