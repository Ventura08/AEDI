package Conteudo_5;

import kotlinUtils.UtilsFunctions;

import javax.swing.*;

public class C05Ex12 {
    public static void main(String[] args) {
        UtilsFunctions kFunctions = new UtilsFunctions();
        JTextField seconds = new JTextField();
        Object[] fields = {
                "Segundo: ", seconds,
        };

        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);

        final String expression = kFunctions.kotlinSecondsToMinutesAndHours(seconds.getText());

        final String result = "Resultado: \n" + expression;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);

    }
}
