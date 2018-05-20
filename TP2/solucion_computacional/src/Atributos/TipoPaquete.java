
package Atributos;

/**
 *ENUM DETERMINA EL TIPO DE PAQUETE  
 * 
 */
public enum TipoPaquete {
    PERECEDERO("P"),
    NOPERECEDERO("NP");
    
    private String tipo;
    /**
     * SE TOMA EL PAQUETE Y SE ASOCIA UN TIPO 
     * @param list 
     */
    TipoPaquete(String list){
        this.tipo= list;
    }
    /**
     * OBTIENE EL TIPO DE PAQUETE QUE TIENE ASOCIADOEL OBJETO 
     * @return EL TIPO DE FICHA  
     */
   
    public String getTipoPaquete(){
        return this.tipo;
    }  
    
}
