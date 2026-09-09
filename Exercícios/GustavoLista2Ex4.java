import java.util.Scanner;

public class GustavoLista2Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();
        int maior;
        if (num1 >= num2 && num1 >= num3) {
            maior = num1;
        } else if (num2 >= num3) {
            maior = num2;
        } else {
            maior = num3;
        }
        System.out.println("O maior número digitado é: " + maior);
        scanner.close();
    }
}
