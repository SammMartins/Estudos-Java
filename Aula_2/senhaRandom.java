/*Crie uma classe que gera um número aleatoriamente (entre 5 e 10) por Math.random. 
Em seguida, faça com que apareça em tela uma senha numérica contendo a mesma 
quantidade de dígitos correspondentes ao valor aleatório gerado. 
Por fim apresente na tela o número sorteado e a senha.*/


package Aula_2;
import javax.swing.JOptionPane;

public class senhaRandom {
    public static void main(String[] arg) {

        // Gera um número aleatório entre 5 e 10 (inclusivo) e o armazena em 'num'
        int num = (int) ((Math.random() * 6)) + 5;

        // Cria um array com o tamanho definido pelo número aleatório gerado
        int[] geraNum = new int[num];

        // Cria uma string vazia chamada 'senha'
        String senha = new String();

        // Percorre cada índice do array 'geraNum'
        for (int i = 0; i < num; i++) {

            // Gera um número aleatório entre 0 e 9 e o armazena no índice atual do array
            geraNum[i] = (int) (Math.random() * 10);

            // Converte o número inteiro em uma string e o armazena na variável 'valorString'
            String valorString = Integer.toString(geraNum[i]);

            // Concatena a string 'valorString' à string 'senha'
            senha = senha.concat(valorString);
        }

        // Exibe o número sorteado e a senha gerada em uma mensagem de diálogo
        JOptionPane.showMessageDialog(null, "Numero sorteado: " + num
                + "\nSenha Gerada: " + senha);
    }
}
