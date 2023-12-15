/**
 * 
 */
package Boletin9;

import java.lang.reflect.Array;

/**
 * Constructor de la clase con parámetros
 * Los números irán del 1 al 12
 * Los palos pueden ser "oros", "espadas", "copas" y "bastos"
 * 
 * @param palo
 * @param numero
 */
public class Carta 
{
	private String numero;
	private String palo;
	
	public Carta(String palo, String numero)
	{
		if(numero < 1 || numero > 12)
		{
			throw new IllegalArgumentException("El número de la carte debe de estar entre 1 y 12");
		}
		
		if(!palo.equals("oros") && !palo.equals("espadas") && !palo.equals("copas") && !palo.equals("bastos")) 
		{
			throw new IllegalArgumentException("La carta debe de ser \"oros\" o \"espadas\" o \"copas\" o \"bastos\"");
		}
		
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
		if(!palo.equals("oros") && !palo.equals("espadas") && !palo.equals("copas") && !palo.equals("bastos")) 
		{
			throw new IllegalArgumentException("La carta debe de ser \"oros\" o \"espadas\" o \"copas\" o \"bastos\"");
		}
		
		this.palo = palo;
	}
	
	public void setNumero(String numero)
	{
		if(numero < 1 || numero > 12)
		{
			throw new IllegalArgumentException("El número de la carte debe de estar entre 1 y 12");
		}
		
		this.numero = numero;
	}

	@Override
	public String toString() 
	{
		return this.numero + " de " + ;
	}
	
	
}
