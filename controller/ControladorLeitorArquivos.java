import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.*;

class ControladorLeitorArquivos  {
  JFileChooser manipuladorArquivo;
  LeitorArquivos leitorArquivos;
  public String caminho;
  public HashMap<String, ArrayList<String>> corredores;
  ControladorMenuCorrida controladorMenuCorrida;

  public ControladorLeitorArquivos(ControladorMenuCorrida controladorMenuCorrida) {
    this.controladorMenuCorrida = controladorMenuCorrida;
    this.leitorArquivos = new LeitorArquivos();
    this.manipuladorArquivo = new JFileChooser();
    this.caminho = "";
  }

  public void mostrarMenu() {
    leitorArquivos.mostrar();
    leitorArquivos.addActionListners(new GerenciadorEventos(manipuladorArquivo, this, controladorMenuCorrida));
  }

  public HashMap<String, ArrayList<String>> pegarConteudo(String caminho) {
    ImportadorCSV importadorCSV = new ImportadorCSV(caminho);
    return this.corredores = importadorCSV.importarCSV();
  }

  private class GerenciadorEventos implements ActionListener{
    JFileChooser manipuladorArquivo;
    ControladorLeitorArquivos controladorLeitorArquivos;
    ControladorMenuCorrida controladorMenuCorrida;

    public GerenciadorEventos(JFileChooser fileChooser, ControladorLeitorArquivos controlador, ControladorMenuCorrida controladorMenuCorrida) {
      this.controladorLeitorArquivos = controlador;

      this.manipuladorArquivo = fileChooser;

      manipuladorArquivo.setCurrentDirectory(new java.io.File("."));
      manipuladorArquivo.setDialogTitle("tituloManipuladorArquivo");
      manipuladorArquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

      manipuladorArquivo.setAcceptAllFileFilterUsed(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

      if (e.getActionCommand().equals("Mostrar Conteudo")) {
        // System.out.println("Mostrar "+ controladorLeitorArquivos.caminho);
      }
      else if(manipuladorArquivo.showOpenDialog(manipuladorArquivo) == JFileChooser.APPROVE_OPTION) {
        if (e.getActionCommand().equals("Escolher Arquivo")) {
          this.controladorLeitorArquivos.caminho = manipuladorArquivo.getSelectedFile().toString();
          controladorLeitorArquivos.pegarConteudo(controladorLeitorArquivos.caminho);

          System.out.println("Escolher "+ manipuladorArquivo.getSelectedFile().toString());
        }
      }
      else {
      }
    }
  }
}
