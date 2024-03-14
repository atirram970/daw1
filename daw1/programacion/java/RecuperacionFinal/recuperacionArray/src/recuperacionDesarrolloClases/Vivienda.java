package recuperacionDesarrolloClases;

public abstract class Vivienda implements Hipotecable{
	//atributos
	protected String direccion;
	protected int metrosCuadrados;
	protected String propietario;
	
	//constructor
	/**
	 * @param direccion
	 * @param metrosCuadrados
	 * @param propietario
	 */
	public Vivienda(String direccion, int metrosCuadrados, String propietario) {
		this.direccion = direccion;
		this.metrosCuadrados = metrosCuadrados;
		this.propietario = getPropietario(propietario);
	}
	//getters y setters
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the metrosCuadrados
	 */
	public int getMetrosCuadrados() {
		return metrosCuadrados;
	}

	/**
	 * @param metrosCuadrados the metrosCuadrados to set
	 */
	public void setMetrosCuadrados(int metrosCuadrados) {
		this.metrosCuadrados = metrosCuadrados;
	}

	/**
	 * @param propietario 
	 * @return the propietario
	 */
	public String getPropietario(String propietario) {
		return propietario;
	}

	/**
	 * @param propietario the propietario to set
	 */
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	
	//métodos
	@Override
	public String toString() {
		return "Vivienda: \n" + direccion + 
				"\nmetros cuadrados: " + metrosCuadrados + 
				"\npropietario: " + propietario;
	}
	
	public abstract double calcularCuota();
}
