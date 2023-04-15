package Aula_6;

public class Roupa {
    private char tamanho;
    private String cor;
    private String estilo;

    public void setTamanho(char a) {
        tamanho = a;
    }

    public void setCor(String a) {
        cor = a;
    }

    public void setEstilo(String a) {
        estilo = a;
    }

    public String getCor() {
        return cor;
    }

    public String getEstilo() {
        return estilo;
    }

    public char getTamanho() {
        return tamanho;
    }
}
