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
package uniandes.cupi2.impuestosCarro.mundo;

/**
 * Clase que representa un veh�culo.
 */
public class Vehiculo
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Nombre de la l�nea.
     */
    private String linea;

    /**
     * Nombre de la marca.
     */
    private String marca;

    /**
     * A�o del modelo.
     */
    private String anio;

    /**
     * Precio del veh�culo de este modelo.
     */
    private double precio;

    /**
     * Ruta de la imagen del veh�culo.
     */
    private String rutaImagen;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea un veh�culo con la informaci�n dada por par�metro. <b> post: </b> La marca, la l�nea, el a�o, el precio y la ruta fueron inicializados con el valor dado.
     * @param pLinea Nombre de la l�nea. pLinea != null && pLinea != "".
     * @param pMarca Nombre de la marca. pMarca != null && pMarca != "".
     * @param pAnio A�o del modelo. pAnio > 0.
     * @param pPrecio Precio del modelo. pPrecio > 0.
     * @param pRuta Ruta de la imagen. pRuta != null && pRuta != "".
     */
    public Vehiculo( String pMarca, String pLinea, String pAnio, double pPrecio, String pRuta )
    {
        marca = pMarca;
        linea = pLinea;
        anio = pAnio;
        precio = pPrecio;
        rutaImagen = pRuta;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el nombre de la l�nea.
     * @return Nombre de la l�nea.
     */
    public String darLinea( )
    {
        return linea;
    }

    /**
     * Retorna el nombre de la marca.
     * @return Nombre de la marca.
     */
    public String darMarca( )
    {
        return marca;
    }

    /**
     * Retorna el a�o del modelo.
     * @return A�o.
     */
    public String darAnio( )
    {
        return anio;
    }

    /**
     * Retorna el precio del modelo.
     * @return Precio.
     */
    public double darPrecio( )
    {
        return precio;
    }

    /**
     * Retorna la ruta de la imagen.
     * @return Ruta de la imagen.
     */
    public String darRutaImagen( )
    {
        return rutaImagen;
    }
}
