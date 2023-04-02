package Aula_5;

public class Main {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor(32, "LG");
        Monitor m1 = new Monitor(26, "SAMSUNG");

        System.out.println("Tamanho da area da Tv: "+ tv1.getAreaTela());
        System.out.println("Marca do Monitor: "+ m1.getMarca());
    }
}

/* 
    Obs: Para compilar deve ser usado o comando: 
        javac Tela.java Monitor.java Televisor.java Main.java 
    ou o comando:
        javac *.java
*/