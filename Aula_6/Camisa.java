package Aula_6;

public class Camisa extends Roupa implements RoupaInterface {
    private String estiloGola;

    public String getEstiloGola() {
        return this.estiloGola;
    }

    public void setEstiloGola(String a) {
        this.estiloGola = a;
    }

    public Camisa() {
        super.setEstilo("Formal");
    }

    @Override
    public String mostraTudo() {
        return "Estilo: " + getEstilo() + "Cor: " + getCor() + "Tamanho: " + getTamanho() + "Gola: " + getEstiloGola();
    }

}
