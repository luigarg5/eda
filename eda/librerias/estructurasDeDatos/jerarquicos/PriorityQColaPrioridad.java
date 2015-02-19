package librerias.estructurasDeDatos.jerarquicos;

import librerias.estructurasDeDatos.modelos.*;
import java.util.PriorityQueue;

/** Implementacion de una Cola de Prioridad mediante una PriorityQueue (Heap) 
 * @version Febrero 2015
 * @author Luis García Gómez
  */

 //Tiene que ser comparable, hereda de java.util.PriorityQueue e implementa ColaPrioridad.
public class PriorityQColaPrioridad<E extends Comparable<E> >
    extends PriorityQueue<E>
    implements ColaPrioridad<E> {

    /*Sacado de la API de PriorityQueue.
     * Usaremos el PriorityQueue(int initialCapacity) del padre para ponerle 0 elementos.
     * Creates a PriorityQueue with the specified initial capacity that orders its elements
     * according to their natural ordering.*/
     
    /** crea una Cola de Prioridad (CP) vacia */
    public PriorityQColaPrioridad() { 
        
        //Llamada explicita al constructor del padre.
        //super(0);   //Puede que de error. DA ERROR!!!
        
        //Versión alternativa con el constructor por defecto del padre que crea Cola con 11 elementos.
        //Luego se borran con el clear() del padre.
        //Llamada implicita al constructor del padre.
        
        //Recordemos que super() no se usa para invocar a los metodos heredados!!!
        super();
        this.clear();
    }   
    
    /** atendiendo a su prioridad, inserta el Elemento e en una Cola de Prioridad (CP)
     *  @param e Elemento a agnadir a una Cola de Prioridad
     */
    public void insertar(E e) { 
        /*add(E e) Inserts the specified element into this priority queue.*/
         
        this.add(e); }
    
    /** SII !esVacia(): obtiene el Elemento con maxima prioridad de una CP 
     * @return E Elemento con maxima prioridad de una CP
     */
    public E recuperarMin() { 
        /* peek() Retrieves, but does not remove, the head of this queue,
         * or returns null if this queue is empty.*/
         
         return this.peek();
    }
    
     /** SII !esVacia(): obtiene y elimina el Elemento con maxima prioridad de una CP 
     *  @return E Elemento con maxima prioridad de una CP
     */
    public E eliminarMin() {
        /* poll() Retrieves and removes the head of this queue,
         * or returns null if this queue is empty.*/
         
         return this.poll();
          }
    
    /** comprueba si una Cola de Prioridad esta vacia
      * @return true si una CP esta vacia y false en caso contrario
      */
    public boolean esVacia() {
        /*size() Returns the number of elements in this collection.*/
         return this.size() == 0;
    }
}