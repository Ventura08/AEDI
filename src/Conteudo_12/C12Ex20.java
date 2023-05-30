package Conteudo_12;

import java.util.Scanner;

public class C12Ex20 {
    public static void main(String[] args) {
        int quantidadeNumeros = 10;
        int[] numeros = new int[quantidadeNumeros];

        // Lendo os números inteiros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Último número informado pelo usuário
        int ultimoNumero = numeros[quantidadeNumeros - 1];

        // Imprimindo os números maiores que o último número informado
        System.out.println("Números maiores que " + ultimoNumero + ":");
        int somaMaiores = 0;
        int contadorMaiores = 0;
        for (int i = 0; i < quantidadeNumeros; i++) {
            if (numeros[i] > ultimoNumero) {
                System.out.println(numeros[i]);
                somaMaiores += numeros[i];
                contadorMaiores++;
            }
        }

        // Calculando a média dos números maiores que o último número informado
        double mediaMaiores = (double) somaMaiores / contadorMaiores;

        // Imprimindo a média dos números maiores
        System.out.println("Média dos números maiores: " + mediaMaiores);
    }
}
