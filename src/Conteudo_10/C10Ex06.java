package Conteudo_10;

import javax.swing.*;

public class C10Ex06 {
    public static void main(String[] args) {
        double a, b, c, xo, yo = 0, d = 0;
        String input;

        input = JOptionPane.showInputDialog("Digite o valor de A da reta R:");
        a = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Digite o valor de B da reta R:");
        b = Double.parseDouble(input);

        input = JOptionPane.showInputDialog("Digite o valor de C da reta R:");
        c = Double.parseDouble(input);

        do {
            input = JOptionPane.showInputDialog("Digite o valor de Xo do ponto P (digite '0' para encerrar):");
            xo = Double.parseDouble(input);

            if (xo != 0) {
                input = JOptionPane.showInputDialog("Digite o valor de Yo do ponto P:");
                yo = Double.parseDouble(input);

                d = Math.abs(a*xo + b*yo + c)/Math.sqrt(a*a + b*b);

                JOptionPane.showMessageDialog(null, "Distância entre P(" + xo + ", " + yo + ") e a reta R: " + d);
            }
        } while (xo != 0 && d != 0);

        JOptionPane.showMessageDialog(null, "Coordenadas do ponto coincidente: (" + xo + ", " + yo + ")");
    }
}
