package Conteudo_10;

import javax.swing.*;

public class C10Ex03 {
    public static void main(String[] args) {
        JTextField angleField = new JTextField();
        JOptionPane.showConfirmDialog(
                null,
                angleField,
                "Enter the angle in degrees:",
                JOptionPane.OK_CANCEL_OPTION);

        double angle = toDouble(angleField.getText());
        double sectorArea;

        do {
            JTextField radiusField = new JTextField();
            JOptionPane.showConfirmDialog(
                    null,
                    radiusField,
                    "Enter the radius (or -1 to stop):",
                    JOptionPane.OK_CANCEL_OPTION);

            double radius = toDouble(radiusField.getText());

            if (radius == -1) {
                break;
            }

            sectorArea = (Math.PI * Math.pow(radius, 2) * angle) / 360;
            JOptionPane.showMessageDialog(
                    null,
                    "The area of the sector with radius " + radius + " is " + sectorArea);
        } while (true);
    }

    private static double toDouble(String text) {
        try {
            return Double.parseDouble(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }


}
