package Conteudo_10;

import javax.swing.*;

public class C10Ex01 {
    public static void main(String[] args) {
        double valor = 0;
        int cont = 0;
        double somaMulta = 0;
        String input = "";

        do {
            input = JOptionPane.showInputDialog(null, "Digite o valor financeiro (ou -1 para sair): ");
            valor = Double.parseDouble(input);

            // Cálculo da multa
            if (valor != -1) {
                double multa = valor * 0.1;
                somaMulta += multa;
                cont++;
                System.out.println("Multa aplicada: " + multa);
            }
        } while (valor != -1);

        // Cálculo da média das multas
        double mediaMulta = somaMulta / cont;

        // Exibição do resultado
        JOptionPane.showMessageDialog(null, "A média das multas é: " + mediaMulta);

    }
}
