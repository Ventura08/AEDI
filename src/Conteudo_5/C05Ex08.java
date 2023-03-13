package Conteudo_5;

import kotlinUtils.UtilsFunctions;

import javax.swing.*;

public class C05Ex08 {
    public static void main(String[] args) {
        UtilsFunctions kFunctions = new UtilsFunctions();
        JTextField s = new JTextField();
        JTextField a = new JTextField();
        final double pi = 3.1416;
        Object[] fields = {
                "Area do setor circular: ", s,
                "Angulo: ", a,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final double expression = kFunctions.kotlinCircleRadius(s.getText(), a.getText(), pi);
        final String result = "Valor da Função: " + expression;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
