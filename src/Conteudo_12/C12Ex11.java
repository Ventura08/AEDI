package Conteudo_12;

import java.util.Scanner;

public class C12Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[50];
        double[] notas = new double[50];
        double maiorNota = 0;
        String alunoMaiorNota = "";

        System.out.println("Digite o nome e a nota da prova para cada aluno:");

        // Leitura dos nomes e notas dos alunos
        for (int i = 0; i < 50; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do scanner

            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
                alunoMaiorNota = nomes[i];
            }
        }

        System.out.println("\nAluno com maior nota: " + alunoMaiorNota);
        System.out.println("Nota: " + maiorNota);
    }
}
