
package Atributos;

import Atributos.Ventanilla;

/**
 *Clase ventanilla de seguridad 
 */
public class VentanillaSeguridad extends Ventanilla {
    private int tiempoMin;
    private int tiempoMax;
    private int numVentanaSeguridad;
    /**
     * metodo contructor para determinar los valores de la 
     * ventana de seguiridad
     * @param nombreVentana
     * @param numVentana
     * @param tipoVentana
     * @param cola
     * @param min
     * @param max 
     */
    public VentanillaSeguridad(String nombreVentana, int numVentana, String tipoVentana, 
            Object cola, int min, int max){        
        
        super(nombreVentana,numVentana,tipoVentana,cola);
        numVentanaSeguridad= numVentana;
        tiempoMin= min;
        tiempoMax= max;
    }    
    
}
