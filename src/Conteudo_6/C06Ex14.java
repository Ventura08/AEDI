package Conteudo_6;

import javax.swing.*;

import static ShortcutFunctions.ShortcutFunctions.toDouble;

public class C06Ex14 {
    public static void main(String[] args) {
        JTextField input = new JTextField();
        Object[] fields = {
                "Informe um numero de 4 digitos: ", input,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final String result = "Resultado: \n" +
                revertString(new StringBuilder(input.getText()));
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static String revertString(StringBuilder numbers) {
        if(numbers.length() == 4){
            String expression = "";
            return numbers.reverse().toString();
        }else {
            return "O NUMERO DEVE TER QUATRO DIGITOS";
        }
    }
}
