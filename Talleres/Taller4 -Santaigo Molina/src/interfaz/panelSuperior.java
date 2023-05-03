package interfaz;
import java.awt.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class panelSuperior extends JPanel{
	
	private JComboBox<String> cboxTama�o;
	private JCheckBox cbFacil;
	private JCheckBox cbMedio;
	private JCheckBox cbDificil;
	
	public panelSuperior(PantallaFrame pantallaFrame)
	{
		setLayout( new BorderLayout( ) );
		setLayout( new GridLayout( 1, 6 ) );
		
		JLabel labTama�o= new JLabel("Tama�o");
		add(labTama�o);
		cboxTama�o= new JComboBox<String>();
		cboxTama�o.addItem("5x5");
		cboxTama�o.addItem("6x6");
		cboxTama�o.addItem("7x7");
		add(cboxTama�o);
		
		
		JLabel labDificultad= new JLabel("Dificultad");
		add(labDificultad);
		
		
		cbFacil= new JCheckBox("F�cil");
		cbMedio= new JCheckBox("Medio");
		cbDificil= new JCheckBox("Dif�cil");
		
		
		
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
