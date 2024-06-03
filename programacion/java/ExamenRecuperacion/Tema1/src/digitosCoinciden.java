import java.util.Scanner;

public class digitosCoinciden 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int numUsu = scan.nextInt();
		System.out.println("Introduce el dígito a buscar");
		int numBuscar = scan.nextInt();
		
		int numCoinciden = 0;
		int numMultiplica = 10;
		
		
		do
		{
			int resto = numUsu % numMultiplica;
			
			if(numBuscar == resto)
			{
				numCoinciden += 1;
			}
			
			numMultiplica *= 10;
		}
		while(numMultiplica>=numUsu);
	}

}
