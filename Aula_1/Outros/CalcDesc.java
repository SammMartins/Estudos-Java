
/*Usando a classe BufferedReader para entrada de dados, 
crie uma classe que receba o valor de um produto e a percentagem de desconto, 
calcule e mostre o valor do desconto e o valor do produto com o desconto. 
Observação: o valor do desconto é calculado por meio da fórmula:
valor do desconto = valor do produto * percentual de desconto /100 */

import java.util.Scanner;
public class CalcDesc{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); //Entrada padrão do sistema
        
        float valor, desconto,valorDesc;

        System.out.print("Digite o valor do produto: "); //Saída padrão java
        valor = entrada.nextFloat();

        System.out.print("Digite a porcentagem do desconto: "); //Saída padrão java
        desconto = entrada.nextFloat();
        
        valorDesc = valor - (valor * desconto/100);
        System.out.println("O valor do desconto foi: R$"+ (valor * desconto/100));
        System.out.print("O valor do Produto com desconto é: R$" + valorDesc);
        entrada.close();
    }
}