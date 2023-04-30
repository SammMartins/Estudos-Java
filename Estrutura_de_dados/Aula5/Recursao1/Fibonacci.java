package Estrutura_de_dados.Aula5.Recursao1;

public class Fibonacci {
    private int v; // Variável que armazena o valor anterior de N
    private int N = 1; // Variável que armazena o número atual da sequencia de fibonacci
    private int o = 3; // Variável que armazena a posição de N na sequencia de fibonacci
    private int antN = 1; // Variável que armazena o número anterior a N na sequencia de fibonacci

    public int calc(int i) {
        v = N; // Recebe o valor de N antes do cálculo
        N = antN + N; // N recebe o valor seguinte da sequencia de fibonacci
        antN = v; // Recebe o valor de N antes do cálculo através de v
        if (o < i) {
            o++;
            calc(i); // Realiza a recursão enquanto a posição da sequencia não for alcançada
        } else
            return N;
        return N;
    }
}
/*
 * Adicionando classe Fibonacci que calcula a sequência de Fibonacci recursivamente.
 * 
 * A classe Fibonacci possui um método calc que recebe um inteiro i como
 * parâmetro e retorna o i-ésimo número da sequência de Fibonacci. O cálculo é
 * realizado de forma recursiva, utilizando as variáveis N, antN e v. A variável
 * N armazena o número atual da sequência, antN armazena o número anterior a N e
 * v armazena o valor de N antes do cálculo. A variável o é utilizada para
 * controlar a posição na sequência.
 * 
 * O método realiza uma recursão enquanto a posição da sequência não for
 * alcançada e, quando a posição é alcançada, retorna o valor de N.
 */
