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
 * Rango de impuesto de veh�culos.
 */
public class RangoImpuesto
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Inicio del rango.
     */
    private double inicio;

    /**
     * Fin del rango.
     */
    private double fin;

    /**
     * Porcentaje.
     */
    private double porcentaje;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea un rango de impuesto.<br>
     * <b> post:</b> Se inicializ� el inicio, el fin y el porcentaje con la informaci�n dada por par�metro.
     * @param pInicio Inicio del rango. pInicio  > 0.
     * @param pFin Fin del rango. pFin > pInicio
     * @param pPorcentaje Porcentaje de impuesto que aplica para el rango. pPorcentaje > 0
     */
    public RangoImpuesto( double pInicio, double pFin, double pPorcentaje )
    {
        inicio = pInicio;
        fin = pFin;
        porcentaje = pPorcentaje;
    }
    
    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------
    
    /**
     * Retorna el porcentaje.
     * @return Porcentaje del rango.
     */
    public double darPorcentaje( )
    {
        return porcentaje;
    }

    /**
     * Indica si el valor est� en el rango.
     * @param pValor Valor que se va a buscar en el rango.
     * @return True si el valor est� en el rango, false en caso contrario.
     */
    public boolean contieneA( double pValor )
    {
        return ( pValor >= inicio && pValor < fin );
    }
}