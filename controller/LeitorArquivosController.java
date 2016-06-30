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

    if (e.getActionCommand().equals("Mostrar")) {
      leitor.caminhoArquivo = this.caminhoArquivo;
      System.out.println(leitor.caminhoArquivo);
    }
    else if (manipuladorArquivo.showOpenDialog(manipuladorArquivo) == JFileChooser.APPROVE_OPTION) {
      this.caminhoArquivo = manipuladorArquivo.getSelectedFile().toString();
      System.out.println(this.caminhoArquivo);
      System.out.println("AAAAAA FOI?"+this.caminhoArquivo);
    }
    else {
      System.out.println("No Selection ");
    }
  }
}
