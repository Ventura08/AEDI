package Conteudo_6;

import kotlinUtils.UtilsFunctions;

import javax.swing.*;

public class C06Ex03 {
    public static void main(String[] args) {
        UtilsFunctions kFunctions = new UtilsFunctions();
        JTextField input = new JTextField();
        double expression = 240.0;
        Object[] fields = {
                "Informe o valor da sua venda: ", input,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final double parsedInput = Double.parseDouble(input.getText());
        if (parsedInput <= 1000.0) {
            expression += 0;
        } else if (parsedInput > 1000.0 && parsedInput <= 10000.0) {
            expression +=  (parsedInput * 0.1);
        }else if (parsedInput > 10000.0){
            expression +=  1000;
        }

        final String result = "Resultado: \n" + expression;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
