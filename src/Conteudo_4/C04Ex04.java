package Conteudo_4;

import javax.swing.JOptionPane;
import java.text.MessageFormat;
import java.util.Scanner;

public class C04Ex04 {
    public static void main(String[] args) {
        System.out.print("Informe seu primeiro nome: ");
        final String firstName = JOptionPane.showInputDialog(
                null,
                "Qual seu primeiro nome?",
                "Exercicio 04",
                JOptionPane.QUESTION_MESSAGE);
        System.out.print("Informe seu nome do meio: ");
        final String middleName = JOptionPane.showInputDialog(
                null,
                "Qual seu nome do meio?",
                "Exercicio 04",
                JOptionPane.QUESTION_MESSAGE);
        System.out.print("Informe seu sobrenome: ");
        final String lastName = JOptionPane.showInputDialog(
                null,
                "Qual se sobrenome?",
                "Exercicio 04",
                JOptionPane.QUESTION_MESSAGE);
        System.out.print("Informe sua idade: ");
        final String userAge = JOptionPane.showInputDialog(
                null,
                "Qual sua idade?",
                "Exercicio 04",
                JOptionPane.QUESTION_MESSAGE);
        final String message = MessageFormat.format(
                "{0}, {1} {2} \n Idade: {3} anos",
                lastName,
                firstName,
                middleName,
                userAge
        );
        JOptionPane.showMessageDialog(
                null,
                message,
                "Exercicio 4",
                JOptionPane.INFORMATION_MESSAGE);
    }}
