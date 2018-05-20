
package Atributos;

/**
 *DETERMINA EL TIPO DE USUARIO  
 * 
 */
public enum TipoUsuario {
    EMBARAZADA("E"),
    DISCAPACITADO("D"),
    ADULTOMAYOR("M"),
    REGULAR("R");
    
    private String list;
    /**
     * METODO QUE ESTABLECE EL TIPO DE USUARIO  
     * @param list 
     */
    TipoUsuario(String list){        
        this.list=list;
    }
    /**
     * OBTIENE EL TIPO DE USUARIO  
     * @return EL TIPO DE USUARIO 
     */
    public String getTipoUsuario(){
        return list;
    }
}
