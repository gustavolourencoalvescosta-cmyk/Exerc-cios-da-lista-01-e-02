
    import java.util.Scanner;

public class  GustavoLista2Ex2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o consumo de energia em kWh: ");
        double kwh = scanner.nextDouble();
        double valorTotal;
        if (kwh < 0) {
            System.out.println("Quantidade de kWh inválida!");
            scanner.close();
            return;
        } else if (kwh <= 100) {
            valorTotal = kwh * 0.50;
        } else if (kwh <= 200) {
            valorTotal = kwh * 0.70;
        } else {
            valorTotal = kwh * 0.90;
        }
        System.out.printf("Valor total da conta: R$ %.2f\n", valorTotal);
        scanner.close();
    }
}

