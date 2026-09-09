 import java.util.Scanner;

public class GustavoLista2Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            double quadrado = Math.pow(numero, 2);
            System.out.println("O número " + numero + " é PAR.");
            System.out.printf("O quadrado de %d é: %.0f\n", numero, quadrado);
        } else {
            double cubo = Math.pow(numero, 3);
            System.out.println("O número " + numero + " é ÍMPAR.");
            System.out.printf("O cubo de %d é: %.0f\n", numero, cubo);
        }
        scanner.close();
    }
}

