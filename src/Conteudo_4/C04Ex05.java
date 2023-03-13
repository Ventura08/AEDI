package Conteudo_4;

import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;
import java.text.MessageFormat;
import java.util.Scanner;

public class C04Ex05 {
    public static void main(String[] args) {
        Scanner fileEntry = new Scanner(C04Ex05.class.getResourceAsStream("data.txt"));
       final String nome = fileEntry.nextLine();
       final String cpf = fileEntry.nextLine();
       final String registroGeral = fileEntry.nextLine();
       final String tituloDeEleitor = fileEntry.nextLine();
       final String carteiraDeMotorista = fileEntry.nextLine();
       final String salario = fileEntry.nextLine();
       final String empresa = fileEntry.nextLine();
       final String message = "FICHA FUNCIONAL DE: " + nome +
               " \n CPF .................. " + cpf +
               " \n C.I .................. " + registroGeral +
               " \n Titulo de Eleitor .................. " + tituloDeEleitor +
               " \n Carteira de Motorista ..................  " + carteiraDeMotorista +
               " \n Empresa .................. " + empresa +
               " \n Salario ..................  " + Double.parseDouble(salario);
       JOptionPane.showMessageDialog(null,
               message,
               "Aula de Java",
               JOptionPane.INFORMATION_MESSAGE);
        fileEntry.close();
    }
}
