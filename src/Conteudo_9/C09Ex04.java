package Conteudo_9;

import javax.swing.*;

import static ShortcutFunctions.ShortcutFunctions.toDouble;

public class C09Ex04 {
    public static void main(String[] args) {
        JTextField iterationLenght = new JTextField();

        JOptionPane.showConfirmDialog(
                null,
                iterationLenght,
                "Qual sera o numero de repetições?",
                JOptionPane.OK_CANCEL_OPTION);

        StringBuilder result = new StringBuilder();
        double firstValue = 0;
        double serie = 0;
        for (int i = 0; i <  toDouble(iterationLenght.getText()); i++, firstValue += 4) {
            serie += ((firstValue + 1) * (firstValue + 2)) / ((firstValue + 3) * (firstValue + 4));
        }
        result.append(Math.sqrt(serie));
        JOptionPane.showMessageDialog(
                null,
                result.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
