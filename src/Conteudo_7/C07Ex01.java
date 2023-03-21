package Conteudo_7;

import javax.swing.*;

import static ShortcutFunctions.ShortcutFunctions.toInt;

public class C07Ex01 {
    public static void main(String[] args) {
        JTextField name = new JTextField();
        JTextField points = new JTextField();
        String result = "";
        Object[] fields = {
                "Informe seu nome: ", name,
                "Informe o numero de acertos: ", points,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        switch (toInt(points.getText())) {
            case 1,2,3,4,5:
                result = "NENHUM";
                break;
            case 6,7,8,9,10:
                result = "OUTRO CARTÂO";
                break;
            case 11:
                result = "R$100,00";
                break;
            case 12:
                result = "R$1000.00";
                break;
            case 13:
                result = "R$50.000";
        }
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
