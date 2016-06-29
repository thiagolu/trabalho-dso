import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;

class LeitorArquivos extends JPanel
implements ActionListener {
  JButton escolher;

  JFileChooser manipuladorArquivo;
  String tituloManipuladorArquivo;
  String caminhoArquivo;


  public LeitorArquivos() {
    escolher = new JButton("Escoher Arquivo");
    escolher.addActionListener(this);
    add(escolher);
  }


  public void initialize() {
    JFrame frame = new JFrame("");
    LeitorArquivos panel = new LeitorArquivos();
    frame.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    frame.getContentPane().add(panel,"Center");
    frame.setSize(panel.getPreferredSize());
    frame.setVisible(true);
  }

  public Dimension getPreferredSize(){
    return new Dimension(200, 200);
  }

  public void actionPerformed(ActionEvent e) {
    manipuladorArquivo = new JFileChooser();
    manipuladorArquivo.setCurrentDirectory(new java.io.File("."));
    manipuladorArquivo.setDialogTitle(tituloManipuladorArquivo);
    manipuladorArquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

    manipuladorArquivo.setAcceptAllFileFilterUsed(false);

    if (manipuladorArquivo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
      this.caminhoArquivo = manipuladorArquivo.getSelectedFile().toString();
      System.out.println(this.caminhoArquivo);
    }
    else {
      System.out.println("No Selection ");
    }
  }
}
