package Conteudo_9;

import javax.swing.*;

public class C09Ex02 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        double firstValue = 1;
        int secondValue = 0;
        double serie = 0;
        for (int i = 1; i <= 100; i++, firstValue = Math.pow(i, 2), secondValue = i - 1) {
            serie += (double) i / (firstValue + secondValue);
        }
        result.append(serie);
        JOptionPane.showMessageDialog(
                null,
                result.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
