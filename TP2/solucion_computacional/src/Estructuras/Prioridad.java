package Estructuras;

import Atributos.Usuario;

/**
 *Clase Prioridad que determina la prioridad de cada objeto 
 y almacena el objeto 
 * 
 */
public class Prioridad{
    private Usuario job;
    private int priority;
    
    /** Constructor **/
    /**
     * Metodo constructor de la clase 
     * @param job
     * @param priority 
     */
    public Prioridad(Usuario job, int priority){
        this.job = job;
        this.priority = priority; 
    }
    /**
     * realiza el string de la clase
     */
    public String toString() {
        return "Job Name : "+ job +"\nPriority : "+ priority;
    }
    /**
     * Para optener el task 
     * @return un objeto de tipo Usuario 
     */
    public Usuario getTask(){
        return this.job;
    }   
    /**
     * Busca la prioridad 
     * @return la prioridad 
     */
    public int getPrioridad(){
        return this.priority;
    }
    /**
     * Busca el usuario 
     * @return el atributo job 
     */
    public Usuario getUsuario(){
        return this.job;
    }
}
