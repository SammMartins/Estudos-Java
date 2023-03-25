import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Arvore a1 = new Arvore();
    Lago l1 = new Lago();
    Passaro p1 = new Passaro();

    a1.setAltura(6);
    l1.setPossuiPatosOn();
    p1.setCor("Azul");

    System.out.println("Objetos: \n" +
        "Altura Árvores: " + a1.getAltura() + "\n" +
        "Possui Patos? " + l1.isPossuiPatos() + "\n" +
        "Cor do Pássaro: " + p1.getCor());

    int tamanho;
    System.out.println("\nSetar Tamanho Asa do Passaro: \n");
    tamanho = entrada.nextInt();
    p1.setTamanho(tamanho);

    System.out.println("Tamanho Asa: " + p1.getTamanhoAsa());
  }

}