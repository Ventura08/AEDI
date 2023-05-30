package Conteudo_12;

import java.util.Scanner;

public class C12Ex22 {
    public static void main(String[] args) {
        int quantidadeNumeros = 20;
        int[] numeros = new int[quantidadeNumeros];

        // Lendo os números inteiros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 20 números inteiros:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Números na sequência ímpar:");
        for (int i = 0; i < quantidadeNumeros; i += 2) {
            System.out.println(numeros[i]);
        }

        System.out.println("Números na sequência par:");
        for (int i = 1; i < quantidadeNumeros; i += 2) {
            System.out.println(numeros[i]);
        }
    }
}
