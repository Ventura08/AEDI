package Conteudo_9;

import javax.swing.*;
import java.awt.*;

public class C09Ex09 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        double firstValue = 9;
        int secondValue = 10;
        int thirdValue = 1;
        int incrementer = 1;
        double serie = 0;
        for (int i = 0; i < 30; i++, firstValue *= 3, secondValue++ , incrementer += 2,thirdValue += incrementer) {
            serie += ((firstValue / (secondValue * thirdValue)));
        }
        serie = 100 - (Math.pow(serie, 3));
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
