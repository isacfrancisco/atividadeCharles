
import java.util.Scanner;

public class att1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        
        // Verificar se o input é realmente um número inteiro
        if (scanner.hasNextInt()) {
            int numero = scanner.nextInt();

            // Verificar se o número é positivo, negativo ou zero
            if (numero > 0) {
                System.out.println("O número é positivo.");
            } else if (numero < 0) {
                System.out.println("O número é negativo.");
            } else {
                System.out.println("O número é zero.");
            }
        } else {
            System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
        }

        scanner.close();
    }
}