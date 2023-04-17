package Conteudo_9;

import static ShortcutFunctions.ShortcutFunctions.toDouble;

import javax.swing.*;

public class C09Ex03 {
    public static void main(String[] args) {
        JTextField iterationLenght = new JTextField();

        JOptionPane.showConfirmDialog(
                null,
                iterationLenght,
                "Qual sera o numero de repetições?",
                JOptionPane.OK_CANCEL_OPTION);

        StringBuilder result = new StringBuilder();
        double firstValue = 4;
        int secondValue = 3;
        double serie = 0;
        for (int i = 0; i <  toDouble(iterationLenght.getText()); i++, firstValue += 4, secondValue += 3) {
            serie += (1 + Math.sqrt(firstValue)) / secondValue;
        }
        result.append(serie);
        JOptionPane.showMessageDialog(
                null,
                result.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
