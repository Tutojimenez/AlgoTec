
package couriertec;


public class Nodo<T> {
    
	
	//atributos
	
	private T element;
	private Nodo<T> next;
	
	//Metodos
        
        /**
         * Clase constructora de nodos 
         */
        
	public Nodo() {
		this.element = null;
		this.next = null;
	}
	/**
         * Crea un nodo 
         * @param element 
         */
	public Nodo(T element) {
		this.element = element;
		this.next = null;
	}
	/**
         * Crea un nodo el cual tiene un puntero asociado 
         * @param element
         * @param next 
         */
	public Nodo(T element, Nodo<T> next) {
		this.element = element;
		this.next = next;
	}
	/**
         * Retorna el elemento 
         * @return el elemento 
         */
	public T getElement() {
		return this.element;
	}
	/**
         * Define el elemento 
         * @param element 
         */
	public void setElement(T element) {
		this.element = element;
	}
	/**
         * Retorna el nodo siguiente 
         * @return el nodo siguiente  
         */
	public Nodo<T> getNext() {
		return this.next;
	}
	/**
         * Determina el siguiente del nodo 
         * @param next 
         */
	public void setNext(Nodo<T> next) {
		this.next = next;	
	}
    
}
