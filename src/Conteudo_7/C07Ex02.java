package Conteudo_7;

import javax.swing.*;

import static ShortcutFunctions.ShortcutFunctions.toDouble;
import static ShortcutFunctions.ShortcutFunctions.toInt;

public class C07Ex02 {
    public static void main(String[] args) {
        JTextField firstNote = new JTextField();
        JTextField secondNote = new JTextField();
        JTextField thirdNote = new JTextField();
        int average;
        String result = "";
        Object[] fields = {
                "Nota 1 ", firstNote,
                "Nota 2: ", secondNote,
                "Nota 3: ", thirdNote,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        average = (toInt(firstNote.getText()) + toInt(secondNote.getText()) + toInt(thirdNote.getText())) / 3;
        switch (average) {
            case 9,10:
                result = "B";
                break;
            case 8:
                result = "B";
                break;
            case 7:
                result = "C";
                break;
            case 5,6:
                result = "D";
                break;
            case 1,2,3,4:
                result = "E";
        }
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
