package Conteudo_6;

import javax.swing.*;

import static ShortcutFunctions.ShortcutFunctions.*;

public class C06Ex06 {
    public static void main(String[] args) {
        JTextField a = new JTextField();
        JTextField b = new JTextField();
        JTextField c = new JTextField();
        Object[] fields = {
                "Digite A: ", a,
                "Digite B: ", b,
                "Digite C: ", c,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final double delta = calculateDelta(toDouble(a.getText()), toDouble(b.getText()), toDouble(c.getText()));
        final String expression = calculateBhaskara(toDouble(a.getText()), toDouble(b.getText()), delta);
        final String result = "Resultado: \n" + expression;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
