package Conteudo_5;

import kotlinUtils.UtilsFunctions;

import javax.swing.*;

public class C05Ex07 {
    public static void main(String[] args) {
        UtilsFunctions kFunctions = new UtilsFunctions();
        JTextField x = new JTextField();
        Object[] fields = {
                "Valor de X: ", x,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final double xParsed = kFunctions.kotlinDoubleParser(x.getText());
        final double expression = Math.sqrt((Math.pow((xParsed / 4.0) + 1.0, 2.0)) + ((1.0 / 5.0) * xParsed));
        final String result = "Valor da Função: " + expression;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
