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
  public LeitorArquivos leitorArquivos;

  private Container container;
  private JButton btArquivo;
  private JButton btCriarEvento;
  private JButton btMostrar;
  private JLabel rotuloP;
  private String caminho;
  public TelaInicialController inicialController;

  public TelaInicial(){
    this.leitorArquivos = new LeitorArquivos();

    this.rotuloP = new JLabel("Selecione a opcao desejada");
    this.inicialController = new TelaInicialController();
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
    setSize(500,550);
    setTitle("Tela Inicial");
    btArquivo.setPreferredSize(new Dimension(150, 20));
    btArquivo.addActionListener(inicialController);
    btArquivo.setActionCommand(btArquivo.getText());

    container.add(btArquivo, cts);

    btCriarEvento = new JButton("Criar Evento");
    btCriarEvento.setPreferredSize(new Dimension(150, 20));
    btCriarEvento.addActionListener(inicialController);
    btCriarEvento.setActionCommand(btCriarEvento.getText());

    container.add(btCriarEvento, cts);


    btMostrar = new JButton("MOSTRAR");
    btMostrar.setPreferredSize(new Dimension(150, 20));
    btMostrar.addActionListener(inicialController);
    btMostrar.setActionCommand(btMostrar.getText());

    container.add(btMostrar, cts);

  }

  public void abrirEvento() {
    TelaCorrida telaCorrida = new TelaCorrida();
    telaCorrida.inicializar();
  }
}
