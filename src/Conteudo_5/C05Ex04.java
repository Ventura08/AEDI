package Conteudo_5;

import javax.swing.*;

public class C05Ex04 {
    public static void main(String[] args) {
        JTextField pointerX1 = new JTextField();
        JTextField pointerX2 = new JTextField();
        JTextField pointerY1 = new JTextField();
        JTextField pointerY2 = new JTextField();
        Object[] fields = {
                "X1: ", pointerX1,
                "X2:", pointerX2,
                "Y1: ", pointerY1,
                "Y2:", pointerY2
        };
        JOptionPane.showConfirmDialog(null, fields, "", JOptionPane.OK_CANCEL_OPTION);
        double coordinateX = Math.pow((IntConversor(pointerX1.getText()) - IntConversor(pointerX2.getText())), 2.0);
        double coordinateY = Math.pow((IntConversor(pointerY1.getText()) - IntConversor(pointerY2.getText())), 2.0);
        double square = Math.sqrt((coordinateX + coordinateY));
        final String result = "Distância: " + square;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static int IntConversor(String value) {
        return Integer.parseInt(value);
    }
}
