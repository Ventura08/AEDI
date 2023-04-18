package Conteudo_9;

import javax.swing.*;
import java.awt.*;

public class C09Ex07 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        double firstValue = 0;
        int secondValue = 3;
        int thirdValue = 7;
        double serie = 0;
        for (int i = 0; i < 6; i++, firstValue += 2, secondValue += 3, thirdValue += 6) {
            serie += ((firstValue + secondValue) / thirdValue);
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
