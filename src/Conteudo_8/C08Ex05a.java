package Conteudo_8;

import javax.swing.*;
import java.util.Objects;

public class C08Ex05a {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        JComboBox<Object> candidate = generateField(0, 0, 0);
        int fulanoVotes = 0;
        int ciclanoVotes = 0;
        int beltranoVotes = 0;
        result.append("O vencedor foi: ").append(makeVotation(fulanoVotes, ciclanoVotes, beltranoVotes, candidate));
        JOptionPane.showMessageDialog(
                null,
                result.toString(),
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static String makeVotation(int fulanoVotes, int ciclanoVotes, int beltranoVotes, JComboBox<Object> candidate) {
        for (int i = 0; i < 4; i++) {
            Object[] fields = {
                    "Escolha seu voto" + (i + 1) + ": ", candidate,
            };
            JOptionPane.showConfirmDialog(
                    null,
                    fields,
                    "",
                    JOptionPane.OK_CANCEL_OPTION);
            if (Objects.requireNonNull(candidate.getSelectedItem()).toString().equalsIgnoreCase("Fulano")) {
                fulanoVotes++;
            } else if (candidate.getSelectedItem().toString().equalsIgnoreCase("Ciclano")) {
                ciclanoVotes++;
            } else {
                beltranoVotes++;
            }
        }
        if (checkIfThereIsBigger(fulanoVotes, ciclanoVotes, beltranoVotes).length() > 0) {
            return checkIfThereIsBigger(fulanoVotes, ciclanoVotes, beltranoVotes);
        } else {
            JComboBox<Object> field = generateField(fulanoVotes, ciclanoVotes, beltranoVotes);
            fulanoVotes = 0;
            ciclanoVotes = 0;
            beltranoVotes = 0;
            return makeVotation(fulanoVotes, ciclanoVotes, beltranoVotes, field);
        }

    }

    private static String checkIfThereIsBigger(int fulanoVotes, int ciclanoVotes, int beltranoVotes) {
        if (fulanoVotes > ciclanoVotes && fulanoVotes > beltranoVotes) {
            return "Fulano venceu com " + fulanoVotes + " votos";
        } else if (ciclanoVotes > fulanoVotes && ciclanoVotes > beltranoVotes) {
            return "Ciclano venceu com " + ciclanoVotes + " votos";
        } else if (beltranoVotes > fulanoVotes && beltranoVotes > ciclanoVotes) {
            return "Beltrano venceu com " + beltranoVotes + " votos";
        } else {
            return "";
        }
    }

    private static JComboBox<Object> generateField(int fulanoVotes, int ciclanoVotes, int beltranoVotes) {
        if(fulanoVotes != 0 || ciclanoVotes != 0 || beltranoVotes != 0){
            if (fulanoVotes == ciclanoVotes) {
                return new JComboBox<>(new String[]{"Fulano", "Ciclano"});
            } else if (fulanoVotes == beltranoVotes) {
                return new JComboBox<>(new String[]{"Fulano", "Beltrano"});
            } else if (ciclanoVotes == beltranoVotes) {
                return new JComboBox<>(new String[]{"Ciclano", "Beltrano"});
            }
        }
        return new JComboBox<>(new String[]{"Fulano", "Ciclano", "Beltrano"});
    }
}
