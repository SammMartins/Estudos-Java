/*Crie um programa que declare um vetor de inteiros com 5 elementos. Em seguida, 
preencha o vetor com valores digitados pelo usuário e, por fim, imprima o vetor na tela.
Dica: você pode usar a classe Scanner para ler os valores digitados pelo usuário.  */

package Estrutura_de_dados.Aula1;

import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i+1) + "º número:");
            vetor[i] = input.nextInt();
        }
        for(int i = 0; i <vetor.length;i++){
            System.out.print("Elemento "+(i+1) + ":");
            System.out.println(" " + vetor[i]);
        }
        input.close();
    }

}
