import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando array lido pelo usuário
        int[] arrayUsuario = criarArrayUsuario(scanner);

        // Criando array aleatório
        int tamanhoArrayAleatorio = 5; // Tamanho do array aleatório (altere conforme necessário)
        int[] arrayAleatorio = criarArrayAleatorio(tamanhoArrayAleatorio);

        // Calculando a soma de elementos nos arrays
        int somaUsuario = calcularSomaArray(arrayUsuario);
        int somaAleatorio = calcularSomaArray(arrayAleatorio);

        // Encontrando o maior e o menor valor nos arrays
        int maiorUsuario = encontrarMaiorValor(arrayUsuario);
        int menorUsuario = encontrarMenorValor(arrayUsuario);

        int maiorAleatorio = encontrarMaiorValor(arrayAleatorio);
        int menorAleatorio = encontrarMenorValor(arrayAleatorio);

        // Exibindo resultados
        System.out.println("Array lido do usuário: ");
        exibirArray(arrayUsuario);

        System.out.println("Array aleatório: ");
        exibirArray(arrayAleatorio);

        System.out.println("Soma do array lido do usuário: " + somaUsuario);
        System.out.println("Soma do array aleatório: " + somaAleatorio);

        System.out.println("Maior valor no array lido do usuário: " + maiorUsuario);
        System.out.println("Menor valor no array lido do usuário: " + menorUsuario);

        System.out.println("Maior valor no array aleatório: " + maiorAleatorio);
        System.out.println("Menor valor no array aleatório: " + menorAleatorio);

        scanner.close();
    }

    // Método para criar um array de números inteiros lidos do usuário
    public static int[] criarArrayUsuario(Scanner scanner) {
        System.out.print("Digite o tamanho do array desejado: ");
        int tamanho = scanner.nextInt();
        int[] array = new int[tamanho];

        System.out.println("Digite os elementos do array: ");
        for (int i = 0; i < tamanho; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    // Método para criar um array de números inteiros aleatórios
    public static int[] criarArrayAleatorio(int tamanho) {
        int[] array = new int[tamanho];
        Random random = new Random();

        for (int i = 0; i < tamanho; i++) {
            array[i] = random.nextInt(100); // Gera números aleatórios entre 0 e 99 (altere conforme necessário)
        }

        return array;
    }

    // Método para calcular a soma de todos os elementos no array
    public static int calcularSomaArray(int[] array) {
        int soma = 0;

        for (int elemento : array) {
            soma += elemento;
        }

        return soma;
    }

    // Método para encontrar o maior valor no array
    public static int encontrarMaiorValor(int[] array) {
        int maior = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }

        return maior;
    }

    // Método para encontrar o menor valor no array
    public static int encontrarMenorValor(int[] array) {
        int menor = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }

        return menor;
    }

    // Método para exibir o conteúdo do array
    public static void exibirArray(int[] array) {
        for (int elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
