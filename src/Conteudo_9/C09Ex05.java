package Conteudo_9;

import javax.swing.*;
import java.awt.*;

public class C09Ex05 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        double firstValue = 3;
        int secondValue = 7;
        double serie = 0;
        for (int i = 0; i < 10; i++, firstValue += 3, secondValue += 6) {
            serie += (double) 5 * ((i * 2) + firstValue) / secondValue;
        }
        result.append(serie);
        final JLabel label = new JLabel();
        label.setText("<html><body>" + result + "</body></html>");
        label.setFont(new Font("Arial", Font.BOLD, 19));
        JOptionPane.showMessageDialog(
                null,
                label,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
