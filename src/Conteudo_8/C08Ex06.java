package Conteudo_8;

import ShortcutFunctions.ShortcutFunctions;

import javax.swing.*;
import java.util.ArrayList;

import static ShortcutFunctions.ShortcutFunctions.toInt;

public class C08Ex06 {
    public static void main(String[] args) {
        JTextField number = new JTextField();
        ArrayList<String> odds = new ArrayList<>();
        ArrayList<String> evens = new ArrayList<>();
        ArrayList<String> divisibleFor4 = new ArrayList<>();
        ArrayList<String> divisibleFor3 = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            Object[] fields = {
                    "Informe o numero " + (i + 1) + ": ", number
            };
            JOptionPane.showConfirmDialog(
                    null,
                    fields,
                    "",
                    JOptionPane.OK_CANCEL_OPTION);
            if (toInt(number.getText()) % 2 == 0) {
                odds.add(number.getText());
            } else {
                evens.add(number.getText());
            }

            if (toInt(number.getText()) % 4 == 0){
                divisibleFor4.add(number.getText());
            } else if (toInt(number.getText()) % 3 == 0) {
                divisibleFor3.add(number.getText());
            }

            number.setText("");
        }
        result.append("Numeros Pares: \n").
                append(odds)
                .append("\n Números impares \n ")
                .append(evens)
                .append(" \n Soma dos numeros divisiveis por 4: \n").
                append(divisibleFor4.stream().mapToInt(ShortcutFunctions::toInt).sum())
                .append("\n Quantidade de numeros divisiveis por 3: ")
                .append(divisibleFor3.size());
        JOptionPane.showMessageDialog(
                null,
                result.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
