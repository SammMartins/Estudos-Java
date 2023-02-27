/*Você deve fazer um programa que leia um valor qualquer e apresente uma
 * mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75],
 * (75,100]) este valor se encontra. Obviamente se o valor não estiver em nenhum
 * destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
 * 
 * O símbolo ( representa "maior que". Por exemplo:
 * [0,25] indica valores entre 0 e 25.0000, inclusive eles.
 * (25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000
 * 
 * Entrada
 * O arquivo de entrada contém um número com ponto flutuante qualquer.
 * 
 * Saída
 * A saída deve ser uma mensagem conforme exemplo abaixo.*/
package quest_beecrowd;

import java.util.Scanner;

public class BEE1036 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        int[] intervalo1 = new int[2];
        intervalo1[0] = 0;
        intervalo1[1] = 25;

        int[] intervalo2 = new int[2];
        intervalo2[0] = 25;
        intervalo2[1] = 50;

        int[] intervalo3 = new int[2];
        intervalo3[0] = 50;
        intervalo3[1] = 75;

        int[] intervalo4 = new int[2];
        intervalo4[0] = 75;
        intervalo4[1] = 100;

        double valor = input.nextDouble();

        if (valor >= intervalo1[0] && valor <= intervalo1[1]) {
            System.out.println("Intervalo [0,25]");
        } else if (valor >= intervalo2[0] && valor <= intervalo2[1]) {
            System.out.println("Intervalo (25,50]");
        } else if (valor >= intervalo3[0] && valor <= intervalo3[1]) {
            System.out.println("Intervalo (50,75]");
        } else if (valor >= intervalo4[0] && valor <= intervalo4[1]) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
        input.close();
    }
}