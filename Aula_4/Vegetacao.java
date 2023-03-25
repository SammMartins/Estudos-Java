class Vegetacao{
  private int densidade;
  private boolean animaisVisiveis;
  
  public void setDensidade(int a){
    densidade = a;
  }

  public void setAnimaisVisiveis(){
    animaisVisiveis = !animaisVisiveis;
  }

  public int getDensidade(){
    return densidade;
  }

  public String isAnimaisVisiveisOn(){
    if(animaisVisiveis){
      return "Há animais visíveis";
    } else{
      return "Não há animais visíveis";
    }
  }
}