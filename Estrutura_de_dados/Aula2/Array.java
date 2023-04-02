/*Faça um programa em Java que leia um array unidimensional de números inteiros de tamanho 10 
e calcule a média aritmética desses números. Em seguida, o programa deve imprimir todos os 
elementos do array que são maiores do que a média calculada. */

package Estrutura_de_dados.Aula2;

import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        int soma = 0, media = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            soma += array[i];
        }

        media = soma / array.length;
        System.out.print("Maiores que a média:");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > media) {
                System.out.print(" " + array[i]);
            }
        }
        input.close();
    }
}
