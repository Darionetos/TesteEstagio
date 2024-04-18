import java.util.Scanner;

public class Questao5InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário que insira uma string
        System.out.print("Digite uma string: ");
        String original = scanner.nextLine();
        scanner.close();

        // Chama o método para inverter a string
        String invertida = inverterString(original);

        // Imprime a string invertida
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    // Método para inverter uma string
    public static String inverterString(String original) {
        // Converte a string para um array de caracteres
        char[] caracteres = original.toCharArray();
        int tamanho = caracteres.length;

        // Percorre o array de caracteres e inverte a ordem dos caracteres
        for (int i = 0; i < tamanho / 2; i++) {
            char temp = caracteres[i];
            caracteres[i] = caracteres[tamanho - 1 - i];
            caracteres[tamanho - 1 - i] = temp;
        }

        // Converte o array de caracteres de volta para uma string
        return new String(caracteres);
    }
}
