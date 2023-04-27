package Estrutura_de_dados.Aula5.Recursao2;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Número da sequencia de Fibonacci: ");
        x = input.nextInt();

        recursaoFibonacci a = new recursaoFibonacci();

        System.out.println("O número " + x + "º de Fibonacci é " + a.calcularFibonacci(x));
        input.close();
    }
}
