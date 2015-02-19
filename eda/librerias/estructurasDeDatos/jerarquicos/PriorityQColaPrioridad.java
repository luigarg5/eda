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
    public PriorityQColaPrioridad() { super(0); }
    
    /** atendiendo a su prioridad, inserta el Elemento e en una Cola de Prioridad (CP)
     *  @param e Elemento a agnadir a una Cola de Prioridad
     */
    public void insertar(E e) { /*COMPLETAR*/ }
    
    /** SII !esVacia(): obtiene el Elemento con maxima prioridad de una CP 
     * @return E Elemento con maxima prioridad de una CP
     */
    public E recuperarMin() { /*COMPLETAR*/ }
    
     /** SII !esVacia(): obtiene y elimina el Elemento con maxima prioridad de una CP 
     *  @return E Elemento con maxima prioridad de una CP
     */
    public E eliminarMin() { /*COMPLETAR*/  }
    
    /** comprueba si una Cola de Prioridad esta vacia
      * @return true si una CP esta vacia y false en caso contrario
      */
    public boolean esVacia() { /*COMPLETAR*/ }
}