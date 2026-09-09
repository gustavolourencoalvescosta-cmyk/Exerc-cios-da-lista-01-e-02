import java.util.Scanner;

public class GustavoLista2Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius (°C): ");
        double celsius = scanner.nextDouble();
        System.out.println("\nEscolha a unidade de conversão:");
        System.out.println("1 - Fahrenheit");
        System.out.println("2 - Kelvin");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            double fahrenheit = (celsius * 1.8) + 32;
            System.out.printf("\n%.2f °C equivale a %.2f °F\n", celsius, fahrenheit);
        } else if (opcao == 2) {
            double kelvin = celsius + 273.15;
            System.out.printf("\n%.2f °C equivale a %.2f K\n", celsius, kelvin);
        } else {
            System.out.println("\nOpção inválida!");
        }
        scanner.close();
    }
}
