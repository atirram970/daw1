package Boletin9;

public class bingo 
{
	static int[] numeros = new int[15];
	static int[][] carton = new int[3][9];
	
	public static void main(String[] args) 
	{
		 int contador = 0;
		
		 while (contador < 15) 
		 {
			int numero = (int) (Math.random() * 90 + 1);
			if (!repetido(numero) && !tresDecena(numero))
			{
				numeros[contador++] = numero;
			}
		 }
		 
		 int fila1 = 0;
		 int fila2 = 0;
		 int fila3 = 0;
		 for (int num : numeros)
		 {
			 int columna = num/10;
			 for (int i = 0; i < 3; i++)
			 {
				 for (int j = 0; j < 9; j++)
				 {
					 if (carton[i][columna] == 0)
					 {
						 carton[i][columna] = num;
					 }
				 }
			 }
		 }
		 
		 for (int i : numeros)
		 {
			 System.out.println(i + ",");
		 }
		 
		 for (int i = 0; i < 3; i++)
		 {
			 for (int j = 0; j < 9; j++)
			 {
				 System.out.println( );
			 }
		 }
	}

	private static boolean tresDecena(int numero) 
	{
		boolean triplicado = false;
		int index = 0;
		int repeticiones = 0;
		int decena = (numero/10);
		
		while (repeticiones < 3 && index < numeros.length) 
		{
			
			if (numeros[index]/10 == decena)
			{
				repeticiones++;
			}
			if (repeticiones > 3)
			{
				triplicado = true;
			}
			index++;
		}
		return triplicado;
	}

	private static boolean repetido(int numero) 
	{
		boolean encontrado = false;
		int index = 0;
		while (!encontrado && index < numeros.length)
		{
			if (numeros[index ++] == numero)
			{
				encontrado = true;
			}
		}
		return encontrado;
	}
}
