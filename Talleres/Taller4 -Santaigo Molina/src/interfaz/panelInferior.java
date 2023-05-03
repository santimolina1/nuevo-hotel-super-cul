package interfaz;
import java.awt.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class panelInferior extends JPanel {

	
	
	public panelInferior() {
		setLayout(new GridLayout(1,4));
		
		JLabel labJugadas= new JLabel("Jugadas");
		add(labJugadas);
		
		JLabel labNumero= new JLabel();
		add(labNumero);
		
		JLabel labJugador= new JLabel("Jugador:");
		add(labJugador);
		
		JLabel labNombre= new JLabel();
		add(labNombre);
		
	}
	
	

}
