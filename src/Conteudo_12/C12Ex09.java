package Conteudo_12;

import java.util.Scanner;

public class C12Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0;

        System.out.println("Digite 10 valores numéricos inteiros:");

        // Leitura dos 10 valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        System.out.println("\nDivisores da soma dos números lidos:");

        // Verificação e impressão dos divisores
        for (int i = 0; i < 10; i++) {
            if (sum % numbers[i] == 0) {
                System.out.println(numbers[i]);
            }
        }

    }
}
