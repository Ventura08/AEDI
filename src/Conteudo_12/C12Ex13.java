package Conteudo_12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C12Ex13 {
    public static void main(String[] args) {
        List<String> meses = new ArrayList<>();

        // Lendo os nomes dos meses
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes dos 12 meses do ano em ordem cronol�gica:");
        for (int i = 0; i < 12; i++) {
            String mes = scanner.nextLine();
            meses.add(mes);
        }

        // Ordenando em ordem alfab�tica
        Collections.sort(meses);

        // Imprimindo os meses em ordem alfab�tica
        System.out.println("Meses em ordem alfab�tica:");
        for (String mes : meses) {
            System.out.println(mes);
        }
    }
}
