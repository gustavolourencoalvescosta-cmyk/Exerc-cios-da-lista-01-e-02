import java.util.Scanner;
public class GustavoLista2Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        if (idade < 0) {
            System.out.println("Idade inválida!");
        } else if (idade <= 12) {
            System.out.println("Categoria: Infantil (até 12 anos)");
        } else if (idade <= 17) {
            System.out.println("Categoria: Juvenil (13 a 17 anos)");
        } else {
            System.out.println("Categoria: Adulto (18 anos ou mais)");
        }

        scanner.close();
    }
}