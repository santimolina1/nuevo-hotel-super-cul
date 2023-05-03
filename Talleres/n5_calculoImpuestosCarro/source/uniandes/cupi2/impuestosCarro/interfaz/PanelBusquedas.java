/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n5_calculoImpuestosCarro
 * Autor: Equipo Cupi2 2017
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */
package uniandes.cupi2.impuestosCarro.interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 * Panel para las consultas sobre los veh�culos.
 */
@SuppressWarnings("serial")
public class PanelBusquedas extends JPanel implements ActionListener
{

	// -----------------------------------------------------------------
	// Constantes
	// -----------------------------------------------------------------

	/**
	 * Comando para buscar un veh�culo por l�nea.
	 */
	public final static String BUSCAR_POR_LINEA = "Buscar por l�nea";

	/**
	 * Comando para buscar un veh�culo por marca.
	 */
	public final static String BUSCAR_POR_MARCA = "Buscar por marca";

	/**
	 * Comando para buscar el veh�culo m�s caro.
	 */
	public final static String BUSCAR_MAS_CARO = "Buscar veh�culo m�s Caro";

	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------

	/**
	 * Instancia de la clase principal.
	 */
	private InterfazImpuestosCarro principal;

	// -----------------------------------------------------------------
	// Elementos de la interfaz
	// -----------------------------------------------------------------

	/**
	 * Campo de texto para la l�nea.
	 */
	private JTextField txtLinea;

	/**
	 * Campo de texto para la marca.
	 */
	private JTextField txtMarca;

	/**
	 * Bot�n para buscar por l�nea.
	 */
	private JButton btnBuscarLinea;

	/**
	 * Bot�n para buscar por marca.
	 */
	private JButton btnBuscarMarca;

	/**
	 * Bot�n para buscar el m�s caro.
	 */
	private JButton btnBuscarCaro;

	// -----------------------------------------------------------------
	// Constructores
	// -----------------------------------------------------------------

	/**
	 * Construye el panel con los botones y campos de texto.
	 * @param pPrincipal Instancia principal de la aplicaci�n.
	 */
	public PanelBusquedas( InterfazImpuestosCarro pPrincipal )
	{
		principal = pPrincipal;
		setLayout( new GridLayout( 3, 2 ) );
		setPreferredSize( new Dimension( 0, 100) );
		TitledBorder border = new TitledBorder( "B�squedas" );
		border.setTitleColor( Color.BLUE );
		setBorder(  border);


		txtLinea = new JTextField( );
		add( txtLinea );

		btnBuscarLinea = new JButton( BUSCAR_POR_LINEA );
		btnBuscarLinea.addActionListener( this );
		btnBuscarLinea.setActionCommand( BUSCAR_POR_LINEA );
		add( btnBuscarLinea );

		txtMarca = new JTextField( );
		add( txtMarca );

		btnBuscarMarca = new JButton( BUSCAR_POR_MARCA );
		btnBuscarMarca.addActionListener( this );
		btnBuscarMarca.setActionCommand( BUSCAR_POR_MARCA );
		add( btnBuscarMarca );

		add( new JLabel( ) );

		btnBuscarCaro = new JButton( BUSCAR_MAS_CARO );
		btnBuscarCaro.addActionListener( this );
		btnBuscarCaro.setActionCommand( BUSCAR_MAS_CARO );
		add( btnBuscarCaro );

	}
	
	/**
	 * Retorna la l�nea del veh�culo ingresada por el usuario.
	 * @return L�nea del veh�culo ingresada.
	 */
	public String darLinea()
	{
		return txtLinea.getText();
	}

	/**
	 * Retorna la marca del veh�culo ingresada por el usuario.
	 * @return Marca del veh�culo ingresada.
	 */
	public String darMarca()
	{
		return txtMarca.getText();
	}
	
	/**
	 * Limpia los campos de texto de l�nea y marca del veh�culo.
	 */
	public void limpiar()
	{
		txtLinea.setText("");
		txtMarca.setText("");		
	}

	/**
	 * Respuesta a los eventos en los elementos de la interfaz.
	 * @param pEvento Evento generado. pEvento != null.
	 */
	public void actionPerformed( ActionEvent pEvento )
	{
		String comando = pEvento.getActionCommand( );

		if( comando.equals( BUSCAR_MAS_CARO ) )
		{
			principal.buscarMasCaro( );
		}
		else if( comando.equals( BUSCAR_POR_LINEA ) )
		{
			principal.buscarPorLinea( );
		}
		else
		{
			principal.buscarPorMarca( );
		}
	}
}


