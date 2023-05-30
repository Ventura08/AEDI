package Conteudo_12;

import java.util.Scanner;

public class C12Ex25 {
    public static void main(String[] args) {
        int quantidadeEquipes = 20;
        String[] nomesEquipes = new String[quantidadeEquipes];
        int[] pontuacoes = new int[quantidadeEquipes];

        // Lendo os nomes das equipes e as pontuações
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < quantidadeEquipes; i++) {
            System.out.print("Digite o nome da equipe " + (i + 1) + ": ");
            nomesEquipes[i] = scanner.nextLine();
            System.out.print("Digite a pontuação final da equipe " + (i + 1) + ": ");
            pontuacoes[i] = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado
        }

        // Ordenando as equipes em ordem decrescente pela pontuação
        ordenarEquipes(nomesEquipes, pontuacoes);

        // Solicitando o nome de uma equipe para pesquisa
        System.out.print("Digite o nome de uma equipe: ");
        String equipePesquisada = scanner.nextLine();

        // Pesquisando a posição e a situação da equipe
        int posicao = pesquisarPosicaoEquipe(nomesEquipes, equipePesquisada);
        String situacao = determinarSituacaoEquipe(posicao);

        // Imprimindo o resultado da pesquisa
        System.out.println("Posição da equipe: " + posicao);
        System.out.println("Situação da equipe: " + situacao);
    }

    private static void ordenarEquipes(String[] nomesEquipes, int[] pontuacoes) {
        for (int i = 0; i < nomesEquipes.length - 1; i++) {
            for (int j = 0; j < nomesEquipes.length - i - 1; j++) {
                if (pontuacoes[j] < pontuacoes[j + 1]) {
                    // Trocar as posições
                    int tempPontuacao = pontuacoes[j];
                    pontuacoes[j] = pontuacoes[j + 1];
                    pontuacoes[j + 1] = tempPontuacao;

                    String tempNome = nomesEquipes[j];
                    nomesEquipes[j] = nomesEquipes[j + 1];
                    nomesEquipes[j + 1] = tempNome;
                }
            }
        }
    }

    private static int pesquisarPosicaoEquipe(String[] nomesEquipes, String equipePesquisada) {
        for (int i = 0; i < nomesEquipes.length; i++) {
            if (nomesEquipes[i].equalsIgnoreCase(equipePesquisada)) {
                return i + 1; // Posição baseada em 1
            }
        }
        return -1; // Equipe não encontrada
    }

    private static String determinarSituacaoEquipe(int posicao) {
        if (posicao > 0 && posicao <= 4) {
            return "Libertadores";
        } else if (posicao > 4 && posicao <= 6) {
            return "Pré-Libertadores";
        } else if (posicao > 16 && posicao <= 17) {
            return "Rebaixamento";
        } else if (posicao > 17 && posicao <= 20) {
            return "Zona de rebaixamento";
        } else {
            return "Meio de tabela";
        }
    }
}
