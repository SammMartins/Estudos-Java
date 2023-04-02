package Aula_5.Program_2;

public class Pessoa {
    private int idade;
    private String nome;
    private String email;

    public void setIdade(int a){
        idade = a;
    }
    public void setNome(String a){
        nome = a;
    }
    public void setEmail(String a){
        email = a;
    }

    public int getIdade(){
        return idade;
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
}
