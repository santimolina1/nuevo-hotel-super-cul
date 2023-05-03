package interfaz;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;







@SuppressWarnings("serial")
public class PantallaFrame extends JFrame
{
	private panelSuperior panelSuperior;
	private panelJuego panelJuego;
	private panelDerecha panelDerecha;
	private panelInferior panelInferior;
	
	
	
	public PantallaFrame() throws Exception
	{
		setTitle( "Lights Out" );
		setSize( 850, 600 );
		setResizable( false );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLayout( new BorderLayout( ) );
		
		JPanel superior= new JPanel();
		superior.setLayout(new BorderLayout());
		add(superior,BorderLayout.NORTH);
		panelSuperior=new panelSuperior(this);
		panelSuperior.setBackground(Color.blue);
		superior.add(panelSuperior,BorderLayout.NORTH);
		
		JPanel centro = new JPanel( );
		centro.setLayout( new BorderLayout( ) );
		add( centro, BorderLayout.CENTER );
		panelJuego = new panelJuego( this );
		centro.add( panelJuego, BorderLayout.CENTER );

		panelDerecha = new panelDerecha( this );
		centro.add( panelDerecha, BorderLayout.EAST );
		
		JPanel sur = new JPanel( );
		sur.setLayout( new BorderLayout( ) );
		add( sur, BorderLayout.SOUTH );

		
		panelInferior = new panelInferior() ;
		panelInferior.setBackground(Color.blue);
		sur.add( panelInferior, BorderLayout.CENTER );

		
	}





	public static void main(String[] args)
	{try
	{
		// Unifica la interfaz para Mac y para Windows.
		UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName( ) );

		PantallaFrame interfaz = new PantallaFrame( );
		interfaz.setVisible( true );
	}
	catch( Exception e )
	{
		e.printStackTrace( );
	}
}

}
