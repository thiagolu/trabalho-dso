import java.util.*;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;

class LeitorArquivos extends JPanel {
  public static final String ESCOLHER_ARQUIVO = "Escolher Arquivo";
  public static final String MOSTRAR_CONTEUDO = "Mostrar Conteudo";


  JButton escolherArquivo;
  JButton mostrarConteudo;

  JFrame frame;


  public LeitorArquivos() {
    this.escolherArquivo = new JButton(ESCOLHER_ARQUIVO);
    this.frame = new JFrame("Frame -tls");

    inicializar();
  }

  public void mostrar() {
    frame.setVisible(true);
  }

  public void inicializar() {

    escolherArquivo.setActionCommand(ESCOLHER_ARQUIVO);


    frame.getContentPane().add(this,"Center");
    frame.setSize(new Dimension(200, 200));
    add(escolherArquivo);

  }

  public void addActionListners(ActionListener e){
    escolherArquivo.setActionCommand(ESCOLHER_ARQUIVO);
    escolherArquivo.addActionListener(e);
  }

}
