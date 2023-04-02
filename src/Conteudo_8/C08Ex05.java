package Conteudo_8;

import javax.swing.*;
public class C08Ex05 {
    public static void main(String[] args) {
        JComboBox<Object> candidate = new JComboBox<>(new String[]{"Fulano", "Ciclano", "Beltrano"});
        int fulanoVotes = 0;
        int ciclanoVotes = 0;
        int beltranoVotes = 0;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            Object[] fields = {
                    "Escolha seu voto" + (i + 1) + ": ", candidate,
            };
            JOptionPane.showConfirmDialog(
                    null,
                    fields,
                    "",
                    JOptionPane.OK_CANCEL_OPTION);
            if (candidate.getSelectedIndex() == 0) {
                fulanoVotes++;
            } else if (candidate.getSelectedIndex() == 1) {
                ciclanoVotes++;
            } else {
                beltranoVotes++;
            }
        }
        result.append("Votos em Fulano: ")
                .append(fulanoVotes)
                .append("\n")
                .append("Votos em Ciclano: ")
                .append(ciclanoVotes)
                .append("\n")
                .append("Votos em Beltrano: ")
                .append(beltranoVotes);
        JOptionPane.showMessageDialog(
                null,
                result.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
