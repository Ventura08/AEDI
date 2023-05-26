package Conteudo_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C12Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();
        List<Double> notas = new ArrayList<>();
        double maiorNota = 0;

        System.out.println("Digite o nome e a nota da prova para cada aluno:");

        // Leitura dos nomes e notas dos alunos
        for (int i = 0; i < 50; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            nomes.add(nome);

            System.out.print("Nota do aluno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do scanner
            notas.add(nota);

            if (nota > maiorNota) {
                maiorNota = nota;
            }
        }

        System.out.println("\nAlunos com a maior nota:");

        // Verificação e impressão dos alunos com a maior nota usando Stream
        List<String> alunosMaioresNotas = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            if (notas.get(i) == maiorNota) {
                alunosMaioresNotas.add(nomes.get(i));
            }
        }

        alunosMaioresNotas.stream().forEach(System.out::println);
    }
}
