package Aula_5.Program_2;

public class Funcionario extends Pessoa{
    private String cargo;
    private Double salario;
    private Departamento departamento;

    public void setCargo(String a){
        cargo = a;
    }

    public void setSalario(Double a){
        salario = a;
    }

    public String getCargo(){
        return cargo;
    }

    public Double getSalario(){
        return salario;
    }
    public void setDepartamento(Departamento dept) {
        departamento = dept;
    }

    public Departamento getDepartamento() {
        return departamento;
    }
}
