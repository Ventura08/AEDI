package Conteudo_5;

import kotlinUtils.UtilsFunctions;

import javax.swing.*;

public class C05Ex10 {
    public static void main(String[] args) {
        final JTextField number = new JTextField();
        Object[] fields = {
                "Digite o número: ", number,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        String stringNumber = number.getText();
        String expression = "";

        for (int i = 0; i < stringNumber.length(); i++) {
            expression += "\n" + stringNumber.charAt(i);
        }

        final String result = "Valor do Numero: " + expression;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
