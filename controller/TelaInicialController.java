import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class TelaInicialController {
  public LeitorArquivos leitorArquivos;
  TelaCorrida telaCorrida;
  String caminho = "5";
  TelaInicial tela;

  public TelaInicialController() {
    this.leitorArquivos = new LeitorArquivos(new LeitorArquivosController(this));
    this.telaCorrida = new TelaCorrida();
    this.tela = new TelaInicial(this);
    }

  public void abre() {
    tela.inicializar();
    tela.setVisible(true);
    tela.addActionListners(new GerenciadorEventos(this));
    // new ImportadorCSV(leitorArquivos.caminhoArquivo).importarCSV();
  }

  public void inicializarLeitor(TelaInicialController telaInicialController) {
    // new ImportadorCSV(leitorArquivos.caminhoArquivo).importarCSV();
    leitorArquivos.initialize();
    leitorArquivos.addActionListners(new GerenciadorEventos(this));
    System.out.println("Verifica"+leitorArquivos);
  }

  private class GerenciadorEventos implements ActionListener{
    TelaInicialController telaInicialController;

    public GerenciadorEventos(TelaInicialController telaInicialController){
      this.telaInicialController = telaInicialController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getActionCommand().equals("Criar Evento")) {
        TelaCorrida telaCorrida = new TelaCorrida();
        telaCorrida.inicializar();
      }
      else if (e.getActionCommand().equals("MOSTRAR")) {
        System.out.println("AA");
      } else if (e.getActionCommand().equals("escolher")) {
        inicializarLeitor(telaInicialController);
      }
    }
  }
}
