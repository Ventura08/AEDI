package Conteudo_4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C04EX03 {
    public static void main(String[] args) {
        Scanner keyboardEntry = new Scanner(System.in);
        int[] multas = new int[3];
        double[] poluicao = new double[4];

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe o valor da " + (i + 1) + "ªmulta: ");
            multas[i] = keyboardEntry.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o valor da " + (i + 1) + "ºpoluição: ");
            poluicao[i] = keyboardEntry.nextDouble();
        }

        //System.out.println(Arrays.toString(multas));
        //System.out.println(Arrays.toString(poluicao));
        //System.out.println(
        //        "QUANTIDADE DE POLUENTE EMITIDO \n " +
        //        "Até " + poluicao[0] + " multa de R$" + multas[0] + "\n" +
        //                "Entre " + poluicao[1] + " e " + poluicao[2] + " multa de R$" + multas[1] + "\n" +
        //            "Acima de " + poluicao[3] + " multa de R$ " + multas[2] + " por poluente emitido"
        //
        //);

        keyboardEntry.close();
    }
}
