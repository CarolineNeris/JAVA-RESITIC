import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1, num2, resultado;
        char operacao;

        // Pedir ao usuário que insira dois números
        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextFloat();

        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextFloat();

        // Pedir ao usuário que escolha uma operação
        System.out.print("Escolha a operacao (+, -, *, /): ");
        operacao = scanner.next().charAt(0);

        // Realizar cálculo de acordo com a operação escolhida
        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro! Divisao por zero nao e permitida.");
                    return;
                }
                break;
            default:
                System.out.println("Operacao invalida!");
                return;
        }

        // Exibir o resultado
        System.out.println("O resultado da operacao eh: " + resultado);
    }
}
