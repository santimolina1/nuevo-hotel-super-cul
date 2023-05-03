package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class panelDerecha extends JPanel implements ActionListener 
{
	public final static String NUEVO = "Nuevo";
	public final static String REINICIAR = "Reiniciar";
	public final static String TOP = "TOP- 10";
	public final static String JUGADOR = "Cambiar jugador";

	private PantallaFrame pantalla;
	private JButton btnNuevo;
	private JButton btnReiniciar;
	private JButton btnTop;
	private JButton btnJugador;
	
	public panelDerecha(PantallaFrame pantallaFrame)
	{
		pantalla=pantallaFrame;
		setLayout(new GridLayout(4,1));
		
		
		btnNuevo=new JButton("Nuevo");
		btnNuevo.setActionCommand(NUEVO);
		btnNuevo.addActionListener(this);
		btnNuevo.setBackground(Color.cyan);
		add(btnNuevo);
		
		btnReiniciar=new JButton("Reiniciar");
		btnReiniciar.setActionCommand(REINICIAR);
		btnReiniciar.addActionListener(this);
		btnReiniciar.setBackground(Color.cyan);
		add(btnReiniciar);
		
		
		btnTop=new JButton("TOP- 10");
		btnTop.setActionCommand(TOP);
		btnTop.addActionListener(this);
		btnTop.setBackground(Color.cyan);
		add(btnTop);
		
		btnJugador=new JButton("Cambiar jugador");
		btnJugador.setActionCommand(JUGADOR);
		btnJugador.addActionListener(this);
		btnJugador.setBackground(Color.cyan);
		add(btnJugador);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
