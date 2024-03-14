package examen;

public class bingo 
{

	public static void main(String[] args) 
	{
		//numero aleatorio
		int numAleatorio = 0;
		int numAleatorioAuxiliar = 0;
		//array bidimensional para el carton del bingo
		int[][] carton = new int[9][3];
		
		//introducir numero aleatorio en carton
		for (int columnas = 0; columnas < 3; columnas++) 
		{
			for (int filas = 0; filas < 9; filas++) 
			{				
				while (numAleatorio == numAleatorioAuxiliar)
				{
					numAleatorio = (int) (Math.random() * (90 - 1 + 1) + 1);
					numAleatorioAuxiliar = numAleatorio;
				}
				
				carton[filas][columnas] = numAleatorio;
			}
		}
		
		
		
		//mostrar carton
		System.out.println("Cartón de Bingo: ");
		System.out.println("-----------------------------------------------------------------------------");
		
		for (int columnas = 0; columnas < 3; columnas++) 
		{
			for (int filas = 0; filas < 9; filas++) 
			{
				System.out.print(carton[filas][columnas] + "\t");
			}
			System.out.println("\n");
		}
		
		System.out.println("-----------------------------------------------------------------------------");
	}

}