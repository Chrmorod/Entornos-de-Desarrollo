/**
 * Clase Estudiante
 * 
 * Contiene info del estudiante
 * @author Christian
 * @version 1.0
 */
public class Estudiante {
	//Atributos
	/**
	 * Nombre del Estudiante
	 */
	private String nombre;
	/**
	 * Apellidos del Estudiante
	 */
	private String apellidos;
	/**
	 * Identificación del Estudiante
	 */
	private String id;
	/**
	 * Edad del Estudiante
	 */
	private int edad;
	/**
	 * Creditos del Estudiante
	 */
	private double creditos;
	//Constructor de la clase
	/**
	 * Constructor con 5 parametros
	 * @param nombreEst nombre del estudiante
	 * @param apellidosEst apellidos del estudiante
	 * @param idEst identificación del estudiante
	 * @param edadEst edad del estudiante
	 * @param creditosEst creditos del estudiante
	 */
	public Estudiante(String nombreEst, String apellidosEst, String idEst, int edadEst, double creditosEst) {
		nombre=nombreEst;
		apellidos=apellidosEst;
		id=idEst;
		edad=edadEst;
		creditos=creditosEst;
	}
	//Métodos públicos
	/**
	 * Método setter, establece nombre estudiante.
	 * @param nombre nombre del estudiante a establecer
	 * 
	 */
	public void setNombre(String nombre){
	    this.nombre=nombre;
	}
	/**
	 * Método getter, devuelve el nombre del estudiante.
	 * @return nombre del estudiante
	 */
	public String getNombre(){
	    return nombre;
	}
	/**
	 * Método setter, establece los apellidos del estudiante.
	 * @param apellidos apellidos del estudiante a establecer
	 */
	public void setApellidos(String apellidos){
	    this.apellidos=apellidos;
	}
	/**
	 * Método setter, devuelve los apellidos estudiante.
	 * @return apellidos del estudiante
	 */
	public String getApellidos(){
	    return apellidos;
	}
	/**
	 * Método setter, establece la identifiación al estudiante.
	 * @param id identificación del estudiante a establecer
	 */
	public void setId(String id){
	    this.id=id;
	}
	/**
	 * Método getter, devuelve la identificación del estudiante.
	 * @return identificación del estudiante
	 */
	public String getId(){
	    return id;
	}
	/**
	 * Método setter, establece la edad actual del estudiante.
	 * @param edad edad del estudiante a establecer
	 */
	public void setEdad(int edad){
	    this.edad=edad;
	}
	/**
	 * Método getter, devuelve la edad actual del estudiante.
	 * @return edad del estudiante actual
	 */
	public int getEdad(){
	    return edad;
	}
	/**
	 * Método sumarCreditos, acumula creditos por cada trimestre.
	 * @param creditos creditos actuales del estudiante
	 * @param creditostotal2 creditos del siguiente trimestre del estudiante
	 */
	public void sumarCreditos(int creditos, int creditostotal2 )
	{
	    creditos+=creditostotal2;
	}
	/**
	 * Método setter, para establecer creditos al estudiante.
	 * @param creditos creditos del estudiante a establecer
	 */
	public void setCreditos(double creditos) {
		this.creditos=creditos;
	}
	/**
	 * Método getter, devuelve los creditos actuales del estudiante. 
	 * @return creditos del estudiante actual
	 */
	public double getCreditos()
	{
	    return creditos;
	}
}
