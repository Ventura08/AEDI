package Conteudo_9;


import javax.swing.*;


public class C09Ex01 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        int firstValue = 37;
        int secondValue = 38;
        double serie = 0;
        for (int i = 1; i <= 37; i++, firstValue--, secondValue--) {
            serie += (double) (firstValue * secondValue) / i;
        }
        result.append(serie);
        JOptionPane.showMessageDialog(
                null,
                result.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
