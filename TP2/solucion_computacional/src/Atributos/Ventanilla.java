package Atributos;

/**
 *CLASE VENTANILLA 
 * 
 */
public class Ventanilla {        
    private String nombreVentana;
    private int numVentana;
    private boolean estatus;
    private String tipoVentana;
    private Object colaPrioridad;
    private int cantidadAtendidos;
    
    /**
     * CONSTRUCTOR
     * @param nombreVentana
     * @param numVentana
     * @param tipoVentana
     * @param cola 
     */
    public Ventanilla(String nombreVentana, int numVentana, String tipoVentana, Object cola){
        super();
        this.nombreVentana=nombreVentana;
        this.numVentana=numVentana;
        this.colaPrioridad=cola;
        this.tipoVentana=tipoVentana;
    }
    /**
     * OBTIENE EL NUMERO DE VENTANAS  
     * @return EL NUMERO DE VENTANAS QUE SE DEFINEN EN EL CONSTRUCTOR   
     */
    
    public int getNumero(){
        return this.numVentana;
    }
    /**
     * VERIFICA SI LA VENTANA ESTA OCUPADA  
     * @return ESTADO DE LA VENTANA 
     */
    public boolean estaTrabajando(){
        return estatus;
    }
    /**
     * ATIENDE EN LA VENTANA SOLICITADA  
     * @return valor booleano 
     */
    public boolean atender(){
        this.estatus=true;
        return true;        
    }
    /**
     * BUSCA SI LA VENTANA ESTA OCUPADA  
     * @return VALOR BOOLEANO 
     */
    public boolean liberar(){
        estatus= false;
        return true;
    }
    /**
     * 
     * @return VALOR BOOLEANO 
     */
    public boolean liberarAtender(){
        return true;
    }
    /**
     * Se obtiene la cola de obejtos asociadas a ventanas 
     * @return el objeto cola  
     */
    public Object getCola(){
        return this.colaPrioridad;
    }
    /**
     * Aumenta la cantidad de atendidos 
     * @return la cantidad de antendiso por ventana 
     */
    public int addAtendidos(){
        this.cantidadAtendidos++;
        return this.cantidadAtendidos;
    }
    /**
     * 
     * @return el string de cada ventana 
     */
    public String toString(){
        return "Ventana número "+this.numVentana+ " Ocupada: "+this.estatus+ " Atendidos: "+this.cantidadAtendidos;
    }
}   

