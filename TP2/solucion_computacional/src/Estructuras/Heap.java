package Estructuras;

import Atributos.Usuario;

/**
 *Estructura del heap como metodo de estructura 
 *
 */

public class Heap {
    private Prioridad[] heap; 
    private int heapSize, capacity;
    
    /**
     * Constructor de los heaps 
     * @param capacity 
     */
    public Heap(int capacity){  
        this.capacity = capacity + 1;
        heap = new Prioridad[this.capacity];
        heapSize = 0;
    }
    /**
     * Clona un Heap 
     * @return
     * @throws CloneNotSupportedException 
     */
    @Override
    protected Object clone() throws CloneNotSupportedException{  
        Heap clon= (Heap) super.clone();  
        return clon;
    } 
    /**
     * function to clear
     */
    public void clear(){
        heap = new Prioridad[capacity];
        heapSize = 0;
    }
    
    
    /**
     * function to check if empty 
     * @return int con el tamaño 
     */
    public boolean isEmpty(){
        return heapSize == 0;
    }
    
    /**
     *  function to check if full 
     * @return  el tamano de hea menod uno
     */
    public boolean isFull(){
        return heapSize == capacity - 1;
    }
    /**
     * function to get Size
     */
    public int size(){
        return capacity-1;
    }
    
    /**
     * function to insert task
     * @param job
     * @param priority 
     */
    public void insert(Usuario job, int priority){
        Prioridad newJob = new Prioridad(job, priority);
        heap[++heapSize] = newJob;
        int pos = heapSize;
        while (pos != 1 && newJob.getPrioridad() > heap[pos/2].getPrioridad()){
           heap[pos] = heap[pos/2];
            pos /=2;
        }
        heap[pos] = newJob;    
    }
    /**
     * function to remove task
     */
    public Prioridad remove(){
        int parent, child;
        Prioridad item;
        Prioridad temp;
        
        if (isEmpty()){
            return null;
        }
        
        item = heap[1];
        temp = heap[heapSize--];
        parent = 1;
        child = 2;
        
        while (child <= heapSize){
            if (child < heapSize && heap[child].getPrioridad() < heap[child + 1].getPrioridad())
                child++;
            if (temp.getPrioridad() >= heap[child].getPrioridad())
                break;
            
            heap[parent] = heap[child];
            parent = child;
            child *= 2;
        }
        heap[parent] = temp;
        return item;
    }
}