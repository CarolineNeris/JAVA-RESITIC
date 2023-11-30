import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float temperatura, resultado;
        char unidade;

        // Pedir ao usuário que insira a temperatura e a unidade de origem
        System.out.print("Digite a temperatura: ");
        temperatura = scanner.nextFloat();

        System.out.print("Digite a unidade de origem (C para Celsius ou F para Fahrenheit): ");
        unidade = scanner.next().charAt(0);

        // Realizar a conversão de acordo com a unidade de origem
        if (unidade == 'C' || unidade == 'c') {
            resultado = (temperatura * 9 / 5) + 32;
            System.out.println("A temperatura em Fahrenheit eh: " + resultado + " F");
        } else if (unidade == 'F' || unidade == 'f') {
            resultado = (temperatura - 32) * 5 / 9;
            System.out.println("A temperatura em Celsius eh: " + resultado + " C");
        } else {
            System.out.println("Unidade de origem invalida!");
        }
    }
}
