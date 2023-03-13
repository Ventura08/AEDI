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
        final double[] noteWeight = {2.0, 3.0, 5.0};
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final String[] notes = {firstNote.getText(), secondNote.getText(), thirdNote.getText()};
        final double expression = kFunctions.kotlinWeightedAverage(noteWeight, notes);
        final String result = "Valor da Media: " + expression;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
