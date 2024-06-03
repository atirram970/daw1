/**
 * 
 */
package vehiculos;

/**
 * 
 */
public abstract class Vehiculo {
	private static int vehiculosCreados = 0;
	public static double kilometrosTotales = 0d;
	private double kilometrosRecorridos;
	
	/**
	 * Constructor sin parámetros
	 */
	public Vehiculo() {
		this.kilometrosRecorridos = 0d;
		setVehiculosCreados(getVehiculosCreados() + 1);
	}
	//Getters and setters
	/**
	 * @return the kilometrosRecorridos
	 */
	public double getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	/**
	 * @param kilometrosRecorridos the kilometrosRecorridos to set
	 */
	public void setKilometrosRecorridos(double kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}
	// Métodos de clase
	public void andar(double distanciaRecorrida) {
		this.kilometrosRecorridos += distanciaRecorrida;
		kilometrosTotales += distanciaRecorrida;
	}
	public double verKilometraje() {
		return kilometrosTotales;
	}
	public static int getVehiculosCreados() {
		return vehiculosCreados;
	}
	public static void setVehiculosCreados(int vehiculosCreados) {
		Vehiculo.vehiculosCreados = vehiculosCreados;
	}
}