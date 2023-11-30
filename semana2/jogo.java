import java.util.Scanner;
import java.util.Random;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int tentativa;
        
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");

        do {
            System.out.println("Digite seu palpite: ");
            tentativa = scanner.nextInt();

            if (tentativa > numeroAleatorio) {
                System.out.println("Muito alto! Tente um número menor.");
            } else if (tentativa < numeroAleatorio) {
                System.out.println("Muito baixo! Tente um número maior.");
            } else {
                System.out.println("Parabéns! Você acertou o número.");
            }
        } while (tentativa != numeroAleatorio);
        
        scanner.close();
    }
}
