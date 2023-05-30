package Conteudo_12;

import java.util.Scanner;

public class C12Ex23 {
    public static void main(String[] args) {
        int quantidadeVagas = 100;
        String[] placasCarros = new String[quantidadeVagas];
        String[] nomesDonos = new String[quantidadeVagas];

        // Lendo as placas dos carros e os nomes dos donos
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < quantidadeVagas; i++) {
            System.out.print("Digite a placa do carro da vaga " + (i + 1) + ": ");
            placasCarros[i] = scanner.nextLine();
            System.out.print("Digite o nome do dono da vaga " + (i + 1) + ": ");
            nomesDonos[i] = scanner.nextLine();
        }

        // Solicitando a placa do carro ou o nome do morador para pesquisa
        System.out.print("Digite a placa do carro ou o nome do morador: ");
        String pesquisa = scanner.nextLine();

        // Pesquisando o número da vaga com base na placa ou nome informado
        int numeroVaga = -1;
        for (int i = 0; i < quantidadeVagas; i++) {
            if (placasCarros[i].equalsIgnoreCase(pesquisa) || nomesDonos[i].equalsIgnoreCase(pesquisa)) {
                numeroVaga = i + 1;
                break;
            }
        }

        // Imprimindo o resultado da pesquisa
        if (numeroVaga != -1) {
            System.out.println("O veículo ou morador está na vaga " + numeroVaga + ".");
        } else {
            System.out.println("O veículo ou morador não foi encontrado na garagem.");
        }
    }
}
