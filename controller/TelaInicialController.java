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

class TelaInicialController implements ActionListener {
  LeitorArquivos leitorArquivos;
  String caminho = "5";

  public TelaInicialController() {
    this.leitorArquivos = new LeitorArquivos();
  }

  public void inicializarLeitor() {
    leitorArquivos.initialize();
  }

  public void verificarLeitor() {
    new ImportadorCSV(leitorArquivos.caminhoArquivo).importarCSV();
    System.out.println(leitorArquivos.caminhoArquivo);
  }



  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getActionCommand().equals("Arquivo")) {
      inicializarLeitor();
      caminho = leitorArquivos.caminhoArquivo;
    } else if (e.getActionCommand().equals("Criar Evento")) {
      System.out.println("AAAA");
    }
    else if (e.getActionCommand().equals("MOSTRAR")) {
     System.out.println(caminho);
     verificarLeitor();
   }
  }
}
