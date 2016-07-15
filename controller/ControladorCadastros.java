import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ControladorCadastros {

  public ArrayList<Corredor> corredores;

  public ControladorCadastros() {
    this.corredores = new ArrayList<Corredor>();
  }

  public ArrayList<Corredor> cadastrarCorredores(HashMap<String, ArrayList<String>>  cadastroCorredores) {
    System.out.println("Cadastrar Corredores");

    Corredor corredor;

    for (String e : cadastroCorredores.keySet() ) {
      String nome = cadastroCorredores.get(e).get(0);
      String idade = cadastroCorredores.get(e).get(1);
      corredor = new Corredor(nome.replace("\"", ""), e.replace("\"", ""), idade.replace("\"", ""));
      corredores.add(corredor);
    }

    return corredores;
  }

}
