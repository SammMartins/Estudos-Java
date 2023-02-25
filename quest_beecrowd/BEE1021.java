/*Leia um valor de ponto flutuante com duas casas decimais. Este valor
 * representa um valor monetário. A seguir, calcule o menor número de notas e
 * moedas possíveis no qual o valor pode ser decomposto. As notas consideradas
 * são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. 
 * A seguir mostre a relação de notas necessárias.
 * 
 * Entrada
 * O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

 * Saída
 * Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor
 * inicial, conforme exemplo fornecido.
 * Obs: Utilize ponto (.) para separar a parte decimal.*/
package quest_beecrowd;

import java.util.Scanner;

public class BEE1021 {
    public static void main(String[] arg) {
        // criação de objetos para leitura de dados de entrada e formatação de saída:
        Scanner input = new Scanner(System.in);

        // leitura do valor monetário:
        double valor = input.nextDouble();

        // cálculo da quantidade de notas e moedas necessárias:
        int notas100 = (int) valor / 100; // (int) faz considera apenas os valores int do cálculo
        valor %= 100.0; // calcula o restante da divisão por 100 e atribui o restante à variável
        int notas50 = (int) valor / 50;
        valor %= 50.0;
        int notas20 = (int) valor / 20;
        valor %= 20.0;
        int notas10 = (int) valor / 10;
        valor %= 10.0;
        int notas5 = (int) valor / 5;
        valor %= 5.0;
        int notas2 = (int) valor / 2;
        valor %= 2.0;

        int moedas1 = (int) (valor / 1);
        valor %= 1.0;
        int moedas50 = (int) (valor / 0.5);
        valor %= 0.5;
        int moedas25 = (int) (valor / 0.25);
        valor %= 0.25;
        int moedas10 = (int) (valor / 0.10);
        valor %= 0.10;
        int moedas5 = (int) (valor / 0.05);
        valor %= 0.05;
        int moedas1c = (int) (valor / 0.01);

        // exibição do resultado:
        System.out.println("NOTAS:");
        System.out.printf("%d nota(s) de R$ 100.00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50.00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20.00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10.00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5.00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2.00\n", notas2);
        System.out.println("MOEDAS:");
        System.out.printf("%d moeda(s) de R$ 1.00\n", moedas1);
        System.out.printf("%d moeda(s) de R$ 0.50\n", moedas50);
        System.out.printf("%d moeda(s) de R$ 0.25\n", moedas25);
        System.out.printf("%d moeda(s) de R$ 0.10\n", moedas10);
        System.out.printf("%d moeda(s) de R$ 0.05\n", moedas5);
        System.out.printf("%d moeda(s) de R$ 0.01\n", moedas1c);

        input.close();
    }
}