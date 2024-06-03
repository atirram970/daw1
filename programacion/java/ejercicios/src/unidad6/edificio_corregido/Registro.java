package unidad6.edificio_corregido;

import java.util.Date;

public class Registro {
	/**
	 * información de la persona del registro e/s
	 */
	private Persona persona;
	/**
	 * fecha en la que se produce el registro de e/s
	 */
	private Date fecha;
	/**
	 * tipo de registro: true=entrada; false=salida
	 */
	private boolean entrada;

	/**
	 * @param persona
	 * @param fecha
	 * @param entrada
	 */
	public Registro(Persona persona, Date fecha, boolean entrada) {
		super();
		this.persona = persona;
		this.fecha = fecha;
		this.entrada = entrada;
	}

	/**
	 * @return the persona
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the entrada
	 */
	public boolean isEntrada() {
		return entrada;
	}

	/**
	 * @param entrada the entrada to set
	 */
	public void setEntrada(boolean entrada) {
		this.entrada = entrada;
	}

}
