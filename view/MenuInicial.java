import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MenuInicial extends JFrame {
  public static final String INICIAR_EVENTO = "Iniciar Evento";
  public static final String SELECIONAR_ARQUIVO = "Selecionar Arquivo";
  public static final String CADASTRAR_CORREDORES = "Cadastrar Corredores";


  private Container container;

  private JLabel lbNome;

  private JButton btIniciarEvento;
  private JButton btSelecionarArquivo;
  private JButton btMostrarCorredores;

  private ControladorPrincipal controladorPrincipal;

  public MenuInicial(ControladorPrincipal controladorPrincipal){
    this.container = getContentPane();
    this.controladorPrincipal = controladorPrincipal;

    setSize(300, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);

    inicializar();
  }

  public void mostrar() {
    this.setVisible(true);
  }

  public void esconder() {
    this.setVisible(false);
  }

  private void inicializar() {

    container.setLayout(new FlowLayout());

    lbNome = new JLabel("Tela Inicial");
    container.add(lbNome);

    btIniciarEvento = new JButton(INICIAR_EVENTO);
    btIniciarEvento.setPreferredSize(new Dimension(200,20));

    btSelecionarArquivo = new JButton(SELECIONAR_ARQUIVO);
    btSelecionarArquivo.setPreferredSize(new Dimension(200,20));

    btMostrarCorredores = new JButton(CADASTRAR_CORREDORES);
    btMostrarCorredores.setPreferredSize(new Dimension(200,20));
    btIniciarEvento.setActionCommand(btIniciarEvento.getText());
    btSelecionarArquivo.setActionCommand(btSelecionarArquivo.getText());
    btMostrarCorredores.setActionCommand(btMostrarCorredores.getText());


    container.add(btIniciarEvento);
    container.add(btSelecionarArquivo);
    container.add(btMostrarCorredores);

  }

  public void addActionListners(ActionListener e){
    btIniciarEvento.setActionCommand(INICIAR_EVENTO);
    btIniciarEvento.addActionListener(e);

    btSelecionarArquivo.setActionCommand(SELECIONAR_ARQUIVO);
    btSelecionarArquivo.addActionListener(e);

    btMostrarCorredores.setActionCommand(CADASTRAR_CORREDORES);
    btMostrarCorredores.addActionListener(e);
  }
}
