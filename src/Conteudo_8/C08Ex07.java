package Conteudo_8;

import ShortcutFunctions.ShortcutFunctions;

import javax.swing.*;
import java.util.ArrayList;

import static ShortcutFunctions.ShortcutFunctions.toInt;

public class C08Ex07 {
    public static void main(String[] args) {
        JTextField name = new JTextField();
        JTextField age = new JTextField();
        ArrayList<String> untilTwelve = new ArrayList<>();
        ArrayList<String> overThirty = new ArrayList<>();
        ArrayList<String> allAges = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            Object[] fields = {
                    "Informe o nome" + (i + 1) + ": ", name,
                    "Informe o numero " + (i + 1) + ": ", age
            };
            JOptionPane.showConfirmDialog(
                    null,
                    fields,
                    "",
                    JOptionPane.OK_CANCEL_OPTION);
            if (toInt(age.getText()) <= 12) {
                untilTwelve.add(age.getText());
            } else if (toInt(age.getText()) > 30) {
                overThirty.add(age.getText());
            }
            allAges.add(age.getText());
            name.setText("");
            age.setText("");
        }
        final double average = allAges.stream().mapToDouble(ShortcutFunctions::toDouble).sum() / allAges.size();
        result.append("Alunos com até 12 anos ->  ").
                append(untilTwelve.size())
                .append("\n Alunos com mais de 30 anos -> ")
                .append(overThirty.size())
                .append(" \n Média das idades informadas -> ").
                append(average);
        JOptionPane.showMessageDialog(
                null,
                result.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
