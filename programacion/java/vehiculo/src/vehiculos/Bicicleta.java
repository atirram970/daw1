package vehiculos;

public class Bicicleta extends Vehiculo {
	private String marca;
	private String modelo;
	//Contructores
	public Bicicleta() {
		super();
		this.marca = "";
		this.modelo = "";
	}
	public Bicicleta(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
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

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	//Métodos de clase
	public void hacerCaballito(double distanciaRecorrida) {
		this.andar(distanciaRecorrida);
	}
	
}