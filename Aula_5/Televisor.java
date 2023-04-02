package Aula_5;

public class Televisor extends Tela{
    private boolean altoFalante;

    public Televisor(int a, String b){
        super(a,b);
        altoFalante = true;
    }

    public void setAltoFalanteOff(){
        altoFalante = !altoFalante;
    }

    public boolean isAltoFalanteOn(){
        return altoFalante;
    }
}
