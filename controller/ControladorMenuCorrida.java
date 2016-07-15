import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ControladorMenuCorrida {

  private MenuCorrida menuCorrida;
  private GerenciadorEventos gerenciadorEventos;
  public String caminhoArquivo;
  public Cronometro cronometro;
  public HashMap<String, ArrayList<String>> corredores;
  public ArrayList<Corredor> corredoresCadastrados;
  public GestorCorrida gestorCorrida;



  public ControladorMenuCorrida() {
    super();
    this.gerenciadorEventos = new GerenciadorEventos(this);
    this.menuCorrida = new MenuCorrida();
    this.cronometro =  new Cronometro(menuCorrida.getRotuloCronometro());
  }

  public void setarCorredores(ArrayList<Corredor> corredores) {
    this.corredoresCadastrados = corredores;
    this.cronometro.setarCorredores(corredores);
    this.gestorCorrida = new GestorCorrida(this.cronometro, this.corredoresCadastrados);
  }

  public void mostrarMenu(HashMap<String, ArrayList<String>> corredores) {
    this.menuCorrida.mostrar();
    this.menuCorrida.criarBotoesCorredores(corredoresCadastrados, gerenciadorEventos);
    this.menuCorrida.addActionListners(gerenciadorEventos);
  }

  public void esconderMenu() {
    this.menuCorrida.esconder();
  }


  private class GerenciadorEventos implements ActionListener {

    private ControladorMenuCorrida controladorMenuCorrida;
    private ControladorCadastros controladorCadastros;

    public GerenciadorEventos(ControladorMenuCorrida controladorMenuCorrida) {
      this.controladorMenuCorrida = controladorMenuCorrida;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

      if (e.getActionCommand().equals(MenuCorrida.INICIAR_CORRIDA)) {
        cronometro.avancar();
      } else if (e.getActionCommand().equals(MenuCorrida.PARAR)) {
        cronometro.pausar();
      } else if (e.getActionCommand().equals(MenuCorrida.FINALIZAR)) {
        controladorMenuCorrida.gestorCorrida.resultado();
        // controladorMenuCorrida.esconderMenu();
      }
      else if (e.getActionCommand().equals("1")) {
        controladorMenuCorrida.gestorCorrida.saveCorredor("1");
      }
      else if (e.getActionCommand().equals("2")) {
        controladorMenuCorrida.gestorCorrida.saveCorredor("2");
      }
      else if (e.getActionCommand().equals("3")) {
        controladorMenuCorrida.gestorCorrida.saveCorredor("3");
      }
      else if (e.getActionCommand().equals("4")) {
        controladorMenuCorrida.gestorCorrida.saveCorredor("4");
      }
      else if (e.getActionCommand().equals("5")) {
        controladorMenuCorrida.gestorCorrida.saveCorredor("5");
      }
      else if (e.getActionCommand().equals("6")) {
        controladorMenuCorrida.gestorCorrida.saveCorredor("6");
      }
      else if (e.getActionCommand().equals("7")) {
        controladorMenuCorrida.gestorCorrida.saveCorredor("7");
      }
      else if (e.getActionCommand().equals("8")) {
        controladorMenuCorrida.gestorCorrida.saveCorredor("8");
      }
      else if (e.getActionCommand().equals("9")) {
        controladorMenuCorrida.gestorCorrida.saveCorredor("9");
      }
    }
  }
}
