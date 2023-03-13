package Conteudo_5;

import kotlinUtils.UtilsFunctions;

import javax.swing.*;

public class C05Ex09 {
    public static void main(String[] args) {
        UtilsFunctions kFunctions = new UtilsFunctions();
        final JTextField firstNote = new JTextField();
        final JTextField secondNote = new JTextField();
        final JTextField thirdNote = new JTextField();
        Object[] fields = {
                "Nota 1: ", firstNote,
                "Nota 2: ", secondNote,
                "Nota 3: ", thirdNote,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        //final double expression = kFunctions.kotlinCircleRadius(s.getText(), a.getText(), pi);
        final String result = "Valor da Função: ";
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
