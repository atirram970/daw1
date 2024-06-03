package unidad5.cuentasBancarias;

public class Persona implements Imprimible {
	// Atributos o campos
	private String nombre;
	private String apellidos;
	private String dni;

	// Constructores
	/**
	 * Constructor con los parámetros nombre, apellidos y dni
	 * @throws CuentaBancariaDatosIncorrectosException 
	 */
	public Persona(String nombre, String apellidos, String dni) throws DatosIncorrectosPersonaException {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = this.compruebaDni(dni);
	}

	// Getters y setters
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

	// Métodos de clase
	/**
	 * Comprueba que sea un dni válido
	 * 
	 * @return dni
	 */
	private String compruebaDni(String dni) throws DatosIncorrectosPersonaException {
		String dniCap = dni.toUpperCase();
		if (dniCap.length() < 9) {
			int ceros = 9 - dniCap.length();
			for (int i = 0; i < ceros; i++) {
				dniCap = "0" + dniCap;
			}
		}
		long num = Long.parseLong(dniCap.substring(0, 8));
		final String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
		char letra = DIGITO_CONTROL.charAt((int) (num % 23));
		if (!dniCap.matches("\\d{1,8}[TRWAGMYFPDXBNJZSQVHLCKE]") || letra != dniCap.charAt(dniCap.length() - 1)) {
			throw new DatosIncorrectosPersonaException("El dni de la persona no es correcto");
		}
		return dniCap;
	}

	// toString equals...

	@Override
	public String toString() {
		return "\nNombre: " + this.nombre + " " + this.apellidos + "\nDNI: " + this.dni;
	}
	
	


	@Override
	public String devolverInfoString() {
		return this.toString();
	}
	
	public boolean equals(Persona p){
		return this.dni.equalsIgnoreCase(p.dni);
	}

	public int hashCode() {
		return this.dni.toUpperCase().hashCode();
	}
}
