import java.util.*;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MenuCorrida extends JFrame {

  public static final String INICIAR_CORRIDA ="Iniciar Corrida";
  public static final String PARAR = "Parar";
  public static final String FINALIZAR = "Finalizar";

  private Container container;

  private JLabel rotulo;
  private JLabel rotuloCronometro;
  private JLabel rotuloCorredores;

  private JButton btStart;
  private JButton btStop;
  private JButton btFinalizar;
  private JButton btCorredorUm;
  private JButton btCorredorDois;
  private JButton btCorredorTres;
  private JButton btCorredorQuatro;

  private Cronometro cronometro;

  public MenuCorrida() {

    this.container = getContentPane();
    setSize(300, 200);
    this.rotuloCronometro = new JLabel("00");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    inicializar();
  }

  public void mostrar(HashMap<String, ArrayList<String>> corredores) {
    this.rotuloCorredores = new JLabel(corredores.toString());
    container.add(rotuloCorredores);
    this.setVisible(true);
  }

  public void esconder() {
    this.setVisible(false);
  }

  public JLabel getRotuloCronometro() {
    return rotuloCronometro;
  }

  public void inicializar(){

    container.setLayout(new FlowLayout());

    rotulo = new JLabel("Tempo: ");
    container.add(rotulo);
    container.add(rotuloCronometro);

    setLocationRelativeTo(null);


    setSize(500,550);
    setTitle("Menu Corrida");

    btStart = new JButton("Iniciar Corrida");
    btStart.setPreferredSize(new Dimension(150, 20));

    container.add(btStart);


    btStop = new JButton("Parar");
    btStop.setPreferredSize(new Dimension(150, 20));

    container.add(btStop);

    btFinalizar = new JButton("Finalizar");
    btFinalizar.setPreferredSize(new Dimension(150, 20));

    container.add(btFinalizar);

    btCorredorUm = new JButton("[ Parar corredor 1 ]");
    container.add(btCorredorUm);

    btCorredorDois = new JButton("[ Parar corredor 2 ]");
    container.add(btCorredorDois);

    btCorredorTres = new JButton("[ Parar corredor 3 ]");
    container.add(btCorredorTres);

    btCorredorQuatro = new JButton("[ Parar corredor 4 ]");
    container.add(btCorredorQuatro);

  }

  public void addActionListners(ActionListener e){
    btStart.setActionCommand("Iniciar Corrida");
    btStart.addActionListener(e);
    btStop.setActionCommand("Parar");
    btStop.addActionListener(e);
    btFinalizar.setActionCommand("Finalizar");
    btFinalizar.addActionListener(e);
    btCorredorUm.setActionCommand("1");
    btCorredorUm.addActionListener(e);
    btCorredorDois.setActionCommand("2");
    btCorredorDois.addActionListener(e);
    btCorredorTres.setActionCommand("3");
    btCorredorTres.addActionListener(e);
    btCorredorQuatro.setActionCommand("4");
    btCorredorQuatro.addActionListener(e);
  }
}
