package Aula_5;

public class Tela {
    private int areaTela;
    private String marca;

    public Tela(int a, String b){
        areaTela = a;
        marca = b;
    }

    public void setAreaTela(int a){
        areaTela = a;
    }

    public void setMarca(String a){
        marca = a;
    }

    public int getAreaTela(){
        return areaTela;
    }

    public String getMarca(){
        return marca;
    }
}
