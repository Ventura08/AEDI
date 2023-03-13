package Conteudo_5;

import javax.swing.*;

public class C05Ex03 {
    public static void main(String[] args) {
        JTextField salaryField = new JTextField();
        JTextField dependentsField = new JTextField();
        Object[] fields = {
                "Salario: ", salaryField,
                "Dependentes:", dependentsField
        };
        JOptionPane.showConfirmDialog(null, fields, "", JOptionPane.OK_CANCEL_OPTION);
        final double liquidSalary = Integer.parseInt(salaryField.getText()) - (Integer.parseInt(dependentsField.getText()) * 60.0);
        final double impostoDeRenda = liquidSalary * 0.15;
        final String result = "Salario: " + liquidSalary + "\n Dependentes: " + dependentsField.getText() + "\n IR: " + impostoDeRenda;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
