import java.util.Scanner;

public class GustavoLista2Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();
        double precoUnitario = 0;
        boolean codigoValido = true;
        if (codigo >= 1 && codigo <= 10) {
            precoUnitario = 10.00;
        } else if (codigo >= 11 && codigo <= 20) {
            precoUnitario = 15.00;
        } else if (codigo >= 21 && codigo <= 30) {
            precoUnitario = 20.00;
        } else if (codigo >= 31 && codigo <= 40) {
            precoUnitario = 30.00;
        } else {
            codigoValido = false;
            System.out.println("Código de produto inválido!");
        }
        if (codigoValido && quantidade > 0) {
            double precoTotal = precoUnitario * quantidade;
            double percentualDesconto = 0;
            if (precoTotal <= 250.00) {
                percentualDesconto = 5.0;
            } else if (precoTotal <= 500.00) {
                percentualDesconto = 10.0;
            } else {
                percentualDesconto = 15.0;
            }
            double valorDesconto = precoTotal * (percentualDesconto / 100.0);
            double precoFinal = precoTotal - valorDesconto;
            System.out.println("\n--- NOTA FISCAL ---");
            System.out.printf("Preço unitário: R$ %.2f\n", precoUnitario);
            System.out.printf("Preço total da nota: R$ %.2f\n", precoTotal);
            System.out.printf("Desconto aplicado (%.0f%%): R$ %.2f\n", percentualDesconto, valorDesconto);
            System.out.printf("Preço final da nota: R$ %.2f\n", precoFinal);
        } else if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que zero!");
        }
        scanner.close();
    }
}
