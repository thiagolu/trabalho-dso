import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;


class LeitorArquivosController {
  JFileChooser manipuladorArquivo;
  String tituloManipuladorArquivo;
  String caminhoArquivo;
  TelaInicialController telaInicialController;

  public LeitorArquivosController(TelaInicialController telaInicialController) {
    this.tituloManipuladorArquivo = "AAADSADFF ";
    this.telaInicialController = telaInicialController;
  }

  public void inicializarLeitorArquivos(LeitorArquivos leitorArquivos) {
    leitorArquivos.addActionListners(new GerenciadorEventos());
  }


  private class GerenciadorEventos implements ActionListener{
    JFileChooser manipuladorArquivo;

    public GerenciadorEventos() {
      this.manipuladorArquivo = new JFileChooser();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

      manipuladorArquivo.setCurrentDirectory(new java.io.File("."));
      manipuladorArquivo.setDialogTitle(tituloManipuladorArquivo);
      manipuladorArquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

      manipuladorArquivo.setAcceptAllFileFilterUsed(false);
      if(manipuladorArquivo.showOpenDialog(manipuladorArquivo) == JFileChooser.APPROVE_OPTION) {
        if (e.getActionCommand().equals("Escolher Arquivo")) {
          this.caminhoArquivo = manipuladorArquivo.getSelectedFile().toString();
          System.out.println("No Selection "+ manipuladorArquivo.getSelectedFile().toString());

        }
      }
      else {
        System.out.println("Mostrou ");
      }
    }
  }
}
