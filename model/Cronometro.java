import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Cronometro implements ActionListener {
  private int n = 0;
  public JLabel r;
  private Timer d; //disparos
  public ArrayList<Corredor> corredoresCadastrados;

  Cronometro(JLabel r) {
    this.r = r;
    d = new Timer(1, this);//periodos de 1 seg = 1000 ms
  }

  public void mostrarCorredorUm(){
    System.out.println(corredoresCadastrados);

  }

  public void setarCorredores(ArrayList<Corredor> corredoresCadastrados) {
    this.corredoresCadastrados = corredoresCadastrados;
    System.out.println(corredoresCadastrados);
  }

  public void disparar() {

    n = n + 1;
    System.out.println(n);
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
