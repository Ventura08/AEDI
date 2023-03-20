package Conteudo_6;

import javax.swing.*;

import static ShortcutFunctions.ShortcutFunctions.toDouble;

public class C06Ex11 {
    public static void main(String[] args) {
        JTextField firstTeam = new JTextField();
        JTextField secondTeam = new JTextField();
        JTextField firstTeamSets = new JTextField();
        JTextField secondTeamSets = new JTextField();
        Object[] fields = {
                "Equipe 1: ", firstTeam,
                "Equipe 2: ", secondTeam,
                "Sets da Equipe 1: ", firstTeamSets,
                "Sets da equipe 2: ", secondTeamSets,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        final String result = "Resultado: \n" +
                finalScore(
                        firstTeam.getText(),
                        secondTeam.getText(),
                        toDouble(firstTeamSets.getText()),
                        toDouble(secondTeamSets.getText())
                );
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static String finalScore(String firstTeam, String secondTeam, double firstTeamSets, double secondTeamSets) {
        final boolean firstCondition =
                firstTeamSets == 3 && secondTeamSets == 0 ||
                firstTeamSets == 3 && secondTeamSets == 1;
        final boolean opositeFirstCondition =
                secondTeamSets == 3 && firstTeamSets == 0 ||
                secondTeamSets == 3 && firstTeamSets == 1;
        final boolean secondCondition = firstTeamSets == 3 && secondTeamSets == 2;
        final boolean opositeSecondCondition = firstTeamSets == 2 && secondTeamSets == 3;
        if(firstCondition){
            return firstTeam + " ganhou " + 3 + "pontos e a " + secondTeam +
                    " ganhou " + 0 + " pontos ";
        }else if(opositeFirstCondition){
            return firstTeam + " ganhou " + 0 + "pontos e a " + secondTeam +
                    " ganhou " + 3 + " pontos ";
        }else if(secondCondition) {
            return firstTeam + " ganhou " + 2 + "pontos e a " + secondTeam +
                    " ganhou " + 1 + " pontos ";
        } else if (opositeSecondCondition) {
            return firstTeam + " ganhou " + 1 + " pontos e a " + secondTeam +
                    " ganhou " + 2 + " pontos ";
        }else {
            return "Placa invalido";
        }
    }
}
