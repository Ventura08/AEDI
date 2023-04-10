package Conteudo_8;

import ShortcutFunctions.ShortcutFunctions;

import javax.swing.*;
import java.util.ArrayList;

import static ShortcutFunctions.ShortcutFunctions.toInt;

public class C08Ex08 {
    public static void main(String[] args) {
        JTextField offs = new JTextField();
        JTextField note = new JTextField();
        int moreThan16Off = 0;
        ArrayList<String> allApproveNotes = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 1; i++) {
            Object[] fields = {
                    "Informe o numero de faltas " + (i + 1) + ": ", offs,
                    "Informe a nota " + (i + 1) + ": ", note
            };
            JOptionPane.showConfirmDialog(
                    null,
                    fields,
                    "",
                    JOptionPane.OK_CANCEL_OPTION);
            if (toInt(offs.getText()) < 16) {
                if (toInt(note.getText()) >= 65) {
                    allApproveNotes.add(note.getText());
                    result.append("Aprovado");
                } else {
                    result.append("Reprovado");
                }
            } else {
                moreThan16Off++;
                result.append("Reprovado");
            }

            JOptionPane.showMessageDialog(
                    null,
                    result.toString(),
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);
            offs.setText("");
            note.setText("");
            result.setLength(0);
        }
        final double average = allApproveNotes.stream().mapToDouble(ShortcutFunctions::toDouble).sum() / allApproveNotes.size();

        result.append(" \n Numero de alunos com mais de 16 faltas -> ")
                .append(moreThan16Off)
                .append(" \n Média das notas informadas -> ").
                append(average);

        JOptionPane.showMessageDialog(
                null,
                result.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
