package Conteudo_10;

import javax.swing.*;

public class C10Ex04 {


    public static void main(String[] args) {

        // Read BDI rate
        JTextField bdiField = new JTextField();
        JOptionPane.showConfirmDialog(
                null,
                bdiField,
                "Enter BDI rate (%)",
                JOptionPane.OK_CANCEL_OPTION);
        double bdiRate = Double.parseDouble(bdiField.getText());

        // Read material costs and calculate price
        double totalCost = 0;
        String materialName = "";
        do {
            JTextField quantityField = new JTextField();
            JTextField priceField = new JTextField();
            JTextField nameField = new JTextField();
            Object[] fields = {
                    "Material name:", nameField,
                    "Quantity:", quantityField,
                    "Price per unit:", priceField
            };
            int option = JOptionPane.showConfirmDialog(
                    null,
                    fields,
                    "Enter material information",
                    JOptionPane.OK_CANCEL_OPTION
            );
            if (option == JOptionPane.CANCEL_OPTION || nameField.getText().equals("FIM")) {
                break;
            }
            materialName = nameField.getText();
            int quantity = Integer.parseInt(quantityField.getText());
            double price = Double.parseDouble(priceField.getText());
            double partialCost = quantity * price;
            totalCost += partialCost;
            JOptionPane.showMessageDialog(
                    null,
                    String.format("Partial cost for %s: %.2f", materialName, partialCost),
                    "Partial cost",
                    JOptionPane.INFORMATION_MESSAGE
            );
        } while (!materialName.equals("FIM"));

        // Calculate and show final price
        double bdiValue = totalCost * bdiRate / 100;
        double finalPrice = totalCost + bdiValue;
        JOptionPane.showMessageDialog(
                null,
                String.format("Total cost: %.2f\nBDI value: %.2f\nFinal price: %.2f", totalCost, bdiValue, finalPrice),
                "Final price",
                JOptionPane.INFORMATION_MESSAGE
        );
    }


}
