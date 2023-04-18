package Conteudo_9;

import javax.swing.*;
import java.awt.*;

public class C09Ex06 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        double firstValue = 2;
        double serie = 0;
        for (int i = 1; i <= 20; i++, firstValue = i * 2) {
            serie +=  ((i) / Math.sqrt(firstValue));
        }
        serie += 10;
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
