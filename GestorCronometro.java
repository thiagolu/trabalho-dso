import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.Serializable;

class GestorCronometro implements Serializable, ActionListener {
  static String
    INICIAR = "INICIAR",
    PARAR = "PARAR",
    SALVAR1 = "SALVAR",
    SALVAR2 = "SALVAR",
    SALVAR3 = "SALVAR",
    SALVAR4 = "SALVAR",
    CARREGAR = "FINALIZAR";
    //TextFile persistencia = new TextFile();

    private Cronometro cronometro;

  public GestorCronometro(Cronometro cronometro) {
    this.cronometro = cronometro;
  }

  public void actionPerformed(ActionEvent e) {
    String cmd = e.getActionCommand();
    if (cmd.equals(INICIAR)) {
       cronometro.zerar();
       cronometro.avancar();
    }
    else if (cmd.equals(PARAR)) {
       cronometro.pausar();
    }
    else if (cmd.equals(SALVAR1)) {
    }

    else if (cmd.equals(SALVAR2)) {

    }
    else if (cmd.equals(SALVAR3)) {

    }
    else if (cmd.equals(SALVAR4)) {

    }
    else if (cmd.equals(CARREGAR)) {
      cronometro.pausar();
      JOptionPane.showMessageDialog(null, "Gerando arquivo texto com resultados...");
    }
  }
}
