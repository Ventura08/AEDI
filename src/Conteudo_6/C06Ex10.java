package Conteudo_6;

import javax.swing.*;

import static ShortcutFunctions.ShortcutFunctions.toDouble;

public class C06Ex10 {
    public static void main(String[] args) {
        JTextField investment = new JTextField();
        JTextField durationInDays = new JTextField();
        JTextField dailyRate = new JTextField();
        Object[] fields = {
                "Capital aplicado: ", investment,
                "Numero de dias: ", durationInDays,
                "Taxa Diaria: ", dailyRate,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final String result = "Resultado: \n" +
                redeemedAmount(
                        toDouble(investment.getText()),
                        toDouble(durationInDays.getText()),
                        toDouble(dailyRate.getText()),
                        10.0
                );
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static double redeemedAmount(double investment, double durationInDays, double dailyRate, double adminRate) {
        final double yield = (investment * (dailyRate / 100) * durationInDays);
        final double ir = 0.15 * yield;

        return (investment + yield) - ir - adminRate;
    }
}
