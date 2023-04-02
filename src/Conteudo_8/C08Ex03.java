package Conteudo_8;

import javax.swing.*;

import java.util.ArrayList;

import static ShortcutFunctions.ShortcutFunctions.toDouble;
import static ShortcutFunctions.ShortcutFunctions.toInt;

public class C08Ex03 {
    public static void main(String[] args) {
        JTextField finalNote = new JTextField();
        JTextField absences = new JTextField();
        JTextField name = new JTextField();
        ArrayList<String> approvedStudents = new ArrayList<>();
        ArrayList<String> reprovedStudents = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            Object[] fields = {
                    "Informe o nome do aluno " + (i + 1) + ": ", name,
                    "Informe a nota do aluno numero " + (i + 1) + ": ", finalNote,
                    "Informe o numero de faltas: ", absences,
            };
            JOptionPane.showConfirmDialog(
                    null,
                    fields,
                    "",
                    JOptionPane.OK_CANCEL_OPTION);
            if (toInt(finalNote.getText()) == -1) {
                break;
            } else {
                if (getResult(toDouble(finalNote.getText()), toDouble(absences.getText())).equalsIgnoreCase("Reprovado")) {
                    reprovedStudents.add(name.getText());
                } else {
                    approvedStudents.add(name.getText());
                }
                finalNote.setText("");
                absences.setText("");
                name.setText("");
            }
        }
        result.append("O numero de alunos reprovados foi ").
                append(reprovedStudents.size())
                .append("\n e são eles -> ")
                .append(reprovedStudents)
                .append(" \n O numero de alunos aprovados foi ").
                append(approvedStudents.size())
                .append("\n e são eles -> ")
                .append(approvedStudents);
        JOptionPane.showMessageDialog(
                null,
                result.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static String getResult(double finalNote, double absences) {
        return (finalNote >= 65 && absences < 16) ? "Aprovadp" : "Reprovado";
    }
}
