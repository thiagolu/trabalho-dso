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
    System.out.println(corredores);
    this.menuCorrida.mostrar(corredores);
    this.corredores = corredores;
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
        System.out.println("Iniciar CoRRida");
        cronometro.avancar();
      } else if (e.getActionCommand().equals(MenuCorrida.PARAR)) {
          System.out.println("Parar");
          cronometro.pausar();
        } else if (e.getActionCommand().equals(MenuCorrida.FINALIZAR)) {
            controladorMenuCorrida.gestorCorrida.resultado(controladorMenuCorrida.corredores);
            // controladorMenuCorrida.esconderMenu();
          }
          else if (e.getActionCommand().equals("1")) {
            controladorMenuCorrida.gestorCorrida.saveCorredorUm();
           }
          else if (e.getActionCommand().equals("2")) {
            controladorMenuCorrida.gestorCorrida.saveCorredorDois();
          }
          else if (e.getActionCommand().equals("3")) {
            controladorMenuCorrida.gestorCorrida.saveCorredorTres();
          }
          else if (e.getActionCommand().equals("4")) {
            controladorMenuCorrida.gestorCorrida.saveCorredorQuatro();
          }

          else if (e.getActionCommand().equals("5")) {
            controladorMenuCorrida.gestorCorrida.saveCorredorCinco();
          }
          else if (e.getActionCommand().equals("6")) {
            controladorMenuCorrida.gestorCorrida.saveCorredorSeis();
          }
    }
  }
}
