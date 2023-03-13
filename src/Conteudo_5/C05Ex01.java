package Conteudo_5;

import javax.swing.*;

public class C05Ex01 {
    public static void main(String[] args) {
        final int input = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Digite o valor de X",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
                ));
        final double result = Math.pow(input, 3) + 4 * (input) + 10;
        JOptionPane.showMessageDialog(
                null,
                String.valueOf(result),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
