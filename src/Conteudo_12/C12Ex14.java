package Conteudo_12;

import java.util.*;

public class C12Ex14 {
    public static void main(String[] args) {
        List<Cidade> cidades = new ArrayList<>();

        // Lendo os dados das cidades
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os dados das 100 cidades brasileiras:");
        for (int i = 0; i < 100; i++) {
            System.out.print("Nome da cidade " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.print("População da cidade " + (i + 1) + ": ");
            int populacao = Integer.parseInt(scanner.nextLine());
            System.out.print("Estado da cidade " + (i + 1) + ": ");
            String estado = scanner.nextLine();
            System.out.println();

            Cidade cidade = new Cidade(nome, populacao, estado);
            cidades.add(cidade);
        }

        // Ordenando as cidades pela população em ordem decrescente
        Collections.sort(cidades, Comparator.comparingInt(Cidade::getPopulacao).reversed());

        // Imprimindo as 10 maiores cidades
        System.out.println("As 10 maiores cidades do Brasil:");
        for (int i = 0; i < 10; i++) {
            Cidade cidade = cidades.get(i);
            System.out.println("Cidade: " + cidade.getNome() + " | Estado: " + cidade.getEstado());
        }
    }

    static class Cidade {
        private String nome;
        private int populacao;
        private String estado;

        public Cidade(String nome, int populacao, String estado) {
            this.nome = nome;
            this.populacao = populacao;
            this.estado = estado;
        }

        public String getNome() {
            return nome;
        }

        public int getPopulacao() {
            return populacao;
        }

        public String getEstado() {
            return estado;
        }
    }
}
