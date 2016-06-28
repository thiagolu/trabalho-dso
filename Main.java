import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Main{
  public static void main(String[] sdsd)  {
     new Main();
  }

  Main() {
    ImportadorCSV imp = new ImportadorCSV();
    imp.importarCSV();


    JFrame f = new JFrame();
    JPanel tela = new JPanel();
    f.setContentPane(tela);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel rotulo = new JLabel("0");
    Cronometro cronometro = new Cronometro(rotulo);
    GestorCronometro gestorCronometro;
    gestorCronometro = new GestorCronometro(cronometro);


    TelaInicial telaInicial = new TelaInicial();
    telaInicial.setVisible(true);
    telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }



}
