import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//exem01
class GestorCronometro implements ActionListener {
  static String
    INICIAR = "INICIAR",
    PARAR = "PARAR";
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
    else if (cmd.equals(PARAR)) {
       cronometro.pausar();
     }
  }
}//
