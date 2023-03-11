/*Crie uma classe que simule a jogada de um dado de seis lados. 
Por 3 vezes. Ao final some seus valores e apresente o resultado das três jogadas.*/

package Aula_2;

import javax.swing.JOptionPane;

public class DadosFace6 {
    public static void main(String args[]) {
        int soma = 0, jogada;
        JOptionPane.showMessageDialog(null,
                "Clique no OK para jogar os dados...\n" + "Jogaremos 3 dados!");

        for (int i = 0; i < 3; i++) {
            jogada = (int) ((Math.random() * 6) + 1);
            JOptionPane.showMessageDialog(null,
                    (i + 1) + "ª " + "Jogada:\t " + jogada);
            soma += jogada;
        }
        JOptionPane.showMessageDialog(null,
                soma + " Foi sua pontução nos dados.");
    }
}
