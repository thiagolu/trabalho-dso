import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;


class LeitorArquivosController implements ActionListener {
  JFileChooser manipuladorArquivo;
  String tituloManipuladorArquivo;
  String caminhoArquivo;
  LeitorArquivos leitor;


  public LeitorArquivosController(LeitorArquivos leitor) {
    this.tituloManipuladorArquivo = "AAADSADFF ";
    this.leitor = leitor;
  }

  public void inicializarLeitorArquivos() {

  }

  public void actionPerformed(ActionEvent e) {
    manipuladorArquivo = new JFileChooser();
    manipuladorArquivo.setCurrentDirectory(new java.io.File("."));
    manipuladorArquivo.setDialogTitle(tituloManipuladorArquivo);
    manipuladorArquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

    manipuladorArquivo.setAcceptAllFileFilterUsed(false);
    if(manipuladorArquivo.showOpenDialog(manipuladorArquivo) == JFileChooser.APPROVE_OPTION) {
      if (e.getActionCommand().equals("123")) {
        System.out.println(leitor.caminhoArquivo);
        leitor.caminhoArquivo = this.caminhoArquivo;
      }
      this.caminhoArquivo = manipuladorArquivo.getSelectedFile().toString();
    }
    else {
      System.out.println("No Selection ");
    }
  }
}
