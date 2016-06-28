import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//exem01
class GestorCronometro implements ActionListener {
  static String
    INICIAR = "INICIAR",
    PARAR = "PARAR",
    SALVAR = "SALVAR",
    CARREGAR = "CARREGAR";

    private Cronometro cronometro;
  GestorCronometro(Cronometro cronometro) {
    this.cronometro = cronometro;
  }
  public void actionPerformed(ActionEvent e) {
    String cmd = e.getActionCommand();
    if (cmd.equals(INICIAR)) {
       cronometro.zerar();
       cronometro.avancar();
    }
    if (cmd.equals(PARAR)) {
       cronometro.pausar();
    }
     if (cmd.equals(SALVAR)) {

    }
    else if (cmd.equals(CARREGAR)) {

    }
    else if (cmd.equals(PARAR)) {
       cronometro.pausar();
     }
  }
}
