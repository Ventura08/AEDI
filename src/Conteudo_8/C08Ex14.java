package Conteudo_8;

import javax.swing.*;

import java.awt.*;

import static ShortcutFunctions.ShortcutFunctions.toInt;

public class C08Ex14 {
    public static void main(String[] args) {
        JTextField iterationLenght = new JTextField();
        JTextField symbol = new JTextField();
        Object[] fields = {
                "Digite o numero : ", iterationLenght,
                "Digite o simbolo que deseja: ", symbol,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        StringBuilder result = new StringBuilder();
        for (int i = -1; i < toInt(iterationLenght.getText()); i++) {
            result.append(symbol.getText().repeat(toInt(iterationLenght.getText())))
                    .append("<br/>");
        }
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
