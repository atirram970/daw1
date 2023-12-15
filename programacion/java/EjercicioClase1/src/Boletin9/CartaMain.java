/**
 * 
 */
package Boletin9;

/**
 * 
 */
public class CartaMain
{
	public static void main(String[] args) 
	{
		//crear la baraja completa de cartas y guardarlas en un array
		Carta[] baraja = new Carta[48];
		
		Baraja b = new Baraja("española");
		
		String[] palos = {"oros", "copas", "espadas", "bastos"};
		int index = 0;
		for (String palo : palos)
		{
			for (int num = 1; num <= 12; num++)
			{
				Carta c = new Carta(palo, num);
				baraja[index++] = c;
			}
		}
		
		for (Carta carta : b.getBaraja())
		{
			System.out.println(carta);
		}
	}
}