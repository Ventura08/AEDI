package Conteudo_12;

import java.util.Scanner;

public class C12Ex22 {
    public static void main(String[] args) {
        int quantidadeNumeros = 20;
        int[] numeros = new int[quantidadeNumeros];

        // Lendo os n�meros inteiros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 20 n�meros inteiros:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = scanner.nextInt();
        }

        System.out.println("N�meros na sequ�ncia �mpar:");
        for (int i = 0; i < quantidadeNumeros; i += 2) {
            System.out.println(numeros[i]);
        }

        System.out.println("N�meros na sequ�ncia par:");
        for (int i = 1; i < quantidadeNumeros; i += 2) {
            System.out.println(numeros[i]);
        }
    }
}
