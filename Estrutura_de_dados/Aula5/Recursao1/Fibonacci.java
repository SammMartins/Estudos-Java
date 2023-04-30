package Estrutura_de_dados.Aula5.Recursao1;

public class Fibonacci {
    private int n = 1;

    public int calc(int i) {
        int o=1;
        n = (n - 1) + (n-2);
        if(o!=i){
            o++; calc(i);
        } 
        return n;
    }
} // F(n + 2) = F(n + 1) + F(n)
