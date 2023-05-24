package Conteudo_12;

import javax.swing.*;
import java.util.ArrayList;

import static ShortcutFunctions.ShortcutFunctions.toDouble;

public class C12Ex02 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        ArrayList<String> numbers = new ArrayList<>();
        JTextField field = new JTextField();
        Object[] fields = {"Valor 1 ", field,};
        for (int i = 1; i <= 10; i++) {
            JOptionPane.showConfirmDialog(null, fields, "", JOptionPane.OK_CANCEL_OPTION);
            final Double value = toDouble(field.getText());
            final boolean condicao = (value > 5) && (value < 10);
            if(condicao){
                numbers.add(String.valueOf(value));
            }
            field.setText("");
        }
        result.append(numbers);
        JOptionPane.showMessageDialog(null, result.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
