package Estructuras;

/**
 *Clase de Cola de Prioridad 
 * 
 */
public class ColaPrioridad {
    
    private int maxSize;
    private Cola[] colaArray;
    
    /**
     * Metodo constructor de la cola de prioridad
     */

    public ColaPrioridad() {
        maxSize = 5;
        colaArray = new Cola[maxSize];
        
        colaArray[0]= new Cola();
        colaArray[1]= new Cola();
        colaArray[2]= new Cola();
        colaArray[3]= new Cola();
        colaArray[4]= new Cola();
    }
    /**
     * Inserta un elemento a la cola de prioridad dependiendo de los 
     * parametros 
     * @param nuevo_usuario
     * @param prioridad 
     */
    public void insert(Prioridad nuevo_usuario,int prioridad){
        System.out.println("insertado"+nuevo_usuario);
        int p= prioridad;
        colaArray[p].enqueue(nuevo_usuario);
        }
    /**
     * Remueve el elemento primero de la prioridad mayor 
     * @return un objeto de tipo Prioridad 
     */
    public Prioridad remove(){
        int priority= 4;
        Prioridad output=null;
        for (int i=0;i<maxSize-1; i++){     
            if(colaArray[priority].size()!=0){
                return (Prioridad) colaArray[priority].dequeue();
            }
            priority--;
        }
        return output;
    }
    /**
     * Realiza el string de la cola 
     * @return el string de la cola completa 
     */
    
    public String toStringColasdePrioridad(){
        for (int i=0; i<maxSize; i++){
            return (colaArray[i].toString()) ; 
        }
        return ("cola");
        
    }
       
    
}







    
