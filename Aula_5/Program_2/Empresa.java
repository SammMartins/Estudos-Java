package Aula_5.Program_2;

public class Empresa {
    private String nome;
    private String endereco;
    
    private Departamento[] departamentos;

    public Empresa(String nome, String endereco, int qtdDepartamentos) {
        this.nome = nome;
        this.endereco = endereco;
        this.departamentos = new Departamento[qtdDepartamentos];
    }

    public void adicionarDepartamento(Departamento departamento, int indice) {
        this.departamentos[indice] = departamento;
    }



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
