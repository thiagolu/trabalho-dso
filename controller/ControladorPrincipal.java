import java.util.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ControladorPrincipal {
  public static final String INICIAR_EVENTO = "Iniciar Evento";
  public static final String SELECIONAR_ARQUIVO = "Selecionar Arquivo";
  public static final String MOSTRAR_CORREDORES = "Mostrar Corredores";


  private MenuInicial menuInicial;
  private GerenciadorEventos gerenciadorEventos;
  public String caminhoArquivo;

  public ControladorPrincipal() {
    super();
    this.caminhoArquivo = "zero";
    this.gerenciadorEventos = new GerenciadorEventos(this);
    this.menuInicial = new MenuInicial(this);
  }

  public void mostrarMenu() {
      this.menuInicial.mostrar();
      this.menuInicial.addActionListners(gerenciadorEventos);
  }

  private class GerenciadorEventos implements ActionListener {
    private ControladorPrincipal controladorPrincipal;
    private ControladorMenuCorrida controladorMenuCorrida;
    private ControladorLeitorArquivos controladorLeitorArquivos;
    ControladorCadastros controladorCadastros;
    ArrayList<Corredor> corredores;

    public GerenciadorEventos(ControladorPrincipal controladorPrincipal) {
      this.controladorMenuCorrida = new ControladorMenuCorrida();
      this.controladorPrincipal = controladorPrincipal;
      this.controladorLeitorArquivos = new ControladorLeitorArquivos(controladorMenuCorrida);
      this.controladorCadastros = new ControladorCadastros();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

      if (e.getActionCommand().equals(INICIAR_EVENTO)) {
        controladorMenuCorrida.setarCorredores(corredores);
        controladorMenuCorrida.mostrarMenu(controladorLeitorArquivos.corredores);
        System.out.println(INICIAR_EVENTO);

      } else if (e.getActionCommand().equals(SELECIONAR_ARQUIVO)) {
          System.out.println(SELECIONAR_ARQUIVO);
          controladorLeitorArquivos.mostrarMenu();

        } else if (e.getActionCommand().equals(MOSTRAR_CORREDORES)) {
          corredores = controladorCadastros.cadastrarCorredores(controladorLeitorArquivos.corredores);
        }
          else {
            System.out.println("NADA");
          }
    }
  }
}
