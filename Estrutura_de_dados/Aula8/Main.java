package Estrutura_de_dados.Aula8;
public class Main {

    public static void main(String[] args) {
        // Criação dos nós da árvore
        No raiz = new No(4);
        No no2 = new No(2);
        No no3 = new No(6);
        No no4 = new No(1);
        No no5 = new No(3);
        No no6 = new No(5);
        No no7 = new No(7);
        No no8 = new No(0);

        // Montagem da estrutura da árvore
        raiz.esquerda = no2;
        raiz.direita = no3;
        no2.direita = no5;
        no3.esquerda = no6;
        no3.direita = no7;
        no6.esquerda = no4;
        no6.direita = no8;

        // Exibição dos elementos da árvore em ordem
        percorrerEmOrdem(raiz);

        // Verificação se a árvore está equilibrada
        boolean estaEquilibrada = verificarEquilibrio(raiz);
        System.out.println("A árvore está equilibrada? " + estaEquilibrada);
    }


    public static boolean verificarEquilibrio(No no) {
        if (no == null) {
            
            return true; // Árvore vazia é considerada equilibrada
        }

        int alturaEsquerda = calcularAltura(no.esquerda);
        int alturaDireita = calcularAltura(no.direita);

        int diferencaAltura = Math.abs(alturaEsquerda - alturaDireita);

        if (diferencaAltura <= 1 && verificarEquilibrio(no.esquerda) && verificarEquilibrio(no.direita)) {
            return true;
        }

        return false;
    }

    public static int calcularAltura(No no) {
        if (no == null) {
            return 0; // Nó nulo tem altura 0
        }

        int alturaEsquerda = calcularAltura(no.esquerda);
        int alturaDireita = calcularAltura(no.direita);

        return Math.max(alturaEsquerda, alturaDireita) + 1;
    }

}

class No {
    int valor;
    No esquerda;
    No direita;

    public No(int valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }
}
