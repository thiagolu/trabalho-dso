import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;

class LeitorArquivos extends JPanel {
  JButton escolher;
  JButton mostrar;

  JFileChooser manipuladorArquivo;
  String tituloManipuladorArquivo;
  public String caminhoArquivo;
  private LeitorArquivosController leitorArquivosController;
  JFrame frame;

  public LeitorArquivos(LeitorArquivosController leitorArquivosController) {
    this.leitorArquivosController = leitorArquivosController;
    escolher = new JButton("Escoher Arquivo");
    mostrar = new JButton("Mostrar");
    this.frame = new JFrame("");

  }

  public void closeWindow(JFrame frame ) {
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        // System.exit(0);
      }
    });
  }

  public void initialize() {
    leitorArquivosController.inicializarLeitorArquivos(this);

    // escolher.addActionListener(leitor);
    // mostrar.addActionListener(leitor);
    mostrar.setActionCommand("Mostrar");
    escolher.setActionCommand("Escolher Arquivo");
    closeWindow(frame);
    frame.getContentPane().add(this,"Center");
    frame.setSize(this.getPreferredSize());
    frame.setVisible(true);
    add(escolher);
    add(mostrar);
  }

  public Dimension getPreferredSize(){
    return new Dimension(200, 200);
  }

  public String retornaCaminhoArquivo() {
    return caminhoArquivo;
  }


  public void addActionListners(ActionListener e){
    escolher.setActionCommand("Escolher Arquivo");
    mostrar.addActionListener(e);
    mostrar.setActionCommand("Mostrar");
    escolher.addActionListener(e);

  }
}
