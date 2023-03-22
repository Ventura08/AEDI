package Conteudo_7;

import javax.swing.*;

import static ShortcutFunctions.ShortcutFunctions.toInt;

public class C07Ex03 {
    public static void main(String[] args) {
        JTextField value = new JTextField();
        JTextField days = new JTextField();
        int average;
        String result = "";
        Object[] fields = {
                "Valor: ", value,
                "Dias: ", days,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        int parsedValue = toInt(value.getText());
        int parsedDays = toInt(days.getText());
        switch (parsedDays) {
            case 1,2,3,4,5:
                result = "ISENTO";
                break;
            case 6,7,8:
                result += (parsedValue * 0.02);
                break;
            case 9,10:
                result += (parsedValue * 0.1) + parsedDays / 2.0;
                break;
            default:
                result += (parsedValue * 1.5) + (parsedDays);
                break;
        }
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
