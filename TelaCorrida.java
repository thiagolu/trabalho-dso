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

public class TelaCorrida extends JFrame{

	private Container container;
	private JButton btStart;
	private JButton btStop;
	private JButton btFinalizar;
	private GerenciadorEventos gerenciadorEventos;
    private GestorCronometro gestorCronometro;
    private Cronometro cronometro;
    private JLabel rotulo;
    private JPanel tela;


	public TelaCorrida(){
	this.rotulo = new JLabel("0");
    this.cronometro = new Cronometro(rotulo);
	this.gestorCronometro = new GestorCronometro(cronometro);
    this.container = getContentPane();
    this.tela = new JPanel();
   

	}

	public void inicializar(){

		JFrame f = new JFrame();
        f.setContentPane(tela);
 		f.setTitle("Monitoramento do Evento");
    	f.pack();
    	f.setVisible(true);
    	f.setSize(300,200);
        mk_Tela(tela, rotulo, gestorCronometro);

	}

	public void mk_Tela(JPanel tela, JLabel rotulo,
                  ActionListener listener) {
    	tela.setLayout(new BorderLayout()); //ou
   
    	JPanel q;

    	q = new JPanel();
    	q.setLayout(new FlowLayout(FlowLayout.LEFT));
    	tela.add(q,BorderLayout.NORTH);
    	q.add(rotulo);

    	q = new JPanel();
    	q.setLayout(new FlowLayout(FlowLayout.LEFT));
    	tela.add(q,BorderLayout.CENTER);
    	mk_grupoCronometragem(q, listener);
  	}

    public void mk_grupoCronometragem(JPanel q, ActionListener listener) {
    	JButton b;
    	b = new JButton("Start");
    	q.add(b);
    	b.addActionListener(listener);
    	b.setActionCommand(GestorCronometro.INICIAR);

    	b = new JButton("Stop");
    	q.add(b);
    	b.addActionListener(listener);
    	b.setActionCommand(GestorCronometro.PARAR);

    	b = new JButton("Save Corredor 1");
    	q.add(b);
    	b.addActionListener(listener);
    	b.setActionCommand(GestorCronometro.SALVAR1);

    	b = new JButton("Save Corredor 2");
    	q.add(b);
    	b.addActionListener(listener);
    	b.setActionCommand(GestorCronometro.SALVAR2);

    	b = new JButton("Save Corredor 3");
    	q.add(b);
    	b.addActionListener(listener);
    	b.setActionCommand(GestorCronometro.SALVAR3);

    	b = new JButton("Save Corredor 4");
    	q.add(b);
    	b.addActionListener(listener);
    	b.setActionCommand(GestorCronometro.SALVAR4);

    	b = new JButton("Finalizar");
    	q.add(b);
    	b.addActionListener(listener);
    	b.setActionCommand(GestorCronometro.CARREGAR);
    	
    	}

 private class GerenciadorEventos implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        	if (e.getActionCommand().equals(btStop.getActionCommand())) {
               btStop.setActionCommand(GestorCronometro.PARAR);
       	 	} 
       	 	else if (e.getActionCommand().equals(btStart.getActionCommand())) {
       	 		btStart.setActionCommand(GestorCronometro.INICIAR);
       		}
		}
	}
}

