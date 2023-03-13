package Conteudo_5;

import javax.swing.*;

public class C05Ex02 {
    public static void main(String[] args) {
        final int input = Integer.parseInt(JOptionPane.showInputDialog(
                null,
                "Digite o valos do Raio",
                "Aula de Java",
                JOptionPane.INFORMATION_MESSAGE
        ));
        final double pi = 3.1416;
        final double area = 4 * pi * (Math.pow(input, 2));
        final double volume = (4.0 / 3.0) * pi * Math.pow(input, 3);
        final String result = "Area: " + String.valueOf(area) + "\n Volume: " + String.valueOf(volume);
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
