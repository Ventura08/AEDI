package Conteudo_5;

import kotlinUtils.UtilsFunctions;

import javax.swing.*;

public class C05Ex06 {
    public static void main(String[] args) {
        UtilsFunctions myUtilsFunctions = new UtilsFunctions();
        JTextField temperature = new JTextField();
        Object[] fields = {
                "Temperatura em celsiu(Somente numero): ", temperature,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "Valor em celsius",
                JOptionPane.OK_CANCEL_OPTION);

        final String result = "Kelvin: ";
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
