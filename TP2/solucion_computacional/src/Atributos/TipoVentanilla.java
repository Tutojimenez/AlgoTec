
package Atributos;

/**
 *ENUM QUE DETERMINA EL TIPO DE VENTANILLA
 *QUE ESTA ASOCIADA 
 */
public enum TipoVentanilla {   
    PERECEDEROS("P"),
    NOPERECEDEROS("NP"),
    SEGURIDAD("SG");
    
    private String tipo;
    /**
     * ASOCIA A LA VENTANA SU TIPO
     * @param tipo 
     */
    TipoVentanilla(String tipo){
        this.tipo=tipo;
    }
    /**
     * OBTIENE EL TIPO DE VENTANA 
     * @return EL TIPO DE VENTANA QUE TIENE ASOCIADO 
     */
    
    public String getTipo(){
        return tipo;
    }
}
