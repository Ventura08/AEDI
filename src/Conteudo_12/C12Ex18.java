package Conteudo_12;

import java.util.Scanner;

public class C12Ex18 {
    public static void main(String[] args) {
        int tamanhoFila = 10;
        String[] fila = new String[tamanhoFila];

        // Lendo os nomes das pessoas na fila
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome das pessoas na fila:");
        for (int i = 0; i < tamanhoFila; i++) {
            System.out.print("Pessoa " + (i + 1) + ": ");
            fila[i] = scanner.nextLine();
        }

        // Lendo o nome a ser pesquisado
        System.out.print("Digite o nome a ser pesquisado: ");
        String nomePesquisado = scanner.nextLine();

        // Pesquisando a posição do nome na fila
        int posicao = -1;
        for (int i = 0; i < tamanhoFila; i++) {
            if (fila[i].equalsIgnoreCase(nomePesquisado)) {
                posicao = i + 1; // Adicionando 1 para exibir a posição a partir de 1, não de 0
                break;
            }
        }

        // Imprimindo a posição do nome na fila
        if (posicao != -1) {
            System.out.println(nomePesquisado + " está na posição " + posicao + " da fila.");
        } else {
            System.out.println(nomePesquisado + " não se encontra na fila.");
        }
    }
}
