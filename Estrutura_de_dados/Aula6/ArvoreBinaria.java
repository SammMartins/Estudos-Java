package Estrutura_de_dados.Aula6;

/* Começamos definindo a classe No com seus atributos e construtor. 
    Ela representa um nó da árvore binária e armazena um valor, 
    além de referências para seus nós filhos esquerdo e direito.*/
class No {
    int valor; // Valor armazenado no nó
    No esquerda; // Referência para o nó filho esquerdo
    No direita; // Referência para o nó filho direito

    public No(int valor) {
        this.valor = valor; // Atribui o valor passado ao nó
        this.esquerda = null; // Inicializa a referência do filho esquerdo como nula
        this.direita = null; // Inicializa a referência do filho direito como nula
    }
}

/* Em seguida, definimos a classe ArvoreBinaria que contém o método main como
   ponto de entrada do programa. */
public class ArvoreBinaria {

    /* Dentro do método main, criamos os nós da árvore em ordem aleatória,
       atribuindo a cada nó um valor.*/
    public static void main(String[] args) {
        // Criando os nós da árvore em ordem aleatória:
        No raiz = new No(4);
        No no2 = new No(2);
        No no3 = new No(6);
        No no4 = new No(1);
        No no5 = new No(3);
        No no6 = new No(5);
        No no7 = new No(7);

        /* Em seguida, montamos a estrutura da árvore, estabelecendo as relações entre os nós.
           Definimos que o nó 2 é filho esquerdo da raiz, o nó 3 é filho direito da
           raiz, o nó 4 é filho esquerdo do nó 2, o nó 5 é filho direito do nó 2, o nó 6 é filho
           esquerdo do nó 3 e o nó 7 é filho direito do nó 3. */
        raiz.esquerda = no2; // Nó 2 é filho esquerdo da raiz                      Raiz(4)
        raiz.direita = no3; // Nó 3 é filho direito da raiz                      /        \
        no2.esquerda = no4; // Nó 4 é filho esquerdo do nó 2                  No2(2)      No3(6)
        no2.direita = no5; // Nó 5 é filho direito do nó 2                   /    |       |     \
        no3.esquerda = no6; // Nó 6 é filho esquerdo do nó 3             No4(1)  No5(3) No6(5)  No7(7)                   
        no3.direita = no7; // Nó 7 é filho direito do nó 3                  

        /* Após montar a estrutura da árvore, chamamos o método percorrerEmOrdem
           passando a raiz como argumento. Esse método percorre a árvore em ordem, ou
           seja, primeiro visita o filho esquerdo, depois o nó atual e por último o
           filho direito.*/
        System.out.println("Elementos da árvore em ordem:");
        percorrerEmOrdem(raiz);
    }

    public static void percorrerEmOrdem(No no) {

        /* Dentro do método percorrerEmOrdem, verificamos se o nó passado
           como parâmetro não é nulo. Se não for nulo, chamamos recursivamente o método
           percorrerEmOrdem passando o filho esquerdo do nó.*/
        if (no != null) {
            percorrerEmOrdem(no.esquerda); // Percorre o filho esquerdo
            System.out.print(no.valor + " "); // Imprime o valor do nó
            /* depois disso, chamamos recursivamente o método percorrerEmOrdem passando o
               filho direito do nó.*/
            percorrerEmOrdem(no.direita); // Percorre o filho direito
        }
        /* Por fim, o programa imprime os elementos da árvore em ordem, ou seja, imprime
           os valores dos nós na sequência correta.*/
    }
}