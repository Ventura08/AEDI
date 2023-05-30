package Conteudo_12;

import java.util.Scanner;

public class C12Ex24 {
    public static void main(String[] args) {
        int tamanhoVetor = 10;
        int[] vetorOriginal = new int[tamanhoVetor];
        int[] vetorDivisiveisPor3;

        // Lendo o vetor original
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorOriginal[i] = scanner.nextInt();
        }

        // Copiando os elementos divisíveis por 3 para o novo vetor
        int tamanhoNovoVetor = 0;
        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetorOriginal[i] % 3 == 0) {
                tamanhoNovoVetor++;
            }
        }

        vetorDivisiveisPor3 = new int[tamanhoNovoVetor];
        int indice = 0;
        for (int i = 0; i < tamanhoVetor; i++) {
            if (vetorOriginal[i] % 3 == 0) {
                vetorDivisiveisPor3[indice] = vetorOriginal[i];
                indice++;
            }
        }

        // Imprimindo o novo vetor
        System.out.println("Vetor com elementos divisíveis por 3:");
        for (int i = 0; i < tamanhoNovoVetor; i++) {
            System.out.println(vetorDivisiveisPor3[i]);
        }
    }
}
