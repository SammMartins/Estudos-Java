/*Uma farmácia precisa ajustar os preços de seus produtos em 12%. 
Elabore uma classe que receba o valor do produto e aplique o percentual de acréscimo. 
O novo valor a ser calculado deve ser arredondado para mais ou para menos usando o método round. 
A classe deve também conter um laço de repetição que encerre o programa quando o usuário fornecer 
o valor zero (0) para o valor do produto. Dessa forma, o usuário digita o valor do produto, 
a classe calcula e mostra o valor com acréscimo, a seguir solicita um novo valor. 
Esse processo continua enquanto o valor do roduto for diferente de zero; caso contrário o programa 
será encerrado.*/

package Aula_2;
// Importa a classe JOptionPane para exibir caixas de diálogo
import javax.swing.JOptionPane;
// Importa a classe NumberFormat para formatar valores numéricos
import java.text.NumberFormat;

public class ReCalc {
    public static void main(String[] args) {
        double valor;

        // Laço de repetição para manter o programa rodando enquanto o usuário não encerrá-lo
        while (true) {
            // Exibe uma caixa de diálogo solicitando o valor do produto
            String s = JOptionPane.showInputDialog(null, "Valor do Produto: ");
            try {
                // Converte o valor digitado para um número do tipo double
                valor = Double.parseDouble(s);
                // Verifica se o valor digitado é zero
                if (valor == 0) {
                    // Caso seja zero, exibe uma caixa de diálogo de confirmação para finalizar o programa ou não
                    int opt = JOptionPane.showConfirmDialog(null, "Deseja Finalizar?", "Confirmação",
                            JOptionPane.YES_NO_OPTION);
                    if (opt == JOptionPane.YES_OPTION) {
                        // Caso o usuário confirme, exibe uma mensagem de finalização e encerra o programa
                        JOptionPane.showMessageDialog(null, "Finalizando...");
                        break;
                    } else {
                        // Caso o usuário cancele, exibe uma mensagem de retorno ao programa e continua a execução
                        JOptionPane.showMessageDialog(null, "Retornando ao programa...");
                    }
                } else {
                    // Caso o valor digitado seja diferente de zero, cria uma instância de NumberFormat para formatar o valor como moeda do Brasil
                    NumberFormat nf = NumberFormat.getCurrencyInstance(); 
                    // Exibe uma caixa de diálogo com o valor reajustado do produto formatado como moeda do Brasil
                    JOptionPane.showMessageDialog(null, "Valor Reajustado: " + nf.format(valor *= 1.12)); 
                }
            } catch (NumberFormatException e) {
                // Caso o usuário digite um valor inválido (não numérico), exibe uma mensagem de erro
                JOptionPane.showMessageDialog(null, "Por favor, insira um valor numérico válido.");
            }
        }
    }
}