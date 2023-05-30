package Conteudo_12;

import java.util.Scanner;

public class C12Ex17 {
    public static void main(String[] args) {
        int quantidadeNumeros = 10;
        int[] numeros = new int[quantidadeNumeros];

        // Lendo os números inteiros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Lendo o número real
        System.out.print("Digite um número real: ");
        double numeroReal = scanner.nextDouble();

        // Imprimindo os números multiplicados pelo número real
        System.out.println("Números multiplicados pelo número real:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            int resultado = (int) (numeros[i] * numeroReal);
            System.out.println(resultado);
        }
    }
}
