import java.util.Scanner;

public class GustavoEx6Lista1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário (R$): ");
        double salarioAtual = scanner.nextDouble();

        System.out.print("Digite a porcentagem de aumento (ex: 10 para 10%): ");
        double porcentagemAumento = scanner.nextDouble();

        double valorAumento = salarioAtual * (porcentagemAumento / 100);
        double novoSalario = salarioAtual + valorAumento;

        System.out.printf("Valor do aumento: R$ %.2f\n", valorAumento);
        System.out.printf("Novo salário final: R$ %.2f\n", novoSalario);

        scanner.close();
    }
}