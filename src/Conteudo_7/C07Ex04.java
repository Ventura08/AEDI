package Conteudo_7;

import javax.swing.*;

import static ShortcutFunctions.ShortcutFunctions.toInt;

public class C07Ex04 {
    public static void main(String[] args) {
        JTextField team = new JTextField();
        String result = "";
        Object[] fields = {
                "Time: ", team,
        };
        JOptionPane.showConfirmDialog(
                null,
                fields,
                "",
                JOptionPane.OK_CANCEL_OPTION);
        switch (team.getText()){
            case "América", "Atlético", "Cruzeiro", "Villa Nova":
                result = "Minas Gerais";
                break;
            case "Botafogo", "Flamengo", "Fluminense", "Vasco":
                result = "Minas Gerais";
                break;
            case "Corinthians", "Palmeiras", "Santos", "São Paulo":
                result = "Minas Gerais";
                break;
            case "Grêmio", "Internacional", "Juventude":
                result = "Minas Gerais";
                break;
            case "Náutico", "Santa Cruz", "Sport":
                result = "Minas Gerais";
                break;
            default:
                result = "Time inválido!";
                break;
        }
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
