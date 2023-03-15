package Conteudo_6;

import kotlinUtils.UtilsFunctions;

import javax.swing.*;
import java.util.Arrays;

public class C06Ex02 {
    public static void main(String[] args) {
        UtilsFunctions kFunctions = new UtilsFunctions();
        JTextField input = new JTextField();
        String expression = "";
        Object[] fields = {
                "Quantidade de Poluente: ", input,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final double parsedInput = Double.parseDouble(input.getText());
        if (parsedInput <= 1500) {
            expression += "Isento";
        } else if (parsedInput > 1500 && parsedInput <= 3500) {
            expression +=  "R$3000,00";
        }else if (parsedInput > 3500){
            expression +=  5000 * parsedInput;
        }

        final String result = "Resultado: \n" + expression;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
