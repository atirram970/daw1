package Boletin9;

public class CartaMain 
{

	public static void main(String[] args) 
	{

		// Crear la baraja completa de cartas y guardarlas en un array
		Baraja b = new Baraja("francesa");
		
		for (Carta carta : b.getBaraja()) 
		{
			System.out.println(carta);
		}
		System.out.println("*******************MEZCLANDO**********************");
		MetodoBaraja.mezclarBaraja(b);
		for (Carta carta : b.getBaraja()) 
		{
			System.out.println(carta);
		}
	}
}