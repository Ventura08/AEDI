package Conteudo_12;

import ShortcutFunctions.ShortcutFunctions;

import javax.swing.*;
import java.util.ArrayList;

import static ShortcutFunctions.ShortcutFunctions.toDouble;

public class C12Ex01 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        ArrayList<String> divisivel = new ArrayList<>();
        JTextField field = new JTextField();
        Object[] fields = {"Valor 1 ", field,};
        for (int i = 1; i <= 10; i++) {
            JOptionPane.showConfirmDialog(null, fields, "", JOptionPane.OK_CANCEL_OPTION);
            final Double value = toDouble(field.getText());
            final boolean condicao = (value % 5 == 0) && (value % 7 == 0);
            if(condicao){
                divisivel.add(".");
            }
            field.setText("");
        }
        result.append(divisivel.size());
        JOptionPane.showMessageDialog(null, result.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
