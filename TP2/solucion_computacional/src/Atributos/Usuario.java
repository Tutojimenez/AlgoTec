package Atributos;

/**
 *CLASE USUARIO 
 * 
 */
public class Usuario {
    private String nombre;
    private String correo;
    private String tipoUsuario;
    private int numTel;
    private int numPaquete;
    private String tipoBoleto;    
    
    /**
     * CONSTRUCTOR   
     * @param nombre
     * @param correo
     * @param tipoUsuario
     * @param numTel
     * @param numBoleto
     * @param tipoBoleto 
     */
    
    public Usuario(String nombre, String correo, String tipoUsuario, 
            int numTel, int numpaquete,String tipoBoleto){
        
        this.correo=correo;
        this.tipoUsuario=tipoUsuario;
        this.numTel=numTel;
        this.numPaquete=numpaquete;
        this.tipoBoleto=tipoBoleto;
        this.nombre=generarNombre();
    }
    /**
     * BUSCA EL TIPO DE USUARIO
     * @return STRING DEL TIPO USUARIO  
     */
    
    public String getTipoUsuario(){
        return tipoUsuario;
    }  
    /**
     * RETORNA EL CORREO DEL USUARIO 
     * @return STRING CORREO 
     */    
    public String getCorreo(){
        return correo;
    }
    /**
     * RETORNA EL NUMERO DE TELEFONO 
     * @return INT NUMERO DE TELEFONO  
     */
    public int getNumTel(){
        return numTel;
    }
    /**
     * STRING DEL NOMBRE DEL USUARIO  
     * @return STRING NOMBRE  
     */
    public String toString(){
        return this.nombre;
    }
    /**
     * OPTENER EL NOMBRE DEL USUARIO 
     * @return STRING NOMBRE DEL USUARIO  
     */
    public String getNombre(){
        return this.nombre;
    }
    /**
     * @return STRING QUE CONTIENE EL TIPO DE PAQUETE Y SU NUMERO
     * 
     */
    private String generarNombre(){
        return tipoBoleto+"-"+tipoUsuario+"-"+numPaquete;
    }
}
