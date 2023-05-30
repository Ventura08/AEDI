package Conteudo_12;

import java.util.Scanner;

public class C12Ex19 {
    public static void main(String[] args) {
        int quantidadeBilhetes = 100;
        int[] bilhetes = new int[quantidadeBilhetes];

        // Lendo os números dos bilhetes
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os números dos " + quantidadeBilhetes + " bilhetes de loteria:");
        for (int i = 0; i < quantidadeBilhetes; i++) {
            System.out.print("Bilhete " + (i + 1) + ": ");
            bilhetes[i] = scanner.nextInt();
        }

        // Lendo o número do bilhete sorteado
        System.out.print("Digite o número do bilhete sorteado no primeiro prêmio: ");
        int bilheteSorteado = scanner.nextInt();

        // Verificando se a pessoa foi premiada
        boolean premiada = false;
        for (int i = 0; i < quantidadeBilhetes; i++) {
            if (bilhetes[i] == bilheteSorteado) {
                premiada = true;
                break;
            }
        }

        // Imprimindo o resultado
        if (premiada) {
            System.out.println("Parabéns! Você foi premiado!");
        } else {
            System.out.println("Não foi dessa vez. Melhor sorte na próxima!");
        }
    }
}
