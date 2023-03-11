package Aula_2;
import javax.swing.JOptionPane;
// O `.` (ponto) define hierarquia de pastas em java

public class ArrendondaPraCima{
    public static void main(String args[]){
        final float LOTACAO_ONIBUS = 50; // `final` define uma contante no código
        float qtdOnibus;
        String s;
        int numeroPassageiros;
        
        s = JOptionPane.showInputDialog("quantos passageiros?");
        numeroPassageiros = Integer.parseInt(s);

        qtdOnibus = numeroPassageiros / LOTACAO_ONIBUS;

        JOptionPane.showMessageDialog(null,
            "Quantidade de passageiros = " + numeroPassageiros + "\n" +
            "Quantidade de Ônibus calculada = " + qtdOnibus + "\n" +
            "Quantidade de Ônibus necessária = " + (int) Math.ceil(qtdOnibus));//Arrendonda SEMPRE para MAIS 
    }
}