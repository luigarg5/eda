package aplicaciones.hospital;

/**
 * La clase Paciente representa una version muy simplificada de la 
 * ficha de admision de un paciente en un hospital. 
 * 
 * El estado del paciente se representa como un entero entre 0 y 6, 
 * representando el 6 un paciente sano y 0 un paciente fallecido. 
 * Los estados, se han etiquetado como: fallecido, critico, grave, 
 * moderado, leve, muy leve y sano.
 *
 * @version Febrero 2015
 * @author Luis García Gómez
 */

public class Paciente implements Comparable<Paciente>  {
    private String nombre;
    private int edad, estado;
    private long tpoLlegadaUrgencias;
 
    public static final int SANO      = 6;
    public static final int MUY_LEVE  = 5;
    public static final int LEVE      = 4;
    public static final int MODERADO  = 3;    
    public static final int GRAVE     = 2;
    public static final int CRITICO   = 1;
    public static final int FALLECIDO = 0;
    private static final String[] NOMBRE_ESTADO = {"fallecido", "critico", "grave", "moderado", "leve", "muy leve", "sano"};
    
    /** Constructor de un Paciente
     *  @param n  Nombre del paciente
     *  @param ed Edad del paciente
     *  @param es Estado del paciente
     */
    public Paciente(String nombre, int edad, int estado) {        
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        tpoLlegadaUrgencias = 0;
    }
    
    /** Constructor aleatorio de un Paciente
     *  @param n  Nombre del paciente
     */
    public Paciente(String n) {
        this(n, (int) (Math.random() * 101), (int) (Math.random() * 5 + 1));
    }
        
    /** Consultor del estado del paciente
     *  @return Estado del paciente
     */
    public int getEstado() { 
        return estado; 
    }    
    
    /** Consultor del estado de un paciente como cadena de texto
     *  @return String que indica el estado del paciente
     */
    public String getDescripcionEstado() { 
        return NOMBRE_ESTADO[estado];
    }
    
    /** Consultor del nombre de un paciente
     *  @return Nombre del paciente
     */
    public String getNombre() { 
        return nombre; 
    }
    
    /** Consultor de la edad de un paciente
     *  @return Edad del paciente
     */
    public int getEdad() { 
        return edad; 
    }
    
    /** Consultor del tiempo de llegada a urgencias de un paciente
     *  @return Instante de tiempo en el que el paciente llego a urgencias
     */
    public long getTpoLlegadaUrgencias() {
        return tpoLlegadaUrgencias;
    }
    
    /**
     * Modifica el tiempo de llegada a urgencias de un paciente
     * @param  tpo Nuevo instante de llegada a urgencias del paciente
     */
    public void setTpoLlegadaUrgencias(long tpo) {        
        tpoLlegadaUrgencias = tpo;
    }
    
    /** Aplica una cura a un paciente, de forma que:
     *  El 95% de las veces la cura surte efecto y el paciente mejora un grado
     *  El 5% de las veces el paciente no responde y fallece
     *  @return true si la cura surte efecto, false si el paciente fallece
     */
    public boolean aplicarCura() {
        if (Math.random() < 0.05) estado = 0; // fallece
        else estado++;                        // mejora
        return estado > 0;
    }
    
   /**
     * Establece si un paciente debe ser atendido con mayor prioridad que otro, en base a su estado de gravedad 
     *  - siendo el estado de gravedad mayor el 1 y el menor el 5, pues se obvia el caso de pacientes fallecidos 
     * Cuando el estado de gravedad de ambos pacientes es el mismo, se atiende a los nignos (<15 agnos), cuanto  
     * mas pequegnos antes, y luego a los ancianos (>65 agnos), cuanto mayores antes.
     * 
     * NOTA: este metodo NO ES CONSISTENTE con equals, ya que su finalidad es diferente.
     * 
     * @param  otro  Paciente
     * @return int igual a 0 si uno y otro paciente tienen la misma prioridad, menor que 0 si un 
     *         paciente tiene mayor prioridad que otro y mayor que 0 en caso contrario
     */
    public int compareTo(Paciente otro) { 
        if (this.estado < otro.estado) return -1;
        if (this.estado > otro.estado) return 1;
        
        //Vamos a comparar dos pacientes con el mismo estado.
        //Primero si alguno de los dos pacientes es un niño.
        if (this.edad < 15 || otro.edad < 15){
            int x = this.edad - otro.edad;
            if (x < 0) return -1;
                else if (x > 0) return 1;
                else return 0;
        }
         //Ahora si alguno de los dos pacientes es un anciano
         if (this.edad > 65 || otro.edad > 65){
             int x= this.edad - otro.edad;
             if (x < 0) return 1;
                else if ( x >0) return -1;
                else return 0;
         }
         
         /*Si no se cumple lo de arriba sabemos que son iguales
           por lo que insertaremos detrás de otro.*/
         return 0;
        }
    /** Devuelve un String con los datos del paciente.
     *  @return Cadena de texto que describe al paciente actual
     */   
    public String toString() { 
        return "Paciente: " + nombre + ", " + edad + " agnos, estado:" + estado + "\n";
    }
    
    /**
     * Comprueba si un paciente es igual a otro, esto es si sus nombres coinciden
     * @param  otro  Paciente
     * @return true si ambos pacientes tienen el mismo nombre y false en caso contrario
     */
    public boolean equals(Object otro) { 
        return otro instanceof Paciente &&((Paciente) otro).nombre.equals(this.nombre);
    }             
}
