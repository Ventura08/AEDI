package Conteudo_10;

import javax.swing.*;

public class C10Ex07 {
    public static void main(String[] args) {
        int totalPopulacao = 0, totalInfectados = 1;
        double taxa = 0.003;
        int dias = 0, meses = 0, anos = 0;

        // Loop para garantir que o usu�rio informe um valor v�lido para o total de pessoas
        do {
            totalPopulacao = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de pessoas na regi�o: "));
        } while (totalPopulacao <= 0);

        // Loop para calcular a quantidade de dias at� que toda a popula��o esteja infectada
        do {
            int novosInfectados = (int)(totalInfectados * taxa);
            totalInfectados += novosInfectados;
            dias++;

            if (dias == 30) {
                meses++;
                dias = 0;
            }

            if (meses == 12) {
                anos++;
                meses = 0;
            }

        } while (totalInfectados < totalPopulacao);

        JOptionPane.showMessageDialog(null, "Ser�o necess�rios " + anos + " anos, " + meses + " meses e " + dias + " dias para infectar toda a popula��o.");
    }
}
