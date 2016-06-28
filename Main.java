import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// cf. 'notas-de-aula/Cronometro.html'

class Main {
  public static void main(String[] sdsd)  {
     new Main();
  }

  Main() {
    ImportadorCSV importador = new ImportadorCSV();

    GestorCadastros gestorCadastros = new GestorCadastros();
    ArrayList<Corredor> corredores = gestorCadastros.cadastrarCorredores(importador.importarCSV());
    System.out.println(corredores.get(0).nome);

    TelaInicial telaInicial = new TelaInicial();
  }

}//
