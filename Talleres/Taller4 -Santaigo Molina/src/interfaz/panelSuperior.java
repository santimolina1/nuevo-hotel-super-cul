package interfaz;
import java.awt.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class panelSuperior extends JPanel{
	
	private JComboBox<String> cboxTamaño;
	private JCheckBox cbFacil;
	private JCheckBox cbMedio;
	private JCheckBox cbDificil;
	
	public panelSuperior(PantallaFrame pantallaFrame)
	{
		setLayout( new BorderLayout( ) );
		setLayout( new GridLayout( 1, 6 ) );
		
		JLabel labTamaño= new JLabel("Tamaño");
		add(labTamaño);
		cboxTamaño= new JComboBox<String>();
		cboxTamaño.addItem("5x5");
		cboxTamaño.addItem("6x6");
		cboxTamaño.addItem("7x7");
		add(cboxTamaño);
		
		
		JLabel labDificultad= new JLabel("Dificultad");
		add(labDificultad);
		
		
		cbFacil= new JCheckBox("Fácil");
		cbMedio= new JCheckBox("Medio");
		cbDificil= new JCheckBox("Difícil");
		
		
		
		add(cbFacil);
		add(cbMedio);
		add(cbDificil);
		
		
		if (cbFacil.isSelected()){
			cbMedio.setSelected(false);
			cbDificil.setSelected(false);
		}
		
		if (cbMedio.isSelected()){
			cbFacil.setSelected(false);
			cbDificil.setSelected(false);
		}
		
		if (cbDificil.isSelected()){
			cbMedio.setSelected(false);
			cbFacil.setSelected(false);
		}
		
		
	}
	
	
	
	
	public boolean juegoFacil()
	{
		return cbFacil.isSelected();
	}
	
	public boolean juegoMedio()
	{
		return cbMedio.isSelected();
	}
	
	
	public boolean juegoDificil()
	{
		return cbDificil.isSelected();
	}
}
