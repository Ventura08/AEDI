package Conteudo_6;

import javax.swing.*;

import static ShortcutFunctions.ShortcutFunctions.toDouble;

public class C06Ex13 {
    public static void main(String[] args) {
        JTextField initalHour = new JTextField();
        JTextField initialMinute = new JTextField();
        JTextField finalHour = new JTextField();
        JTextField finalMinute = new JTextField();
        Object[] fields = {
                "Hora inicial: ", initalHour,
                "Minuto inicial: ", initialMinute,
                "Hora final: ", finalHour,
                "Minuto final: ", finalMinute,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final String result = "Resultado: \n" +
                calculateHours(
                        toDouble(initalHour.getText()),
                        toDouble(initialMinute.getText()),
                        toDouble(finalHour.getText()),
                        toDouble(finalMinute.getText())
                );
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static String calculateHours(double initialHour, double initialMinute, double finalHour, double finalMinute) {
        final double hour = finalHour - initialHour;
        final double minute = finalMinute - initialMinute;
        return hour + " hs  " + minute + " min";
    }
}
