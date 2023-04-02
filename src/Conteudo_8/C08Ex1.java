package Conteudo_8;

import javax.swing.*;
import static ShortcutFunctions.ShortcutFunctions.toDouble;

public class C08Ex1 {
    public static void main(String[] args) {
        JTextField radius = new JTextField();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            Object[] fields = {
                    "Informe o raio número " + (i + 1) + ": ", radius,
            };
            JOptionPane.showConfirmDialog(
                    null,
                    fields,
                    "",
                    JOptionPane.OK_CANCEL_OPTION);
            result.append(getArea(toDouble(radius.getText()))).append("\n");
            radius.setText("");
        }
        JOptionPane.showMessageDialog(
                null,
                result.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
    private static double getArea(double radius) {
        return 3.1416 * (Math.pow(radius, 2));
    }
}
