package Conteudo_4;

import java.text.MessageFormat;
import java.util.Scanner;

public class C04Ex02 {
    // Autor: Estevao Boaventrua
    public static void main(String[] args) {
        Scanner keyboardEntry = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        final String nome = keyboardEntry.nextLine();
        System.out.print("Informe seu cpf: ");
        final String cpf = keyboardEntry.nextLine();
        System.out.print("Informe seu registro geral: ");
        final String registroGeral = keyboardEntry.nextLine();
        System.out.print("Informe seu titulo de eleitor: ");
        final String tituloDeEleitor = keyboardEntry.nextLine();
        System.out.print("Informe sua carteira de motorista: ");
        final String carteiraDeMotorista = keyboardEntry.nextLine();
        System.out.print("Informe seu salario: ");
        final double salario = keyboardEntry.nextDouble();
        System.out.print("Informe seu empresa: ");
        keyboardEntry.nextLine();
        final String empresa = keyboardEntry.nextLine();

        System.out.printf(
                "FICHA FUNCIONAL DE: " + nome +
                        " \n CPF .................. " + cpf +
                        " \n C.I .................. " + registroGeral +
                        " \n Titulo de Eleitor .................. " + tituloDeEleitor +
                        " \n Carteira de Motorista ..................  " + carteiraDeMotorista +
                        " \n Empresa .................. " + empresa +
                        " \n Salario ..................  " + salario
                );

        keyboardEntry.close();
    }
}
