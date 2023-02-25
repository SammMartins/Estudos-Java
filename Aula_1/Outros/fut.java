/*Usando a classe Scanner para entrada de dados, 
faça uma classe que receba dois valores inteiro. 
O primeiro valor corresponde à quantidade de pontos do líder do campeonato brasileiro de futebol. 
O segundo valor corresponde à quantidade de pontos do time lanterna.
Considerando que cada vitória vale 3 pontos e que o líder não ganhará mais nenhuma partida, 
elabore uma classe que calcule o número de vitórias necessárias para que o time lanterna alcance 
(ou ultrapasse) o líder*/

import java.util.Scanner;
class fut{
    
    public static void main(String args[]) {
        
        Scanner teclado = new Scanner(System.in);
            int lider,lanterna,vit;

            System.out.print("Digite a pontuaçao do Lider: ");
            lider = teclado.nextInt();

            System.out.print("Digite a pontuaçao do Lanterna: ");
            lanterna = teclado.nextInt();

            vit = (lider - lanterna)/3;

            System.out.println("Faltam " + vit + " vitorias.");

            teclado.close();
        
    }
}