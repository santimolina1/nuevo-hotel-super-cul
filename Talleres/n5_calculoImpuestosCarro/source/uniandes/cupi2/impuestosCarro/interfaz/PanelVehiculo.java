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

import java.awt.*;
import java.text.*;

import javax.swing.*;
import javax.swing.border.*;

import uniandes.cupi2.impuestosCarro.mundo.Vehiculo;

/**
 * Panel para mostrar la informaci�n de los veh�culos.
 */
@SuppressWarnings("serial")
public class PanelVehiculo extends JPanel
{

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Campo de texto para visualizar la marca del veh�culo.
     */
    private JTextField txtMarca;

    /**
     * Campo de texto para escribir y visualizar la l�nea del veh�culo.
     */
    private JTextField txtLinea;

    /**
     * Campo de texto para escribir y visualizar el modelo del veh�culo.
     */
    private JTextField txtModelo;

    /**
     * Campo de texto para visualizar el valor del veh�culo.
     */
    private JTextField txtValor;

    /**
     * Etiqueta para mostrar la imagen del veh�culo.
     */
    private JLabel labImagen;

    /**
     * Panel para la navegaci�n del veh�culo.
     */
    private PanelNavegacion panelNavegacion;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea el panel donde se mostrar�n los veh�culos.
     * @param pPrincipal Ventana principal de la aplicaci�n. pPrincipal != null.
     */
    public PanelVehiculo( InterfazImpuestosCarro pPrincipal )
    {
        setLayout( new BorderLayout( ) );
        labImagen = new JLabel( );
        labImagen.setBorder( new EmptyBorder( 0, 0, 0, 10 ) );
        add( labImagen, BorderLayout.WEST );

        JPanel informacion = new JPanel( );
        informacion.setLayout( new GridLayout( 4, 2, 10, 5 ) );
        add( informacion, BorderLayout.CENTER );

        // Adiciona un marco con t�tulo
        TitledBorder border = new TitledBorder( "Datos del veh�culo" );
        border.setTitleColor( Color.BLUE );
        setBorder( border );

        // Crea e inicializa los objetos del panel
        JLabel labMarca = new JLabel( "Marca" );
        informacion.add( labMarca );

        txtMarca = new JTextField( );
        txtMarca.setEditable( false );
        informacion.add( txtMarca );

        JLabel labLinea = new JLabel( "L�nea" );
        JLabel labModelo = new JLabel( "Modelo" );
        JLabel labValor = new JLabel( "Valor" );
        txtLinea = new JTextField( );
        txtLinea.setEditable( false );
        txtModelo = new JTextField( );
        txtModelo.setEditable( false );

        txtValor = new JTextField( );
        txtValor.setEditable( false );
        txtValor.setForeground( Color.BLUE );
        txtValor.setBackground( Color.WHITE );

        // Adiciona los objetos al panel
        informacion.add( labLinea );
        informacion.add( txtLinea );
        informacion.add( labModelo );
        informacion.add( txtModelo );
        informacion.add( labValor );
        informacion.add( txtValor );

        panelNavegacion = new PanelNavegacion( pPrincipal );
        add( panelNavegacion, BorderLayout.SOUTH );
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Actualiza el panel con la informaci�n del veh�culo que entra por par�metro.
     * @param pMarca Marca del veh�culo a mostrar.
     * @param pLinea L�nea del veh�culo a mostrar.
     * @param pAnio A�o del veh�culo a mostrar.
     * @param pPrecio Precio del veh�culo a mostrar.
     * @param pRutaImagen Ruta del vehiculo a mostrar
     */
    public void actualizar( String pMarca, String pLinea, String pAnio, double pPrecio, String pRutaImagen )
    {
        txtMarca.setText( pMarca );
        txtLinea.setText( pLinea );
        txtModelo.setText( pAnio );
        DecimalFormat df = ( DecimalFormat )NumberFormat.getInstance( );
        df.applyPattern( "$ ###,###.##" );
        txtValor.setText( df.format( pPrecio ) );
        labImagen.setIcon( new ImageIcon( new ImageIcon( "./data/imagenes/" + pRutaImagen ).getImage( ).getScaledInstance( 280, 170, Image.SCALE_DEFAULT ) ) );
    }

}