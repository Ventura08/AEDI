package Conteudo_6;

import kotlinUtils.UtilsFunctions;

import javax.swing.*;

public class C06Ex04 {
    public static void main(String[] args) {
        UtilsFunctions kFunctions = new UtilsFunctions();
        JTextField weight = new JTextField();
        JTextField height = new JTextField();
        String expression = "";
                Object[] fields = {
                        "Peso em kilos: ", weight,
                        "Altura: ", height,
                };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final double parsedWeight = Double.parseDouble(weight.getText());
        final double parsedHeight = Double.parseDouble(height.getText()) ;
        final double imc = parsedWeight / (Math.pow(parsedHeight, 2));
        if (imc < 18) {
            expression += "Voce vai falecer, vai comer";
        } else if (imc > 18 && imc < 20) {
            expression +=  "Abaixo peso";
        }else if (imc >= 20 && imc <= 25 ){
            expression +=  "Peso ideal";
        } else if (imc > 25 && imc < 27) {
            expression += "Acima do peso";
        } else {
            expression += "Vai no medico, serio, vai no medico";
        }

        final String result = "Resultado: \n" + expression;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
