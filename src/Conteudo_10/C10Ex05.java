package Conteudo_10;

import javax.swing.JOptionPane;

public class C10Ex05 {


    public static void main(String[] args) {

        // inicializa��o das vari�veis
        int quantidadePessoas = 0;
        int quantidadeMulheres = 0;
        int quantidadeMulheresPesoMenor60 = 0;
        double alturaHomens = 0;
        int quantidadeHomens = 0;
        boolean continuar = true;

        do {
            // leitura dos dados da pessoa
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da pessoa:"));
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da pessoa:"));
            String[] opcoesSexo = {"M", "F"};
            String sexo = (String) JOptionPane.showInputDialog(null, "Selecione o sexo da pessoa:", "Sexo",
                    JOptionPane.PLAIN_MESSAGE, null, opcoesSexo, opcoesSexo[0]);

            // atualiza��o das vari�veis de acordo com os dados da pessoa
            quantidadePessoas++;
            if (sexo.equals("F")) {
                quantidadeMulheres++;
                if (peso < 60) {
                    quantidadeMulheresPesoMenor60++;
                }
            } else {
                alturaHomens += altura;
                quantidadeHomens++;
            }

            // verifica��o se o usu�rio deseja continuar adicionando pessoas
            int opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar outra pessoa?", "Continuar?",
                    JOptionPane.YES_NO_OPTION);
            if (opcao == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        } while (continuar);

        // c�lculo da altura m�dia dos homens
        double alturaMediaHomens = 0;
        if (quantidadeHomens != 0) {
            alturaMediaHomens = alturaHomens / quantidadeHomens;
        }

        // exibi��o dos resultados
        JOptionPane.showMessageDialog(null, "Quantidade de pessoas pesquisadas: " + quantidadePessoas + "\n" +
                "Quantidade de mulheres: " + quantidadeMulheres + "\n" +
                "Altura m�dia dos homens: " + alturaMediaHomens + "\n" +
                "Quantidade de mulheres com peso menor que 60: " + quantidadeMulheresPesoMenor60);
    }


}
