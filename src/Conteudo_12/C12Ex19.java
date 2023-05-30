package Conteudo_12;

import java.util.Scanner;

public class C12Ex19 {
    public static void main(String[] args) {
        int quantidadeBilhetes = 100;
        int[] bilhetes = new int[quantidadeBilhetes];

        // Lendo os n�meros dos bilhetes
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os n�meros dos " + quantidadeBilhetes + " bilhetes de loteria:");
        for (int i = 0; i < quantidadeBilhetes; i++) {
            System.out.print("Bilhete " + (i + 1) + ": ");
            bilhetes[i] = scanner.nextInt();
        }

        // Lendo o n�mero do bilhete sorteado
        System.out.print("Digite o n�mero do bilhete sorteado no primeiro pr�mio: ");
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
            System.out.println("Parab�ns! Voc� foi premiado!");
        } else {
            System.out.println("N�o foi dessa vez. Melhor sorte na pr�xima!");
        }
    }
}
