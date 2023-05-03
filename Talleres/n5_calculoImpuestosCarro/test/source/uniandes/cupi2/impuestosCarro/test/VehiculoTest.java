/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 * $Id$
 * Universidad de los Andes (Bogot� - Colombia) 
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 * 
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: Impuestos de Carros
 * Autor: Katalina Marcos.
 * Modificaci�n: Diana Puentes - Jun 23, 2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */

package uniandes.cupi2.impuestosCarro.test;

import java.util.ArrayList;

import org.junit.Test;

import uniandes.cupi2.impuestosCarro.mundo.Vehiculo;

import static org.junit.Assert.*;

/**
 * Clase de prueba para la l�nea de un modelo
 */
public class VehiculoTest
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Veh�culo de la prueba 1
     */
    private Vehiculo vehiculo1;

    /**
     * Nombre de la l�nea
     */
    private String linea;

    /**
     * Nombre de la marca
     */
    private String marca;

    /**
     * A�o del modelo
     */
    private String anio;

    /**
     * Precio del veh�culo de este modelo
     */
    private double precio;

    /**
     * Ruta de la imagen del veh�culo
     */
    private String rutaImagen;

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Escenario con una l�nea sin modelos
     */
    private void setupEscenario1( )
    {
        marca = "Chevrolet";
        linea = "Silverado";
        anio = "2017";
        precio = 147000000;
        rutaImagen = "silverado2017.jpg";
        vehiculo1 = new Vehiculo( marca, linea, anio, precio, rutaImagen );
    }

    /**
     * Prueba la obtenci�n v�lida del marca del veh�culo
     */
    @Test
    public void testDarMarca( )
    {
        // Configura el escenario de prueba
        setupEscenario1( );

        // Valida que el linea sea la adecuada
        assertEquals( linea, vehiculo1.darLinea( ) );
    }

    /**
     * Prueba la obtenci�n v�lida de la l�nea del veh�culo
     */
    @Test
    public void testDarLinea( )
    {
        // Configura el escenario de prueba
        setupEscenario1( );

        // Valida que el linea sea la adecuada
        assertEquals( linea, vehiculo1.darLinea( ) );
    }

    /**
     * Prueba la obtenci�n v�lida del a�o del veh�culo
     */
    @Test
    public void testDarAnio( )
    {
        // Configura el escenario de prueba
        setupEscenario1( );

        // Valida que el linea sea la adecuada
        assertEquals( anio, vehiculo1.darAnio( ) );
    }

    /**
     * Prueba la obtenci�n v�lida del precio del veh�culo
     */
    @Test
    public void testDarPrecio( )
    {
        // Configura el escenario de prueba
        setupEscenario1( );

        // Valida que el linea sea la adecuada
        assertTrue( precio == vehiculo1.darPrecio( ) );
    }

    /**
     * Prueba la obtenci�n v�lida de la ruta de la imagen del veh�culo
     */
    @Test
    public void testDarRutaImagen( )
    {
        // Configura el escenario de prueba
        setupEscenario1( );

        // Valida que el linea sea la adecuada
        assertEquals( rutaImagen, vehiculo1.darRutaImagen( ) );
    }

}