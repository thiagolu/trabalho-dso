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


  public LeitorArquivos() {

    escolher = new JButton("Escoher Arquivo");
    mostrar = new JButton("Mostrar");
    add(escolher);
    add(mostrar);
  }

  public void closeWindow(JFrame frame ) {
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        // System.exit(0);
      }
    });
  }

  public void initialize() {
    JFrame frame = new JFrame("");
    LeitorArquivosController leitor = new LeitorArquivosController(this);
    escolher.addActionListener(leitor);
    mostrar.addActionListener(leitor);
    closeWindow(frame);
    frame.getContentPane().add(this,"Center");
    frame.setSize(this.getPreferredSize());
    frame.setVisible(true);
  }

  public Dimension getPreferredSize(){
    return new Dimension(200, 200);
  }

  public String retornaCaminhoArquivo(JFrame frame) {
    return caminhoArquivo;
  }
}
