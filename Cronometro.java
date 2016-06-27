import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//exem01
class Cronometro implements ActionListener {
  private int n = 0;
  private JLabel r;
  private javax.swing.Timer d; //disparos

  Cronometro(JLabel r) {
    this.r = r;
    d = new Timer(1, this);//periodos de 1 seg = 1000 ms
  }

  public void disparar() {

    n = n + 1;
    atualizar();
  }
  private boolean parado = true;
  void zerar() {
    n = 0;
    atualizar();
  }
  void avancar() {
    if (parado) d.start();
    parado = false;
  }
  void pausar() {
    if (!parado) d.stop();
    parado = true;
  }
  void atualizar() {
    ConversorTempo con = new ConversorTempo();

    r.setText(con.converter(n));
  }
  public void actionPerformed(ActionEvent e) {
       disparar();
  }

  private boolean debug = true;
  void debug(String msg) { if (debug) System.out.println(msg);}
}
