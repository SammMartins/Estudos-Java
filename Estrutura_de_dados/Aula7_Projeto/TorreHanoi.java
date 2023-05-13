package Estrutura_de_dados.Aula7_Projeto;
public class TorreHanoi {
    public static void main(String[] args) {
        int discos = 6;
        char torreOriginal = 'A';
        char torreDestino = 'C';
        char hasteAuxiliar = 'B';

        System.out.println("Resolvendo a Torre de Hanói com " + discos + " discos:");

        resolverTorreDeHanoi(discos, torreOriginal, torreDestino, hasteAuxiliar);
    }

    public static void resolverTorreDeHanoi(int discos, char hasteOrigem, char hasteDestino, char hasteAuxiliar) {
        if (discos == 1) {
            digitar("Mover disco 1 de " + hasteOrigem + " para " + hasteDestino);
            return;
        }

        resolverTorreDeHanoi(discos - 1, hasteOrigem, hasteAuxiliar, hasteDestino);
        digitar("Mover disco " + discos + " de " + hasteOrigem + " para " + hasteDestino);
        pausa(3000);
        System.out.println("\n");
        resolverTorreDeHanoi(discos - 1, hasteAuxiliar, hasteDestino, hasteOrigem);
    }
    
    public static void digitar(String texto) {
        int velocidade = 90; // Tempo de pausa entre cada caractere (em milissegundos)
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            pausa(velocidade);
        }
        System.out.println();
    }

    public static void pausa(int milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
