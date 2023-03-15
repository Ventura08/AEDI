package Conteudo_6;

import kotlinUtils.UtilsFunctions;

import javax.swing.*;

public class C06Ex1 {
    public static void main(String[] args) {
        JTextField input = new JTextField();
        double expression;
        Object[] fields = {
                "Digite um valor: ", input,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final double parsedInput = Double.parseDouble(input.getText());
        if (parsedInput < 4) {
            expression = (5.0 * parsedInput + 3.0) / Math.sqrt( 16.0 - (Math.pow(parsedInput, 2.0)));
        } else if (parsedInput > 4) {
            expression = (5.0 * parsedInput + 3.0) / Math.sqrt((Math.pow(parsedInput, 2.0) - 16.0));
        }else {
            expression = 0.0;
        }

        final String result = "Resultado: \n" + expression;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
