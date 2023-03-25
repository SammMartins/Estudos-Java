class Arvore {
  private int altura;
  private boolean possuiFrutos;

  public int getAltura() {
    return altura;
  }

  public void setAltura(int newAltura) {
    altura = newAltura;
  }

  public boolean isPossuiFrutos() {
    return possuiFrutos;
  }

  public void setPossuiFrutosOn() {
    possuiFrutos = !possuiFrutos;
  }
}