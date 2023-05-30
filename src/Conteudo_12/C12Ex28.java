package Conteudo_12;

import java.util.*;

public class C12Ex28 {
    public static void main(String[] args) {
        List<String> ras = new ArrayList<>();
        List<String> nomes = new ArrayList<>();

        preencherListas(ras, nomes);

        ordenarListas(ras, nomes);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome de um aluno: ");
        String nomePesquisado = scanner.nextLine();

        int index = pesquisarAluno(nomes, nomePesquisado);

        if (index != -1) {
            System.out.println("Aluno encontrado!");
            System.out.println("RA: " + ras.get(index));
            System.out.println("Posição na lista: " + (index + 1));
        } else {
            System.out.println("NOME NÃO ENCONTRADO");
        }
    }

    private static void preencherListas(List<String> ras, List<String> nomes) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o RA do aluno " + (i + 1) + ": ");
            String ra = scanner.nextLine();
            ras.add(ra);

            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }
    }

    private static void ordenarListas(List<String> ras, List<String> nomes) {
        List<Aluno> alunos = new ArrayList<>();

        for (int i = 0; i < nomes.size(); i++) {
            Aluno aluno = new Aluno(ras.get(i), nomes.get(i));
            alunos.add(aluno);
        }

        Collections.sort(alunos, Comparator.comparing(Aluno::getNome));

        for (int i = 0; i < alunos.size(); i++) {
            Aluno aluno = alunos.get(i);
            ras.set(i, aluno.getRa());
            nomes.set(i, aluno.getNome());
        }
    }

    private static int pesquisarAluno(List<String> nomes, String nomePesquisado) {
        for (int i = 0; i < nomes.size(); i++) {
            if (nomes.get(i).equals(nomePesquisado)) {
                return i;
            }
        }
        return -1;
    }

    private static class Aluno {
        private String ra;
        private String nome;

        public Aluno(String ra, String nome) {
            this.ra = ra;
            this.nome = nome;
        }

        public String getRa() {
            return ra;
        }

        public String getNome() {
            return nome;
        }
    }
}
