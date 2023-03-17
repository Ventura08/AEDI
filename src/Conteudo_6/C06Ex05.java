package Conteudo_6;

import kotlinUtils.UtilsFunctions;

import javax.swing.*;

public class C06Ex05 {
    public static void main(String[] args) {
        JTextField input = new JTextField();
        String expression = "";
        Object[] fields = {
                "Digite um numero: ", input,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final double parsedInput = Double.parseDouble(input.getText());
        final boolean condition = parsedInput % 5 == 0 && parsedInput % 7 == 0;
        if (condition) {
            expression += parsedInput + " é divisivel por ambos";
        } else {
            expression += parsedInput + " nâo é divisivel por ambos";
        }

        final String result = "Resultado: \n" + expression;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
