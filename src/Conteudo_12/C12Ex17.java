package Conteudo_12;

import java.util.Scanner;

public class C12Ex17 {
    public static void main(String[] args) {
        int quantidadeNumeros = 10;
        int[] numeros = new int[quantidadeNumeros];

        // Lendo os n�meros inteiros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 n�meros inteiros:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Lendo o n�mero real
        System.out.print("Digite um n�mero real: ");
        double numeroReal = scanner.nextDouble();

        // Imprimindo os n�meros multiplicados pelo n�mero real
        System.out.println("N�meros multiplicados pelo n�mero real:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            int resultado = (int) (numeros[i] * numeroReal);
            System.out.println(resultado);
        }
    }
}
