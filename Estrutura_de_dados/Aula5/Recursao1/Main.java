package Estrutura_de_dados.Aula5.Recursao1;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Fibonacci fibonacci = new Fibonacci();
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Número desejado da sequência de Fibonacci: ");
        x = input.nextInt();

        System.out.print("O número " + x + "º da sequência de Fibonacci é " + fibonacci.calc(x));
        input.close();
    }

}
