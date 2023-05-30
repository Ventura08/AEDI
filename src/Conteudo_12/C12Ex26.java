package Conteudo_12;

import java.util.Scanner;

public class C12Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma frase curta: ");
        String frase = scanner.nextLine();

        // Separando as palavras da frase
        String[] palavras = frase.split(" ");

        // Imprimindo cada palavra em uma linha
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }
}
