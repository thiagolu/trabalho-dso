import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// cf. 'notas-de-aula/Cronometro.html'

class Main {
  public static void main(String[] sdsd)  {
     new Main();
  }

  Main() {
    JFrame f = new JFrame();
    JPanel tela = new JPanel();
    f.setContentPane(tela);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel rotulo = new JLabel("0");
    Cronometro cronometro = new Cronometro(rotulo);
    GestorCronometro gestorCronometro;
    gestorCronometro = new GestorCronometro(cronometro);

    mk_Tela(tela,rotulo,gestorCronometro);

    //f.setSize(300,400);
    f.setTitle("Cronometro");
    f.pack();
    f.setVisible(true);

  }
  //usando "borderlayout"
  void mk_Tela(JPanel tela, JLabel rotulo,
                  ActionListener listener) {
    tela.setLayout(new BorderLayout()); //ou
    //tela.setLayout(new BorderLayout(5,5)); //hgap x vgap
    //... espacamento de hgap na horizontal e de vgap na vertical.

    JPanel q;

    q = new JPanel();
    q.setLayout(new FlowLayout(FlowLayout.LEFT));
    tela.add(q,BorderLayout.NORTH);
    q.add(rotulo);

    q = new JPanel();
    q.setLayout(new FlowLayout(FlowLayout.LEFT));
    tela.add(q,BorderLayout.CENTER);
    mk_grupoCronometragem(q, listener);
  }
  void mk_grupoCronometragem(JPanel q, ActionListener listener) {
    JButton b;
    b = new JButton("Start");
    b = new JButton(">");
    q.add(b);
    b.addActionListener(listener);
    b.setActionCommand(GestorCronometro.INICIAR);

    b = new JButton("Stop");
    q.add(b);
    b.addActionListener(listener);
    b.setActionCommand(GestorCronometro.PARAR);

    b = new JButton("Save");
    q.add(b);
    b.addActionListener(listener);
    b.setActionCommand(GestorCronometro.SALVAR);

    b = new JButton("Load");
    q.add(b);
    b.addActionListener(listener);
    b.setActionCommand(GestorCronometro.CARREGAR);
    b = new JButton("-");
    q.add(b);
    b.addActionListener(listener);
    b.setActionCommand(GestorCronometro.PARAR);
  }

}//
