package Atributos;

import Atributos.Ventanilla;

/**
 *Clase de ventanilla NO PERECEDEROS
 * 
 */
public class VentanillaNoPerecederos extends Ventanilla {
    private int numVentanaNoperecedros;
    /**
     * Metodo constructor de ventanilla 
     * @param nombreVentana
     * @param numVentana
     * @param tipoVentana
     * @param cola 
     */
    public VentanillaNoPerecederos(String nombreVentana, int numVentana, String tipoVentana, Object cola){
        super(nombreVentana,numVentana,tipoVentana,cola);        
        numVentanaNoperecedros= numVentana;
    }
}
