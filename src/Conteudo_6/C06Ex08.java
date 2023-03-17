package Conteudo_6;

import javax.swing.*;

import static ShortcutFunctions.ShortcutFunctions.pow;
import static ShortcutFunctions.ShortcutFunctions.toDouble;

public class C06Ex08 {
    public static void main(String[] args) {
        JTextField height = new JTextField();
        final double minIMC = 20;
        final double maxIMC = 25;
        Object[] fields = {
                "Digite sua altura: ", height,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final String result = "Resultado: \n" + calculateMaxAndMinWeight(maxIMC, minIMC, toDouble(height.getText()));
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static String calculateMaxAndMinWeight(double max, double min, double height) {
        return "Seu peso ideal é:\n" + "Max: " + (max * (pow(height, 2))) + "\nMin: " + (min * (pow(height, 2)));
    }
}
