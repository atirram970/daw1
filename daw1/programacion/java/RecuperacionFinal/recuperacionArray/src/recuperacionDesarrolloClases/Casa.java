package recuperacionDesarrolloClases;

public class Casa extends Vivienda{
	//atributos
	private boolean piscina;
	private boolean jardin;
	//constructor
	/**
	 * 
	 */
	public Casa(String direccion, int metrosCuadrados, String propietario, boolean piscina, boolean jardin) {
		super(direccion, metrosCuadrados, direccion);
		this.piscina = piscina;
		this.jardin = jardin;
	}
	
	//métodos
		public double calcularCuota() {
			double cuota = 0;
			
			//comprobamos si tiene piscina, jardin o ambos
			if(this.piscina == true && this.jardin == true) {
				cuota = (getMetrosCuadrados() * 1.5d) + 45d;
			}
			else if(this.piscina == true) {
				cuota = (getMetrosCuadrados() * 1.5d) + 30d;
			}
			else if(this.jardin == true) {
				cuota = (getMetrosCuadrados() * 1.5d) + 30d;
			}
			else {
				cuota = (getMetrosCuadrados() * 1.5d);
			}
			return cuota;
		}
		
		@Override
		public String toString() {
			return "Casa: \n" + this.direccion + 
					"\nmetros cuadrados: " + this.metrosCuadrados + 
					"\npropietario: " + getPropietario(propietario) + 
					"\nPiscina: " + piscina +
					"\nJardín: " + jardin;
		}
}
