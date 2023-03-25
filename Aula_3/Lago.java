class Lago {
  private boolean possuiPatos;
  private int profundidade;

  public boolean isPossuiPatos() {
    return possuiPatos;
  }

  public void setPossuiPatosOn() {
    possuiPatos = !possuiPatos;
  }

  public int getProfundidade() {
    return profundidade;
  }

  public void setProfundidade(int newProfundidade) {
    profundidade = newProfundidade;
  }
}