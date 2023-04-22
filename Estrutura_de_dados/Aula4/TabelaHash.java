package Estrutura_de_dados.Aula4;

import java.util.HashMap;

public class TabelaHash {
    public static void main(String[] args) {
        // Cria uma nova tabela hash que mapeia nomes de frutas a seus preços
        HashMap<String, Double> tabelaPrecoFrutas = new HashMap<>();

        // Adiciona alguns pares de chave-valor à tabela hash
        tabelaPrecoFrutas.put("mangostao", 5.50);
        tabelaPrecoFrutas.put("uva", 3.00);
        tabelaPrecoFrutas.put("laranja", 2.00);

        // Recupera o preço da uva da tabela hash e imprime o preço da uva
        System.out.println("O preço da maçã é: R$" + tabelaPrecoFrutas.get("uva"));

        // Verifica se a tabela hash contém uma chave específica
        boolean contem = tabelaPrecoFrutas.containsKey("maçã");

        // Imprime se a tabela hash contém a banana
        System.out.println("A tabela de preços contém a banana? " + contem);
    }
}
