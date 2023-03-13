package Conteudo_4;

import java.text.MessageFormat;
import java.util.Scanner;

public class C04Ex01 {
    // Autor: Estevao Boaventrua
    public static void main(String[] args) {
        Scanner kerboardEntry = new Scanner(System.in);
        System.out.print("Informe seu primeiro nome: ");
        final String firstName = kerboardEntry.nextLine();
        System.out.print("Informe seu nome do meio: ");
        final String middleName = kerboardEntry.nextLine();
        System.out.print("Informe seu sobrenome: ");
        final String lastName = kerboardEntry.nextLine();
        System.out.print("Informe sua idade: ");
        final int userAge = kerboardEntry.nextInt();
        System.out.printf(MessageFormat.format(
                "{0}, {1} {2} \n Idade: {3} anos",
                lastName,
                firstName,
                middleName,
                userAge
        ));

        kerboardEntry.close();
    }
}
