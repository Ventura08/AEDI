package Conteudo_8;

import javax.swing.*;

import static ShortcutFunctions.ShortcutFunctions.toDouble;
import static ShortcutFunctions.ShortcutFunctions.toInt;

public class C08Ex02 {
    public static void main(String[] args) {
        JTextField finalNote = new JTextField();
        JTextField absences = new JTextField();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            Object[] fields = {
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
                result.append("Aluno ")
                        .append(i + 1)
                        .append(' ')
                        .append(getResult(toDouble(finalNote.getText()), toDouble(absences.getText())))
                        .append("\n"
                        );
                finalNote.setText("");
                absences.setText("");
            }
        }
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
