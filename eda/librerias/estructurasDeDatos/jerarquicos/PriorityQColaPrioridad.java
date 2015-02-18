package librerias.estructurasDeDatos.jerarquicos;

import librerias.estructurasDeDatos.modelos.*;
/*COMPLETAR*/

/** Implementacion de una Cola de Prioridad mediante una PriorityQueue (Heap) 
 * @version Febrero 2015
 * @author Luis García Gómez
  */

public class PriorityQColaPrioridad</*COMPLETAR*/> 
    extends /*COMPLETAR*/
    implements /*COMPLETAR*/ {

    
    /** crea una Cola de Prioridad (CP) vacia */
    public PriorityQColaPrioridad() { /*COMPLETAR*/ }
    
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