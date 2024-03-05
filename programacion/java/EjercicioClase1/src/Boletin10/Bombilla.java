package Boletin10;

import java.util.Objects;

public class Bombilla 
{
	private String marca;
	private Double potencia;
	private Boolean encendida;
	private Double precio;
	
	//constructor
	/*
	 * Constructor
	 * @param marca
	 * @param potencia
	 * @param encendida
	 * @param precio
	 * */
	
	public Bombilla ()
	{
		this.marca = "";
		this.potencia = 0d;
		this.precio = 0d;
		this.encendida = false;
	}
	
	/*public Bombilla (String marca, Double potencia, Double precio)
	{
		this.marca = marca;
		this.potencia = potencia;
		this.precio = precio;
		this.encendida = Boolean.FALSE;
	}*/
	
	/**
	 * @param encendida the encendida to set
	 */
	public void setEncendida(Boolean encendida) {
		this.encendida = encendida;
	}

	/**
	 * @return the potencia
	 */
	public Double getPotencia() {
		return potencia;
	}

	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}

	/**
	 * @return the precio
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	/**
	 * @return the encendida
	 */
	public Boolean getEncendida() {
		return encendida;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
		
	
	public void encender()
	{
		this.encendida = Boolean.TRUE;
	}
		
	public void apagar()
	{
		this.encendida = Boolean.FALSE;
	}

	@Override
	public String toString() {
		String estado = this.encendida?"Encendida":"Apagada";
		return "Bombilla [marca=" + marca + ", potencia=" + potencia + " w, precio=" + precio + " €. " + estado + "]";
	}

	@Override
	public boolean equals(Object bombilla) {
		boolean equals = false;
		Bombilla aux = new Bombilla();
		if (bombilla instanceof Bombilla)
		{
			aux = ((Bombilla) bombilla);
			equals = this.marca.equals(aux.getMarca()) && this.potencia == aux.getPotencia();
		}
		return equals;	
	}
	
	
}