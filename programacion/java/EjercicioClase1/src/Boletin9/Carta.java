package Boletin9;

public class Carta 
{
	private String numero;
	private String palo;
	final String[] numeros = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};

	/**
	 * Constructor de la clase con parámetros
	 * Los números irán del 1 al 12
	 * Los palos pueden ser "oros", "espadas", "copas" y "bastos"
	 * 
	 * @param palo
	 * @param numero
	 */
	public Carta(String palo, String numero) 
	{
	//		if (Arrays.binarySearch(numeros, numero) < 0) {
	//			throw new IllegalArgumentException("El número de carta es incorrecto");
	//		}
	//		if (!palo.equals("oros") && !palo.equals("espadas") && !palo.equals("bastos") && !palo.equals("copas")) {
	//			throw new IllegalArgumentException("El palo de la carta debe ser oros, espadas, copas o bastos");
	//		}
		this.palo = palo;
		this.numero = numero;
	}

	public String getPalo() 
	{
		return this.palo;
	}

	public String getNumero() 
	{
		return this.numero;
	}

	public void setPalo(String palo) 
	{
		if (!palo.equals("oros") && !palo.equals("espadas") && !palo.equals("bastos") && !palo.equals("copas")) 
		{
			throw new IllegalArgumentException("El palo de la carta debe ser oros, espadas, copas o bastos");
		}
		this.palo = palo;
	}

	public void setNumero(String numero) 
	{
		this.numero = numero;
	}

	@Override
	public String toString() 
	{
		String s = "Tipo de baraja: " + this.tipo + "\n";
		int index = 1;
		for (Carta carta : this.baraja)
		{
			if (index == 5)
			{
				s += "\n";
				index = 0;
			}
			s += "\t" + carta;
			index++;
		}
		return s;
	}
	
	
}