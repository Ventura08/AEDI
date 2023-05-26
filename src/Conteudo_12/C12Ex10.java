package Conteudo_12;

import java.util.Scanner;

public class C12Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[50];
        double[] notas = new double[50];
        double somaNotas = 0;

        System.out.println("Digite o nome e a nota da prova para cada aluno:");

        // Leitura dos nomes e notas dos alunos
        for (int i = 0; i < 50; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do scanner

            somaNotas += notas[i];
        }

        double media = somaNotas / 50;

        System.out.println("\nAlunos com nota acima da média:");

        // Verificação e impressão dos alunos com nota acima da média
        for (int i = 0; i < 50; i++) {
            if (notas[i] > media) {
                System.out.println(nomes[i]);
            }
        }
    }
}
