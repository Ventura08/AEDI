package Conteudo_12;

import java.util.Scanner;

public class C12Ex15 {
    public static void main(String[] args) {
        int quantidadeNumeros = 10;
        int somaPares = 0;
        int contadorPares = 0;

        // Lendo os n�meros inteiros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 n�meros inteiros:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                somaPares += numero;
                contadorPares++;
            }
        }

        // Imprimindo os n�meros pares
        System.out.println("N�meros pares informados:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            if (scanner.nextInt() % 2 == 0) {
                System.out.println(i);
            }
        }

        // Calculando a m�dia dos n�meros pares
        double mediaPares = (double) somaPares / contadorPares;

        // Imprimindo a m�dia dos n�meros pares
        System.out.println("M�dia dos n�meros pares: " + mediaPares);
    }
}