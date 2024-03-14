package vehiculos;

public class Coche extends Vehiculo {
	private int cilindrada;
	//Contructores
	public Coche() {
		super();
		this.cilindrada = 0;
	}
	public Coche(int cilindrada) {
		super();
		this.cilindrada = cilindrada;
	}
	
	/**
	 * @return the cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}
	/**
	 * @param cilindrada the cilindrada to set
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	//Métodos de clase
	public void quemarRueda(double distanciaRecorrida) {
		this.andar(distanciaRecorrida);
	}
	
}