package Boletin9;

public class Baraja 
{
	private String tipo;
	private Carta[] baraja;
	final String[] palosEspaniola = {"oros", "copas", "espadas", "bastos"};
	final String[] palosFrancesa = {"corazones", "picas", "diamantes", ""};
	final String[] numerosEspaniola = {"1", "2", "3", "4", "5", "6", "7", "8"};
	final String[] numerosFrancesa = {"2", "3", "4", "5", "6", "7", "8"};
	
	
	public Baraja(String tipo)
	{
		this.tipo = tipo;
		
		if(tipo.equalsIgnoreCase("española"))
		{
			this.baraja
			int index = 0;
			for (String palo : palosEspaniola)
			{
				for (int num = 1; num <= 12; num++)
				{
					Carta c = new Carta(palo, num);
					this.baraja[index++] = c;
				}
			}
		}
		
		
		
		if(tipo.equalsIgnoreCase("francesa"))
		{
			
		}
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the baraja
	 */
	public Carta[] getBaraja() {
		return baraja;
	}

	/**
	 * @param baraja the baraja to set
	 */
	public void setBaraja(Carta[] baraja) {
		this.baraja = baraja;
	}
	
	
	
}
