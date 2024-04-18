import java.util.Scanner;

public class Questao2Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (pertenceSequencia(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    // Método para verificar se um número pertence à sequência de Fibonacci
    public static boolean pertenceSequencia(int numero) {
        int anterior = 0;
        int atual = 1;

        // Verifica se o número informado é igual a 0 ou 1
        if (numero == 0 || numero == 1) {
            return true;
        }

        // Calcula os números da sequência de Fibonacci até ultrapassar o número informado
        while (atual <= numero) {
            int proximo = anterior + atual;
            if (proximo == numero) {
                return true;
            }
            anterior = atual;
            atual = proximo;
        }

        // Se o número informado não for encontrado na sequência até o número informado ser ultrapassado, retorna falso
        return false;
    }
}
