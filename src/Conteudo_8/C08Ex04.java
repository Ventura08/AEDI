package Conteudo_8;

import javax.swing.*;
import java.util.ArrayList;

import static ShortcutFunctions.ShortcutFunctions.toInt;

public class C08Ex04 {
    public static void main(String[] args) {
        JTextField name = new JTextField();
        JTextField age = new JTextField();
        ArrayList<String> studentsLessThanEighteen = new ArrayList<>();
        ArrayList<String> studentsMoreThanEighteen = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            Object[] fields = {
                    "Informe o nome do aluno " + (i + 1) + ": ", name,
                    "Informe a idade do aluno: ", age,
            };
            JOptionPane.showConfirmDialog(
                    null,
                    fields,
                    "",
                    JOptionPane.OK_CANCEL_OPTION);
            if (toInt(age.getText()) <= 18) {
                studentsLessThanEighteen.add(name.getText());
            } else {
                studentsMoreThanEighteen.add(name.getText());
            }
            name.setText("");
            age.setText("");
        }
        result.append("O numero de alunos até de 18 anos: ").
                append(studentsLessThanEighteen.size())
                .append("\n e são eles -> ")
                .append(studentsLessThanEighteen)
                .append(" \n O numero de alunos maiores de 18 anos: ").
                append(studentsMoreThanEighteen.size())
                .append("\n e são eles -> ")
                .append(studentsMoreThanEighteen);
        JOptionPane.showMessageDialog(
                null,
                result.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
