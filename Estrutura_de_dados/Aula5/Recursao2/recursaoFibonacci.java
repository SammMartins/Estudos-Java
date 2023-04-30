package Estrutura_de_dados.Aula5.Recursao2;
//Classe da recursão
public class recursaoFibonacci {

    public int calcularFibonacci(int x) {
        if(x<=1){
            return x;
            
        }else{
            return calcularFibonacci(x-1) + calcularFibonacci(x-2); //Método que chama o método
        }
    }
}
