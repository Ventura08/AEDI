package Conteudo_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Digite 20 números inteiros:");

        // Leitura dos 20 números
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int number = scanner.nextInt();
            numbers.add(number);
        }

        System.out.println("\nSoma intercalada:");

        // Cálculo e impressão da soma intercalada
        for (int i = 0; i < 10; i++) {
            int sum = numbers.get(i) + numbers.get(19 - i);
            System.out.println("Soma " + (i + 1) + ": " + sum);
        }
    }
}
