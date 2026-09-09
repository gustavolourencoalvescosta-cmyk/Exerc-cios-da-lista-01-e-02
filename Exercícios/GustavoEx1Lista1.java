import java.util.Scanner;

public class GustavoEx1Lista1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número real (use vírgula ou ponto dependendo do seu sistema): ");
        double numero = scanner.nextDouble();
        double dobro = numero * 2;
        System.out.println("O dobro de " + numero + " é: " + dobro);
        scanner.close();
    }
}