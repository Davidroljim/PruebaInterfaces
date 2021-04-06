package clases;

public class Persona {
	
	private Integer edad;
	private String nombre;
	private String dni;
	/**
	 * 
	 */
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param edad
	 * @param nombre
	 * @param dni
	 */
	public Persona(Integer edad, String nombre, String dni) {
		this.edad = edad;
		this.nombre = nombre;
		this.dni = dni;
	}
	/**
	 * @return the edad
	 */
	public Integer getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
}