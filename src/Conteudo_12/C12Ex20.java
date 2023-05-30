package Conteudo_12;

import java.util.Scanner;

public class C12Ex20 {
    public static void main(String[] args) {
        int quantidadeNumeros = 10;
        int[] numeros = new int[quantidadeNumeros];

        // Lendo os n�meros inteiros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 n�meros inteiros:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = scanner.nextInt();
        }

        // �ltimo n�mero informado pelo usu�rio
        int ultimoNumero = numeros[quantidadeNumeros - 1];

        // Imprimindo os n�meros maiores que o �ltimo n�mero informado
        System.out.println("N�meros maiores que " + ultimoNumero + ":");
        int somaMaiores = 0;
        int contadorMaiores = 0;
        for (int i = 0; i < quantidadeNumeros; i++) {
            if (numeros[i] > ultimoNumero) {
                System.out.println(numeros[i]);
                somaMaiores += numeros[i];
                contadorMaiores++;
            }
        }

        // Calculando a m�dia dos n�meros maiores que o �ltimo n�mero informado
        double mediaMaiores = (double) somaMaiores / contadorMaiores;

        // Imprimindo a m�dia dos n�meros maiores
        System.out.println("M�dia dos n�meros maiores: " + mediaMaiores);
    }
}
