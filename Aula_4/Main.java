import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a;


    
    Cidade c1 = new Cidade();
    Ponte p1 = new Ponte();
    //Vegetacao veg1 = new Vegetacao();
    Via rod101 = new Via();

    System.out.println("\nSetar população da cidade: ");
    a = input.nextInt();
    c1.setQtPopulacao(a);

    System.out.println("\nQual o número de faixas da Rodovia? ");
    a = input.nextInt();
    rod101.setNumFaixas(a);
    
    System.out.println("\nSetar altura da ponte: ");
    a = input.nextInt();
    p1.setAltura(a);

    System.out.println("\nPopulação da cidade: " + c1.getQtPopulacao());
    System.out.println("\nNúmero de faixas da Rodovia: " + rod101.getNumFaixas());
    System.out.println("\nAltura da ponte: " + p1.getAltura());

    input.close();
  }

}