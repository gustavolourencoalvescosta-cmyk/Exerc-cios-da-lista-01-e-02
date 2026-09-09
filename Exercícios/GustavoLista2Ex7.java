import java.util.Scanner;

public class GustavoLista2Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a renda mensal (R$): ");
        double renda = scanner.nextDouble();
        System.out.print("Digite o valor da prestação mensal desejada (R$): ");
        double prestacao = scanner.nextDouble();
        double limitePrestacao = renda * 0.30;
        if (prestacao > limitePrestacao) {
            System.out.println("\nFinanciamento negado por baixa renda (prestação excede 30% da renda).");
        } else if (prestacao > 3000.00 && renda < 10000.00) {
            System.out.println("\nFinanciamento negado por alta prestação (prestações acima de R$ 3.000 exigem renda de no mínimo R$ 10.000).");
        } else {
            System.out.println("\nFinanciamento aprovado!");
        }
        scanner.close();
    }
}
