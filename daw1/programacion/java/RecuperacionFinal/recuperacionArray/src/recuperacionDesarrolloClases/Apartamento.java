package recuperacionDesarrolloClases;

public class Apartamento extends Vivienda{
	//atributos
	private int piso;
	private char puerta;
	//constructores
	/*
	 * Constructor de Apartamento
	 * @param piso
	 * @param puerta
	 */
	public Apartamento(String direccion, int metrosCuadrados, String propietario, int piso, char puerta) {
		super(direccion, metrosCuadrados, propietario);
		this.piso = piso;
		this.puerta = puerta;
	}
	//getters y setters
	/**
	 * @return the piso
	 */
	public int getPiso() {
		return piso;
	}
	/**
	 * @param piso the piso to set
	 */
	public void setPiso(int piso) {
		this.piso = piso;
	}

	/**
	 * @return the puerta
	 */
	public char getPuerta() {
		return puerta;
	}

	/**
	 * @param puerta the puerta to set
	 */
	public void setPuerta(char puerta) {
		this.puerta = puerta;
	}
	
	//métodos
	@Override
	public double calcularCuota() {
		double cuota = (getMetrosCuadrados() * 1.2d);
		return cuota;
	}
	
	@Override
	public String toString() {
		return "Piso: \n" + this.direccion + 
				"\nmetros cuadrados: " + this.metrosCuadrados + 
				"\npropietario: " + getPropietario(propietario) + 
				"\nPiso Nº: " + piso +
				"\nPuerta: " + puerta;
	}
}
