package Conteudo_5;

import javax.swing.*;
import kotlinUtils.UtilsFunctions;
public class C05Ex05 {
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
        final double kelvin = CelsiusToKelvin(myUtilsFunctions.kotlinIntParser(temperature.getText()));
        final double fahrenheit = CelsiusToFahrenheit(myUtilsFunctions.kotlinIntParser(temperature.getText()));

        final String result = "Kelvin: " + kelvin + "\n Fahrenheit: " + fahrenheit;
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
    private static double CelsiusToFahrenheit(int value){
        return (value * 9/5) + 32;
    }
    private static double CelsiusToKelvin(int value){
        return (value + 273);
    }
}
