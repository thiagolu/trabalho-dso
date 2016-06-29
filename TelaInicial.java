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


public class TelaInicial extends JFrame{

  private Container container;
  private JButton btArquivo;
  private JButton btCriarEvento;
  private JLabel rotuloP;
  private GerenciadorEventos gerenciadorEventos;

  public TelaInicial(){

    this.rotuloP = new JLabel("Selecione a opcao desejada");
    this.gerenciadorEventos = new GerenciadorEventos();
    this.container = getContentPane();

    inicializar();
  }

  public void inicializar(){

    container.setLayout(new FlowLayout());
    setLocationRelativeTo(null);
    JFrame cts = new JFrame();
    container.add(rotuloP);
    setVisible(true);


    btArquivo = new JButton("Arquivo");
    setSize(300,150);
    setTitle("Tela Inicial");
    btArquivo.setPreferredSize(new Dimension(150, 20));
    btArquivo.addActionListener(gerenciadorEventos);
    btArquivo.setActionCommand(btArquivo.getText());

    container.add(btArquivo, cts);

    btCriarEvento = new JButton("Criar Evento");
    btCriarEvento.setPreferredSize(new Dimension(150, 20));
    btCriarEvento.addActionListener(gerenciadorEventos);
    btCriarEvento.setActionCommand(btCriarEvento.getText());

    container.add(btCriarEvento, cts);
  }



  private class GerenciadorEventos implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getActionCommand().equals(btArquivo.getActionCommand())) {
        LeitorArquivos arq = new LeitorArquivos();
        arq.initialize();
      } else if (e.getActionCommand().equals(btCriarEvento.getActionCommand())) {
        TelaCorrida telaCorrida = new TelaCorrida();
        telaCorrida.inicializar();

      }
    }

  }
}
