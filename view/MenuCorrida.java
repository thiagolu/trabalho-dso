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

    JButton b;

    b = new JButton("Save Corredor 1");
    container.add(b);
    b.setActionCommand("sal");

    b = new JButton("Save Corredor 2");
    container.add(b);
    b.setActionCommand("sal");

    b = new JButton("Save Corredor 3");
    container.add(b);
    b.setActionCommand("sal");

    b = new JButton("Save Corredor 4");
    container.add(b);
    b.setActionCommand("sal");

  }

  public void addActionListners(ActionListener e){
    btStart.setActionCommand("Iniciar Corrida");
    btStart.addActionListener(e);
    btStop.setActionCommand("Parar");
    btStop.addActionListener(e);
    btFinalizar.setActionCommand("Finalizar");
    btFinalizar.addActionListener(e);
  }


}
