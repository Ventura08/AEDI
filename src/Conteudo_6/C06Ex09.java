package Conteudo_6;

import javax.swing.*;

import static ShortcutFunctions.ShortcutFunctions.toDouble;

public class C06Ex09 {
    public static void main(String[] args) {
        JTextField gender = new JTextField();
        JTextField height = new JTextField();
        Object[] fields = {
                "SEXO: ", gender,
                "ALTURA: ", height,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final double expression = GreatWeightBasedOnGender(gender.getText(), toDouble(height.getText()));
        final String result = "Resultado: \n" +
                ((expression != 0) ? String.format("%1$,.3f", expression) : "Digite um genero valido");
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static double GreatWeightBasedOnGender(String gender, double height) {
        if (gender.contains("M") || gender.contains("F")) {
            if (gender.equalsIgnoreCase("M")) {
                return (72.7 * height - 58);
            } else {
                return (62.1 * height - 44.7);
            }
        } else {
            return 0;
        }

    }
}
