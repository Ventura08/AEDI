package Conteudo_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12Ex27 {
    public static void main(String[] args) {
        List<String> cpfs = new ArrayList<>();
        List<String> enderecos = new ArrayList<>();

        preencherListas(cpfs, enderecos);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um CPF: ");
        String cpfPesquisado = scanner.nextLine();

        int index = pesquisarCPF(cpfs, cpfPesquisado);

        if (index != -1) {
            System.out.println("CPF encontrado!");

            System.out.print("Deseja alterar o endereço (S/N)? ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("S")) {
                System.out.print("Digite o novo endereço: ");
                String novoEndereco = scanner.nextLine();
                enderecos.set(index, novoEndereco);
                System.out.println("Endereço atualizado com sucesso!");
            } else {
                cpfs.remove(index);
                enderecos.remove(index);
                System.out.println("CPF e endereço removidos com sucesso!");
            }
        } else {
            System.out.println("CPF não encontrado!");

            System.out.print("Deseja incluir o CPF com um novo endereço (S/N)? ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("S")) {
                System.out.print("Digite o novo CPF: ");
                String novoCpf = scanner.nextLine();
                System.out.print("Digite o novo endereço: ");
                String novoEndereco = scanner.nextLine();
                cpfs.add(novoCpf);
                enderecos.add(novoEndereco);
                System.out.println("CPF e endereço incluídos com sucesso!");
            }
        }

        imprimirListas(cpfs, enderecos);
    }

    private static void preencherListas(List<String> cpfs, List<String> enderecos) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o CPF da pessoa " + (i + 1) + ": ");
            String cpf = scanner.nextLine();
            cpfs.add(cpf);

            System.out.print("Digite o endereço da pessoa " + (i + 1) + ": ");
            String endereco = scanner.nextLine();
            enderecos.add(endereco);
        }
    }

    private static int pesquisarCPF(List<String> cpfs, String cpfPesquisado) {
        for (int i = 0; i < cpfs.size(); i++) {
            if (cpfs.get(i).equals(cpfPesquisado)) {
                return i;
            }
        }
        return -1;
    }

    private static void imprimirListas(List<String> cpfs, List<String> enderecos) {
        System.out.println("CPF - Endereço");
        for (int i = 0; i < cpfs.size(); i++) {
            System.out.println(cpfs.get(i) + " - " + enderecos.get(i));
        }
    }
}
