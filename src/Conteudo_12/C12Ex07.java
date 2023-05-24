package Conteudo_12;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static ShortcutFunctions.ShortcutFunctions.toDouble;

public class C12Ex07 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        ArrayList<Map<String, String>> array = new ArrayList<>();
        JTextField field = new JTextField();
        JTextField nota = new JTextField();
        Object[] fields = {"Nome", field, "Nota", nota};
        for (int i = 1; i <= 2; i++) {
            JOptionPane.showConfirmDialog(null, fields, "", JOptionPane.OK_CANCEL_OPTION);
            final String value = nota.getText();
            final String concept = getConcept(String.valueOf(value));
            final Map<String, String> dict = new HashMap<>();
            dict.put(field.getText(), concept);
            array.add(dict);
            field.setText("");
        }
        result.append(array);
        JOptionPane.showMessageDialog(null, result.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String getConcept(String nota) {
        String result;
        double parsedValue = toDouble(nota);
        if (parsedValue <= 30) {
            result = "D";
        } else if (parsedValue >= 31 && parsedValue <= 60) {
            result = "C";
        } else if (parsedValue >= 61 && parsedValue <= 80) {
            result = "B";
        } else {
            result = "A";
        }
        return result;
    }
}
