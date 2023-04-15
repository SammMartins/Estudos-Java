package Aula_6;

public class Camiseta extends Roupa implements RoupaInterface {
    public Camiseta() {
        super.setEstilo("Informal");
    }

    @Override
    public String mostraTudo() {
        return "Estilo: " + getEstilo() + "Cor: " + getCor() + "Tamanho: " + getTamanho();
    }
}
