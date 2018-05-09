package couriertec;


//Clase Qiosco indica sobre las fichas que se han entregado
public class Quiosco {
     private int fichasEntregadas;
    
    /**
     *
     */
    public Quiosco(){
        fichasEntregadas=0;
    }
    /**
     * metodo que me aumenta la variable de fichas 
     * @return la cantidad de fichas entregadas int  
     */
    public int entregarFicha(){
        fichasEntregadas++;
        return fichasEntregadas;
    }
    /**
     * metodo para reiniciar la cantidad de fichas 
     * @return booleano 
     */
    public boolean reiniciar(){
        fichasEntregadas=0;
        return true;
    } 
    
}
