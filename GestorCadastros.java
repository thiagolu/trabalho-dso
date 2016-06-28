import java.util.*;

class GestorCadastros {
  private ArrayList<Corredor> corredores;

  public GestorCadastros() {
    this.corredores = new ArrayList<Corredor>();
  }

  public ArrayList<Corredor> cadastrarCorredores(HashMap<String, ArrayList<String>>  cadastroCorredores) {
    Corredor corredor;

    for (String e : cadastroCorredores.keySet() ) {
      String nome = cadastroCorredores.get(e).get(0);
      String idade = cadastroCorredores.get(e).get(1);
      corredor = new Corredor(nome, e, idade);
      corredores.add(corredor);
    }

    return corredores;
  }
}
