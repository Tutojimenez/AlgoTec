package Estructuras;

/**
 *Clase de estructura de datos 
 * cola que utiliza la case nodos 
 * @param <T>
 */
public class Cola<T> {
	
	private Nodo<T> front;
	private Nodo<T> rear;
	private int size;
	/**
         * Metodo constructor
         */
	public Cola(){
		this.front = new Nodo<>();
		this.rear = this.front;
		this.size = 0;
	}
	/**
         * Agregar a la cola 
         * @param element es el elemento que se agregó 
         */
	public void enqueue(T element){
		this.rear.setNext(new Nodo<T>(element, null));
		this.rear = rear.getNext();
		this.size++;
	}
	/**
         * eleminar de la cola 
         * @return elemento generico 
         */
	public T dequeue(){
		if(this.size == 0){
			System.out.println("Cola vacía");
			return null;
		}
		T temp = this.front.getNext().getElement();
		Nodo<T> nTemp = this.front.getNext();
		this.front.setNext(nTemp.getNext());
		if (this.rear == nTemp){
			this.rear = this.front;
		}
		this.size--;
		return temp;
	}
	/**
         * Busca el elemento que esta perimero en la cola 
         * @return un objeto este siendo nullo o el elemento consultado 
         */
	public Object first(){
		if(this.size == 0){
			System.out.println("Cola vacía");
			return null;
		}
		return this.front.getNext().getElement();
	}
	/**
         * Metodo que retorna el tamaño de la cola 
         * @return tamño de la cola 
         */
	public int size(){
		return this.size;
	}
	/**
         * limpia totalmente la cola 
         */
	public void clear(){
		this.front = new Nodo<>();
		this.rear = this.front;
		this.size = 0;
	}
	/**
         * Realia un string con la informacion definida 
         * @return string de la cola 
         */
	public String toString(){
		String result = "**Cola**\n";
		Nodo<T> tFront = this.front;
		int tSize = this.size;
		while(tSize != 0){
			result+= tFront.getNext().getElement() + " ";
			tFront = tFront.getNext();
			tSize--;
		}
		return result;
	}
    
}
