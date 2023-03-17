package Conteudo_6;

import javax.swing.*;

import static ShortcutFunctions.ShortcutFunctions.toDouble;

public class C06Ex07 {
    public static void main(String[] args) {
        JTextField salary = new JTextField();
        Object[] fields = {
                "Digite seu salario: ", salary,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final String result = "Resultado: \n" + calculateSalary(toDouble(salary.getText()));
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static double calculateSalary(double salary){
        double gross;
        if(salary < 300){
            gross = 500 + (salary * 0.7);
        } else if (300 < salary && salary < 1000) {
            gross = 200 + (salary * 0.5);
        }else {
            gross = (salary * 0.3);
        }
        return (gross - (gross * 0.25));
    }
}
