package Conteudo_12;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

import static ShortcutFunctions.ShortcutFunctions.toDouble;

public class C12Ex06 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        ArrayList<String> meses = new ArrayList<>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");
        meses.add("Julho");
        meses.add("Agosto");
        meses.add("Setembro");
        meses.add("Outubro");
        meses.add("Novembro");
        meses.add("Dezembro");
        Collections.reverse(meses);
        result.append(meses);
        JOptionPane.showMessageDialog(null, result.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
