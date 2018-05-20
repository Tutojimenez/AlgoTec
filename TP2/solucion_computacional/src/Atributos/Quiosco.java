
package Atributos;

/**
 *Clase Quiosco la cual indica 
  la cantidad de fichas dadas  
 */
public class Quiosco {
    private int fichas;
    
    /**
     *CONSTRUCTOR
     */
    public Quiosco(){
        fichas=0;
    }
    /**
     * METODO QUE AUMENTA LA CANTIDAD DE  DE FICHAS 
     * @return LA CANTIDAD DE  FICHAS  
     */
    public int venderBoleto(){
        fichas++;
        return fichas;
    }
    /**
     * METODO PARA REINICIAR LA CANTIDAD DE FICHAS 
     * @return booleano 
     */
    public boolean reiniciar(){
        fichas=0;
        return true;
    }            
}
