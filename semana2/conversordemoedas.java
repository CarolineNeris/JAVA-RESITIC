import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a taxa de câmbio: ");
        double taxaCambio = scanner.nextDouble();

        System.out.println("Digite a quantidade em dólares: ");
        double quantidadeDolares = scanner.nextDouble();

        double valorConvertido = quantidadeDolares * taxaCambio;

        System.out.println("O valor convertido é: " + valorConvertido);
    }
}
