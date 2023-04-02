package Aula_5.Program_2;

public class Departamento {
    private String nome;
    private String endereco;

    Funcionario gerente = new Funcionario();

    public void setNome(String a){
        nome = a;
    }
    public String getNome(){
        return nome;
    }
    public void setEndereco(String a){
        endereco = a;
    }
    public String getEndereco(){
        return endereco;
    }
}
