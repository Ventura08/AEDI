package Conteudo_10;

import javax.swing.*;

public class C10Ex02 {
    public static void main(String[] args) {
        double valor = 0;
        int cont = 0;
        double somaValores = 0;
        int contValoresAcima1000 = 0;
        String input = "";

        do {
            input = JOptionPane.showInputDialog(null, "Digite o valor recebido pelo serviço (ou 0 para sair): ");
            valor = Double.parseDouble(input);

            // Cálculo da média e soma dos valores
            if (valor != 0) {
                somaValores += valor;
                cont++;

                // Verificação dos valores acima de R$1000,00
                if (valor > 1000) {
                    contValoresAcima1000++;
                }
            }
        } while (valor != 0);

        // Cálculo da média dos valores
        double mediaValores = somaValores / cont;

        // Exibição do resultado
        JOptionPane.showMessageDialog(null, "A média dos valores recebidos é: R$" + mediaValores +
                "\nO valor total recebido é: R$" + somaValores +
                "\nA quantidade de valores recebidos acima de R$1000,00 é: " + contValoresAcima1000);

    }
}
