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
  private JButton btEscolher;
  private JButton btMostrar;

  private JLabel rotuloP;

  private String caminho;
  public LeitorArquivos leitorArquivos;
  private TelaInicialController telaInicialController;

  public TelaInicial(TelaInicialController telaInicialController){

    this.telaInicialController = telaInicialController;
    this.rotuloP = new JLabel("Selecione a opcao desejada");
    this.container = getContentPane();
  }

  public void inicializar(){

    container.setLayout(new FlowLayout());
    setLocationRelativeTo(null);
    JFrame cts = new JFrame();
    container.add(rotuloP);


    setSize(500,550);
    setTitle("Tela Inicial");

    btCriarEvento = new JButton("Criar Evento");
    btCriarEvento.setPreferredSize(new Dimension(150, 20));
    btCriarEvento.setActionCommand(btCriarEvento.getText());

    container.add(btCriarEvento, cts);


    btMostrar = new JButton("MOSTRAR");
    btMostrar.setPreferredSize(new Dimension(150, 20));
    btMostrar.setActionCommand(btMostrar.getText());

    container.add(btMostrar, cts);

    btEscolher = new JButton("escolher");
    btEscolher.setPreferredSize(new Dimension(150, 20));
    btEscolher.setActionCommand(btEscolher.getText());

    container.add(btEscolher, cts);
  }

  public void addActionListners(ActionListener e){
    btCriarEvento.setActionCommand("Criar Evento");
    btCriarEvento.addActionListener(e);
    btMostrar.setActionCommand("MOSTRAR");
    btMostrar.addActionListener(e);
    btEscolher.setActionCommand("escolher");
    btEscolher.addActionListener(e);

  }

}
