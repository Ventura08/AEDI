package Conteudo_5;

import kotlinUtils.UtilsFunctions;

import javax.swing.*;

public class C05Ex06 {
    public static void main(String[] args) {
        UtilsFunctions kFunctions = new UtilsFunctions();
        JTextField a = new JTextField();
        JTextField b = new JTextField();
        JTextField c = new JTextField();
        JTextField x = new JTextField();
        JTextField y = new JTextField();
        Object[] fields = {
                "A: ", a,
                "B: ", b,
                "C: ", c,
                "X: ", x,
                "Y: ", y,
        };

        JOptionPane.showConfirmDialog(
                null,
                fields,
                "Valor em celsius",
                JOptionPane.OK_CANCEL_OPTION);

        final double distance = kFunctions.kotlinStraight(
                a.getText(),
                b.getText(),
                c.getText(),
                x.getText(),
                y.getText()
                );



        final String result = "Distância: " + distance;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
