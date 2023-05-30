package Conteudo_12;

import java.util.Scanner;

public class C12Ex15 {
    public static void main(String[] args) {
        int quantidadeNumeros = 10;
        int somaPares = 0;
        int contadorPares = 0;

        // Lendo os números inteiros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                somaPares += numero;
                contadorPares++;
            }
        }

        // Imprimindo os números pares
        System.out.println("Números pares informados:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            if (scanner.nextInt() % 2 == 0) {
                System.out.println(i);
            }
        }

        // Calculando a média dos números pares
        double mediaPares = (double) somaPares / contadorPares;

        // Imprimindo a média dos números pares
        System.out.println("Média dos números pares: " + mediaPares);
    }
}