package Conteudo_10;

import javax.swing.*;
import java.awt.*;

public class C10Ex08 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        double firstValue = 3;
        int secondValue = 5;
        int thirdValue = 5;
        double serie = 0;
        for (int i = 0; i < 20; i++, firstValue += 2, secondValue += 4, thirdValue *= 5) {
            serie += ((firstValue * (Math.sqrt(secondValue))) / thirdValue);
        }
        serie = Math.pow(serie, 2);
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
