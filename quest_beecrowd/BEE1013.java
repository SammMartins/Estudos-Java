/*Faça um programa que leia três valores e apresente o maior dos três valores lidos 
seguido da mensagem “eh o maior”. Utilize a fórmula:
maiorAB = (a + b + abs( a - b )) / 2 


Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, 
portanto é necessário para chegar no resultado esperado.

Entrada:
O arquivo de entrada contém três valores inteiros.

Saída:
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior". */

package quest_beecrowd;

import java.util.Scanner;

public class BEE1013 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int maiorAB = (a + b + Math.abs(a - b)) / 2;
        // A função Math.abs retorna o valor absoluto de um número.
        // Ou seja, se o número é positivo, a função retorna o próprio número.
        // Se o número é negativo, a função retorna o valor dele em módulo (sem o sinal
        // negativo).

        int maiorInt = (c + maiorAB + Math.abs(c - maiorAB)) / 2;
        // A fórmula maiorInt = (c + maiorAB + Math.abs(c - maiorAB)) / 2 é uma forma de
        // determinar o maior número entre dois valores, sem precisar de estruturas
        // condicionais (como o if). O termo Math.abs() calcula o valor absoluto da
        // diferença entre dois valores, que é sempre um número positivo. Ao somar este valor
        // com a e b e dividir por 2, a fórmula retorna o maior número entre os dois valores.

        System.out.println(maiorInt + " eh o maior");

        input.close();
    }
}
