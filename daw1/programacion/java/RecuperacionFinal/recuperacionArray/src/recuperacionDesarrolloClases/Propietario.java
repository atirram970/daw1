package recuperacionDesarrolloClases;

public class Propietario {
	//atributos
	private String nombreCompleto;
	private String dni;
	//constructor
	/**
	 * @param nombreCompleto
	 * @param dni
	 */
	public Propietario(String nombreCompleto, String dni) {
		this.nombreCompleto = nombreCompleto;
		this.dni = dni;
	}
	
	//getters y setters
	/**
	 * @return the nombreCompleto
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	/**
	 * @param nombreCompleto the nombreCompleto to set
	 */
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
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
	
	//métodos
	public String toString() {
		// TODO Auto-generated method stub
		return "Propietario: " + 
				"\nNombre: " + nombreCompleto + 
				"\nDNI: " + dni;
	}
}
