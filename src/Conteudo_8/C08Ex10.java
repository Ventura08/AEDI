package Conteudo_8;

import ShortcutFunctions.ShortcutFunctions;

import static ShortcutFunctions.ShortcutFunctions.toDouble;
import static ShortcutFunctions.ShortcutFunctions.toInt;

import javax.swing.*;
import java.util.ArrayList;

public class C08Ex10 {
    public static void main(String[] args) {
        JTextField iterationLenght = new JTextField();

        JOptionPane.showConfirmDialog(
                null,
                iterationLenght,
                "Qual sera o numero de repetições?",
                JOptionPane.OK_CANCEL_OPTION);

        JTextField name = new JTextField();
        JTextField price = new JTextField();
        JTextField quantityConsumed = new JTextField();
        ArrayList<String> values = new ArrayList<>();
        double min = Double.MIN_VALUE;
        String highestPrice = null;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < toInt(iterationLenght.getText()); i++) {
            Object[] fields = {
                    "Informe o nome " + (i + 1) + ": ", name,
                    "Informe o preco" + (i + 1) + ": ", price,
                    "Informe a quantidade " + (i + 1) + ": ", quantityConsumed
            };
            JOptionPane.showConfirmDialog(
                    null,
                    fields,
                    "",
                    JOptionPane.OK_CANCEL_OPTION);
            values.add(String.valueOf(toDouble(price.getText()) * toDouble(quantityConsumed.getText())));
            if (toDouble(price.getText()) * toDouble(quantityConsumed.getText()) > min) {
                min = toDouble(price.getText()) * toDouble(quantityConsumed.getText());
                highestPrice = name.getText();
            }
            
            name.setText("");
            price.setText("");
            quantityConsumed.setText("");
        }
        final double total = values.stream().mapToDouble(ShortcutFunctions::toDouble).sum();
        final double average = total / values.size();
        result.append("Custo total ->  ")
                .append(total)
                .append(" \n Media -> ")
                .append(average)
                .append(" \n Produto mais caro -> ")
                .append(highestPrice);
        JOptionPane.showMessageDialog(
                null,
                result.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
