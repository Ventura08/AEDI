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
            case "Am�rica", "Atl�tico", "Cruzeiro", "Villa Nova":
                result = "Minas Gerais";
                break;
            case "Botafogo", "Flamengo", "Fluminense", "Vasco":
                result = "Minas Gerais";
                break;
            case "Corinthians", "Palmeiras", "Santos", "S�o Paulo":
                result = "Minas Gerais";
                break;
            case "Gr�mio", "Internacional", "Juventude":
                result = "Minas Gerais";
                break;
            case "N�utico", "Santa Cruz", "Sport":
                result = "Minas Gerais";
                break;
            default:
                result = "Time inv�lido!";
                break;
        }
        JOptionPane.showMessageDialog(
                null,
                result,
                "Resultado",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
