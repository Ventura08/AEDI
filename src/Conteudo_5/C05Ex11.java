package Conteudo_5;

import kotlinUtils.UtilsFunctions;

import javax.swing.*;

public class C05Ex11 {
    public static void main(String[] args) {
        UtilsFunctions kFunctions = new UtilsFunctions();
        JTextField checkNumber = new JTextField();
        JTextField bank = new JTextField();
        JTextField agency = new JTextField();
        JTextField sequencial = new JTextField();
        Object[] fields = {
                "Numero do Check: ", checkNumber,
                "Banco: ", bank,
                "Agencia: ", agency,
                "Sequemciaç: ", sequencial,
        };

        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final String expression =
                "Número do Cheque: " + checkNumber.getText() + "\n" +
                "Banco: " + bank.getText() + "\n" + "Agênciâ: " + agency.getText() + "\n" + "Sequencial: " + sequencial.getText();

        final String result = "Banco: " + expression;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
