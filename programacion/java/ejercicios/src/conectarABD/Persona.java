package conectarABD;

public class Persona implements Comparable<Persona> {
	private String dni;
	private String nombre;
	private String apellidos;

	public Persona(String nombre, String apellidos, String dni) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Persona)) {
			return false;
		}
		Persona other = (Persona) obj;
		if (dni == null) {
			if (other.dni != null) {
				return false;
			}
		} else if (!dni.equals(other.dni)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Persona otraPersona) {
		// Comparamos por apellidos y luego por nombre
		int comparacionApellidos = this.apellidos.compareTo(otraPersona.apellidos);
		if (comparacionApellidos == 0) {
			// Si los apellidos son iguales, comparamos por nombre
			comparacionApellidos = this.nombre.compareTo(otraPersona.nombre);
		}

		return comparacionApellidos;
	}

	@Override
	public String toString() {
		return "Persona[" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ']';
	}
}
