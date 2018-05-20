
package Atributos;

import Atributos.Ventanilla;

/**
 *Clase de ventanilla Perecederos
 * 
 */
public class VentanillaPerecederos extends Ventanilla {
    private int numVentanaPerecederos;
    /**
     * Crea la clase ventanilla economica 
     * @param nombreVentana
     * @param numVentana
     * @param tipoVentana
     * @param cola 
     */
    public VentanillaPerecederos(String nombreVentana, int numVentana, String tipoVentana,Object cola){
        super(nombreVentana,numVentana,tipoVentana,cola);
        numVentanaPerecederos= numVentana;
    }    
}
