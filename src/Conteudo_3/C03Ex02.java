package Conteudo_3;
import java.util.Scanner;

public class C03Ex02 {

// Fun��o: Calcula a m�dia de 3 n�meros inteiros

// Autor: Estevao Boaventura

    public static void main(String[] args) {

        long n1, n2, n3, soma;

        double media;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um n�mero: ");

        n1 = teclado.nextLong();

        System.out.print("Informe outro n�mero: ");

        n2 = teclado.nextLong();

        System.out.print("Informe mais um n�mero: ");

        n3 = teclado.nextLong();

        soma = n1 + n2 + n3;

        media = soma / 3.0;

        System.out.println("M�dia = " + media);

        teclado.close();

    }

}