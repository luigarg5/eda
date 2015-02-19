package librerias.estructurasDeDatos.lineales;

import librerias.estructurasDeDatos.modelos.*;

/** Implementacion de una Cola de Prioridad mediante una Lista Con PI 
 * @version Febrero 2015
 * @author Luis García Gómez
  */

public class LPIColaPrioridad<E extends Comparable<E>> 
    extends LEGListaConPI<E>
    implements ColaPrioridad<E> {
    
    /** crea una Cola de Prioridad (CP) vacia */
    public LPIColaPrioridad() { super(); }
    
    /** atendiendo a su prioridad, inserta el Elemento e en una Cola de Prioridad (CP)
     *  @param e Elemento a agnadir a una Cola de Prioridad
     */
    public void insertar(E e) { 
        inicio();
        while (!esFin() && recuperar().compareTo(e) <= 0){
            siguiente();
        }
            super.insertar(e);                      
    }
    
    /** SII !esVacia(): obtiene el Elemento con maxima prioridad de una CP 
     * @return E Elemento con maxima prioridad de una CP
     */
    public E recuperarMin() { 
        inicio();
        return recuperar();
    }
    
    /** SII !esVacia(): obtiene y elimina el Elemento con maxima prioridad de una CP 
     *  @return E Elemento con maxima prioridad de una CP
     */
    public E eliminarMin() { 
        if (!esVacia()){
           inicio();
           E x = recuperar();
           eliminar();
           return x;
        }
        return null;
    }
    
    /** comprueba si una Cola de Prioridad esta vacia
      * @return true si una CP esta vacia y false en caso contrario
      */
    public boolean esVacia() { return ( super.esVacia() ); }  
}