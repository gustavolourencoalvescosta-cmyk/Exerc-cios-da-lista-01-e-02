import java.util.Scanner;

public class GustavoEx5Lista1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso em kg (ex: 70.5): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC calculado é: %.2f\n", imc);

        scanner.close();
    }
}