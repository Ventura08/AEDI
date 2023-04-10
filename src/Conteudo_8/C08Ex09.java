package Conteudo_8;

import ShortcutFunctions.ShortcutFunctions;

import javax.swing.*;
import java.util.ArrayList;

import static ShortcutFunctions.ShortcutFunctions.toInt;

public class C08Ex09 {
    public static void main(String[] args) {
        JTextField iterationLenght = new JTextField();
        JOptionPane.showConfirmDialog(
                null,
                iterationLenght,
                "Quantas pessoas irao ser analisadas?",
                JOptionPane.OK_CANCEL_OPTION);
        JTextField name = new JTextField();
        JTextField age = new JTextField();
        JComboBox<Object> gender = new JComboBox<>(new String[]{"M", "F"});
        ArrayList<String> menAge = new ArrayList<>();
        ArrayList<String> womenAge = new ArrayList<>();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < toInt(iterationLenght.getText()); i++) {
            Object[] fields = {
                    "Informe o nome " + (i + 1) + ": ", name,
                    "Informe a idade  " + (i + 1) + ": ", age,
                    "Informe o sexo: " + (i + 1) + ": ", gender
            };
            JOptionPane.showConfirmDialog(
                    null,
                    fields,
                    "",
                    JOptionPane.OK_CANCEL_OPTION);
            if (gender.getSelectedIndex() == 0) {
                menAge.add(age.getText());
            } else {
                womenAge.add(age.getText());
            }
            name.setText("");
            age.setText("");
        }
        final double manAgeAvarage = menAge.stream().mapToDouble(ShortcutFunctions::toDouble).sum() / menAge.size();
        final double womenAgeAverage = womenAge.stream().mapToDouble(ShortcutFunctions::toDouble).sum() / womenAge.size();
        result.append("Media da idade das mulheres ->  ")
                .append(womenAgeAverage)
                .append(" \n Média da idade dos homens -> ").
                append(manAgeAvarage);
        JOptionPane.showMessageDialog(
                null,
                result.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
